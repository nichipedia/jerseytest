package com.rest.nicksthingy.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

 /**************************************************
 ** Created by Nicholas on 4/9/2017.              **
 **************************************************/
 @XmlRootElement
public class Message
{
	private String message;

	public Message()
	{

	}

	public Message(String message)
	{
		this.message = message;
	}

	@XmlElement
	public String getMessage() { return message; }
}
