package com.rest.nicksthingy.resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.rest.nicksthingy.model.Message;
import com.rest.nicksthingy.model.Ninja;
import com.rest.nicksthingy.service.NinjaService;

import java.util.List;

/**************************************************
 ** Created by Nicholas on 4/9/2017.              **
 **************************************************/

@Path("/rest")
public class NinjaResource
{
	NinjaService ninjaServ = NinjaService.getInstance();

 	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Ninja> getNinjas()
	{
		return ninjaServ.getAllNinjas();
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Message addNinja(Ninja ninja)
	{
		return ninjaServ.addNinja(ninja);
	}


	@GET
	@Path("/{ninjaId}")
	@Produces(MediaType.APPLICATION_XML)
	public Ninja getNinja(@PathParam("ninjaId") int idx)
	{
		return ninjaServ.getNinja(idx);
	}
}
