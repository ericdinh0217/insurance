package com.synex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synex.modal.Address;
import com.synex.modal.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController 
{

	private List<Student> students = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();
	
    @GetMapping("/getStudents")
    public List<Student> getAllStudents() 
    {
         students = Arrays.asList(
                new Student(1, "John Doe", 20),
                new Student(2, "Jane Smith", 22),
                new Student(3, "Bob Johnson", 21)
        );
        return students;
    }

    @GetMapping("/getAddresses")
    public List<Address> getAllAddresses() 
    {
        addresses = Arrays.asList(
                new Address(123, "Sample City", "Sample Province", "Sample Country", 1234567890),
                new Address(456, "Another City", "Another Province", "Another Country", 1987654321),
                new Address(789, "Yet Another City", "Yet Another Province", "Yet Another Country", 1112223333)
        );
        return addresses;
    }
    
    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }

    @PostMapping("/addAddress")
    public void addAddress(@RequestBody Address address) {
        addresses.add(address);
    }
}
