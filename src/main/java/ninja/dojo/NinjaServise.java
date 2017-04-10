package ninja.dojo;

import java.util.ArrayList;

 /**************************************************
 ** Created by Nicholas on 4/9/2017.              **
 **************************************************/
public class NinjaServise
{
	private ArrayList<Ninja> ninjas;
	private static NinjaServise instance = null;

	private NinjaServise()
	{
		ninjas = null;
	}

	public static NinjaServise getInstance()
	{
		if (instance == null)
		{
			instance = new NinjaServise();
		}
		return instance;
	}

	public void addNinja(String name)
	{
		ninjas.add(new Ninja(name));
	}

	public String getNinjaName(int idx)
	{
		return ninjas.get(idx).getName();
	}
}
