package com.rest.nicksthingy.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
 /**************************************************
 ** Created by Nicholas on 4/9/2017.              **
 **************************************************/

 @XmlRootElement
public class Ninja
{
	private String name;

	public Ninja()
	{

	}

	public Ninja(String name)
	{
		this.name = name;
	}

	@XmlElement
	public String getName() { return name; }
}
