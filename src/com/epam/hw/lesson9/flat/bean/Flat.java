package com.epam.hw.lesson9.flat.bean;

import java.io.Serializable;
import java.util.Objects;

public class Flat implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int number;
	private double area;
	private int floor;
	private int roomNumber;
	private String street;
	private String buildingType;
	private int lifetime;
	
	public Flat() {}
	
	public Flat(int number, double area, int floor, int roomNumber, String street,
			String buildingType, int lifetime)
	{
		this.number = number;
		this.area = area;
		this.floor = floor;
		this.roomNumber = roomNumber;
		this.street = street;
		this.buildingType = buildingType;
		this.lifetime = lifetime;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}
	
	public int getFloor()
	{
		return floor;
	}
	
	public void setFloor(int floor)
	{
		this.floor = floor;
	}
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber)
	{
		this.roomNumber = roomNumber;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public String getBuildingType()
	{
		return buildingType;
	}
	
	public void setBuildingType(String buildingType)
	{
		this.buildingType = buildingType;
	}
	
	public int getLifetime()
	{
		return lifetime;
	}
	
	public void setLifetime(int lifetime)
	{
		this.lifetime = lifetime;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(area, buildingType, floor, lifetime, number, roomNumber, street);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flat other = (Flat) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(buildingType, other.buildingType) && floor == other.floor
				&& lifetime == other.lifetime && number == other.number && roomNumber == other.roomNumber
				&& Objects.equals(street, other.street);
	}

	@Override
	public String toString()
	{
		return "Flat [number=" + number + ", area=" + area + ", floor=" + floor + ", roomNumber=" + roomNumber
				+ ", street=" + street + ", buildingType=" + buildingType + ", lifetime=" + lifetime + "]";
	}
}
