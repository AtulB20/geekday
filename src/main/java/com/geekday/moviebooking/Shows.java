package com.geekday.moviebooking;

import java.time.LocalDate;

public class Shows {

	private String movieName;
	private LocalDate showTime;
	private int duration;
	private String screenId;
	private double price;
	
	public Shows(String movieName, LocalDate showTime, int duration, String screenId, double price) {
		this.movieName = movieName;
		this.showTime = showTime;
		this.duration = duration;
		this.screenId = screenId;
		this.price = price;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public LocalDate getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalDate showTime) {
		this.showTime = showTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
