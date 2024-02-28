package com.room;

public class Room {

	private int roomNo;
	private int capacity;
	
	private double pricePerNight;
	private double totalPrice;

	public Room(int roomNo, int capacity, double pricePerNight, double totalPrice) {
		super();
		this.roomNo = roomNo;
		this.capacity = capacity;
	
		this.pricePerNight = pricePerNight;
		this.totalPrice = totalPrice;
	}
	

	public int getRoomNo() {
		return roomNo;
	}

	public int getCapacity() {
		return capacity;
	}

	

	public double getPricePerNight() {
		return pricePerNight;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public static void displayFormat() {
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		System.out.println("\nRoom No \t\tCapicity\t\tprice per Night\t\tTotal Price\n");

		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}

	public void display() {
		System.out.print(roomNo+"			");
		System.out.print(capacity+"				");
		System.out.print(pricePerNight+"		");
		System.out.print(totalPrice+" 		");
	}

}
