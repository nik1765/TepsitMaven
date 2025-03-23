package it.edu.marconipontedera.tepsit.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
@Path("test")
public class Test {
	@GET
	@Path("{word}")
	public String test(@PathParam("word") String name) {
		return "Ciao " + name.toUpperCase();
	}
}