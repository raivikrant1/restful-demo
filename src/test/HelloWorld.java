package test;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloWorld {
	static ArrayList<String> names = new ArrayList<String>();
	
	@GET
	public String getNames() {
		return "Names: " + names.toString();
	}

	@GET
	@Path("/add")
	public String addName(@QueryParam("name") String name) {
		names.add(name);
		return "Size of the arraylist: " + names.size();
	}
}
