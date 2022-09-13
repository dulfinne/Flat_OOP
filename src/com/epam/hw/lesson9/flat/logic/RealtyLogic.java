package com.epam.hw.lesson9.flat.logic;

import java.util.ArrayList;
import java.util.List;

import com.epam.hw.lesson9.flat.bean.Flat;
import com.epam.hw.lesson9.flat.bean.Realty;

public class RealtyLogic
{
	public List<Flat> byRoom(Realty realty, int roomNumber)
	{
		 List<Flat> flatsByRoom = new ArrayList<>();
	     List<Flat> flats = realty.getFlats();

	        for (Flat flat : flats) 
	        {
	            if (flat.getRoomNumber() == roomNumber) 
	            {
	                flatsByRoom.add(flat);
	            }
	        }
	        
	        return flatsByRoom;
	}
	
	
	public List<Flat> byFloor(Realty realty, int startFloor, int endFloor)
	{
		List<Flat> flatsByFloor = new ArrayList<>();
		List<Flat> flats = realty.getFlats();

        for (Flat flat : flats)
        {
            if (flat.getFloor() >= startFloor && flat.getFloor() <= endFloor)
            {
                flatsByFloor.add(flat);
            }
        }
        
        return flatsByFloor;
	}
	
	public List<Flat> byFloor(List<Flat> flats, int startFloor, int endFloor)
	{
		List<Flat> flatsByFloor = new ArrayList<>();

        for (Flat flat : flats)
        {
            if (flat.getFloor() >= startFloor && flat.getFloor() <= endFloor)
            {
                flatsByFloor.add(flat);
            }
        }
        
        return flatsByFloor;
	}
	
	public List<Flat> byArea(Realty realty, double area)
	{
		List<Flat> flatsByArea = new ArrayList<>();
		List<Flat> flats = realty.getFlats();

	    for (Flat flat : flats)
	    {
	    	if (flat.getArea() > area)
	    	{
	                flatsByArea.add(flat);
	        }
	    }
	    
	    return flatsByArea;
	}
}
