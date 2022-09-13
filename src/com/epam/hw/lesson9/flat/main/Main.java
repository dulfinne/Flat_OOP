package com.epam.hw.lesson9.flat.main;

import java.util.List;

import com.epam.hw.lesson9.flat.bean.Flat;
import com.epam.hw.lesson9.flat.bean.Realty;
import com.epam.hw.lesson9.flat.logic.RealtyLogic;
import com.epam.hw.lesson9.flat.view.RealtyOutput;

public class Main
{
	public static void main(String[] args)
	{
		RealtyOutput output = new RealtyOutput();
		RealtyLogic logic = new RealtyLogic();
		
		Realty realty = new Realty();
		
		Flat flat1 = new Flat (34, 52.4, 7, 2, "Терехина 9", "панельный", 7);
		Flat flat2 = new Flat (1, 168.7, 1, 5, "Азерина 28", "кирпичный", 15);
		Flat flat3 = new Flat (142, 43.8, 4, 2, "Ударников 56", "кирпичный", 2);
		Flat flat4 = new Flat (56, 83, 3, 4, "Ленина 7", "кирпичный", 22);
		Flat flat5 = new Flat (13, 28.1, 5, 2,"Гоголя 4", "панельный", 4);
		
		realty.add(flat1);
		realty.add(flat2);
		realty.add(flat3);
		realty.add(flat4);
		realty.add(flat5);
				
		final String FLAT_TITLE = " Номер квартиры |\tПлощадь\t|\tЭтаж\t| Кол-во комнат |\tУлица\t\t|\tТип здания\t|Срок эксплуатации\t";
		output.printAsTable(FLAT_TITLE, realty.getFlats());
		
		System.out.println("Список квартир по заданному количеству комнат:");
		output.printAsTable(FLAT_TITLE, logic.byRoom(realty, 2));
		
		System.out.println("Список квартир по заданному количеству комнат и этажу:");
		output.printAsTable(FLAT_TITLE, logic.byFloor(logic.byRoom(realty, 2), 3, 5));

		System.out.println("Список квартир по заданной площади:");
		output.printAsTable(FLAT_TITLE, logic.byArea(realty, 50));
	}
	
}
