package com.geekday.moviebooking;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class BookingsController {

	@GET
    @Path("getAllMovies")
    @Produces(MediaType.APPLICATION_JSON)
	public Object getAllShows(){
		return "Bookings";
	}
	
}
