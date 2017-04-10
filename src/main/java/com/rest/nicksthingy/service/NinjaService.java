package com.rest.nicksthingy.service;

import com.rest.nicksthingy.model.Message;
import com.rest.nicksthingy.model.Ninja;

import java.util.ArrayList;
import java.util.List;

 /**************************************************
 ** Created by Nicholas on 4/9/2017.              **
 **************************************************/
public class NinjaService
{
	private List<Ninja> ninjas;
	private static NinjaService instance;

	private NinjaService()
	{
		ninjas = new ArrayList<Ninja>();
		ninjas.add(new Ninja("bill"));
		ninjas.add(new Ninja("bob"));
	}

	public static NinjaService getInstance()
	{
		if (instance == null)
		{
			instance = new NinjaService();
		}
		return instance;
	}


	public Ninja getNinja(int idx)
	{
		return ninjas.get(idx);
	}

	public Message addNinja(Ninja ninja)
	{
		ninjas.add(new Ninja(ninja.getName()));
		return new Message("Ninja has been added yo");
	}

	public Message updateNinja(int idx, String name)
	{
		ninjas.set(idx, new Ninja(name));
		return new Message("Ninja at index " + idx + " has been updated mane");
	}

	public Message deleteNinja(int idx)
	{
		ninjas.remove(idx);
		return new Message("Ninja at index " + idx + " has been removed bruh");
	}


	public List<Ninja> getAllNinjas()
	{
		return ninjas;
	}
}
