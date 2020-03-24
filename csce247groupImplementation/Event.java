import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Event {
	public String genre;
	public String name;
	public Double cost;
	public LocalDate date;
	public LocalTime time;
	public int runTime; //runtime in minutes
	public ArrayList<Integer> ratings;
	public ArrayList<Review> reviews;
	public boolean[][] seats;
	public boolean[][] handicapSeats;
	
	/**
	 * Average rating generates an average out of 5 from all ratings
	 * 
	 * @return A double containing the average rating of an event
	 */
	public double AverageRating() {
		double sum = 0;
		for(int i = 0; i < ratings.size(); i++) {
			sum += ratings.get(i);
		}
		return sum/ratings.size();
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
