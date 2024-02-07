package com.synex.modal;

public class Address
{
	public int houseNo;
	public String city;
	public String province;
	public String country;
	public int phoneNumber;
	
	public Address(int houseNo, String city, String province, String country, int phoneNumber)
	{
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.province = province;
		this.country = country;
		this.phoneNumber = phoneNumber;
	}
	
	public int getHouseNo()
	{
		return houseNo;
	}
	public void setHouseNo(int houseNo)
	{
		this.houseNo = houseNo;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getProvince()
	{
		return province;
	}
	public void setProvince(String province)
	{
		this.province = province;
	}
	public String getCountry()
	{
		return this.country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public int getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString()
	{
		return "Address [houseNo=" + houseNo + ", city=" + city + ", province=" + province + ", Country=" + this.country
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
