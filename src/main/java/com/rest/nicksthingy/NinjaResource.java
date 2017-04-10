package com.rest.nicksthingy;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

 /**************************************************
 ** Created by Nicholas on 4/9/2017.              **
 **************************************************/

@Path("/rest")
public class NinjaResource
{
 	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getNinja()
	{
		return "My name is bob";
	}
}
