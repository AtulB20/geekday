package com.geekday.moviebooking;

import java.util.List;

public class BookingService {


	ScreenService screenService = new ScreenService();
	
	public List<Ticket> book() {
		
		
		return null;
	}
	
	public List<Shows> getShows(){
		screenService.getAllShows();
		return null;
		
	}
}
