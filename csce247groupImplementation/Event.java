package csce247groupImplementation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Event {
	public String genre;
	public String name;
	public Double cost;
	public LocalDate date;
	public LocalTime time;
	public int runTime; //runtime in minutes
	public ArrayList<Review> reviews;
	public boolean[][] seats;
	public boolean[][] handicapSeats;
	
	/**
	 * Changes status of a ticket to checked in
	 * 
	 * @param A ticket (that hasn't been check in yet)
	 */
	public void CheckIn(Ticket ticket) {
		ticket.checkedInStatus = true;
	}
	
	/**
	 * Average rating generates an average out of 5 from all ratings
	 * 
	 * @return A double containing the average rating of an event
	 */
	public double AverageRating() {
		double sum = 0;
		for(int i = 0; i < reviews.size(); i++) {
			sum += reviews.get(i).rating;
		}
		return sum/reviews.size();
	}
	
	public String toString() {
		return "Name: " + this.name + 
				"\nGenre: " + this.genre +
				"\nCost: $" + this.cost +
				"\nDate: " + this.date +
				"\nTime: " + this.time +
				"\nRuntime: " + this.runTime +
				"\nAverage Review: " + AverageRating() + "/5.0";
	}
}
