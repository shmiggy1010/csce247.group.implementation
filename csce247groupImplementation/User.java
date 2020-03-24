package csce247groupImplementation;

import java.time.*;
import java.util.ArrayList;

public class User {

	private String name;
	private String email;
	private String address;
	private String zip;
	private String phoneNumber;
	// PASSWORD HASH VALUE
	private LocalDate birthDate;
	private ArrayList<Ticket> ownedTickets;
	private PaymentInfo paymentInfo;
	private int rewardPoints;
	private UserType type;
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getZip() {
		return this.zip;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public LocalDate getBirthDate() {
		return this.birthDate;
	}
	
	public ArrayList<Ticket> getOwnedTickets() {
		return this.ownedTickets;
	}
	
	public PaymentInfo getPaymentInfo() {
		return this.paymentInfo;
	}
	
	public int getRewardPoints() {
		return this.rewardPoints;
	}
	
	public UserType getType() {
		return this.type;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setOwnedTickets(ArrayList<Ticket> ownedTickets) {
		this.ownedTickets = ownedTickets;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	
	
}
