package com.geekday.moviebooking;

public class Screen {

	private String id;
	private String show;
	//Object seatMap;
	
	public Screen(String id, String show) {
		this.id = id;
		this.show = show;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}
	
	
}
