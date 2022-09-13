package com.epam.hw.lesson9.flat.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Realty implements Serializable
{
	private static final long serialVersionUID = 1L;

	private List<Flat> flats;
	
	public Realty()
	{
		flats = new ArrayList<Flat>();
	}
	
	public Realty(List<Flat> flats)
	{
		this.flats = flats;
	}

	public List<Flat> getFlats()
	{
		return flats;
	}

	public void setFlats(List<Flat> flats)
	{
		this.flats = flats;
	}
	
	public void add(Flat flat)
	{
		flats.add(flat);
	}
	
	public void delete(Flat flat)
	{
		flats.remove(flat);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(flats);
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
		Realty other = (Realty) obj;
		return Objects.equals(flats, other.flats);
	}

	@Override
	public String toString()
	{
		return "Realty [flats=" + flats + "]";
	}
}
