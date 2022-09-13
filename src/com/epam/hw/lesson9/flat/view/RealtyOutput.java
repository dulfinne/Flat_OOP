package com.epam.hw.lesson9.flat.view;

import java.util.List;

import com.epam.hw.lesson9.flat.bean.Flat;
import com.epam.hw.lesson9.flat.bean.Realty;

public class RealtyOutput
{
	public void printAsTable(String title, List<Flat> flats)
	{
		System.out.println(title);

		for(int i = 0; i < flats.size(); i++)
		{
			System.out.printf("\t%3d\t|\t%4.2f\t|\t%2d\t|\t%2d\t|\t%15s\t|\t%15s\t|\t%3d\n", flats.get(i).getNumber(), flats.get(i).getArea(),
					flats.get(i).getFloor(), flats.get(i).getRoomNumber(), flats.get(i).getStreet(), flats.get(i).getBuildingType(),
					flats.get(i).getLifetime());
		}
		
		System.out.println();
	}
}
