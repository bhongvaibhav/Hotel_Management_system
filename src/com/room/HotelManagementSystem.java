package com.room;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelManagementSystem {

	public static void main(String[] args) {

		int roomNo = 0;
		int capicity = 0;
		double pricePerNight = 0.0;
		double totalPrice = 0.0;
		double cgst, sgst, subtotal = 0.0, discount = 0.0;
		char choice = '\0';

		System.out.println("\t\t\t\t------------------Invoice----------------------------------------");
		System.out.println("\t\t\t\t\t-----------------------Hotel Koli Wada Bar & Res");
		System.out.println("\t\t\t\t\t3/98 karve nagar pune");
		System.out.println("\t\t\t\t\t" + "  " + "near by karve bridge");
		System.out.println("GSTIN: 05VBBBB0909S123" + "\t\t\t\t\t\t\tContact : (+91) 9307434383");

		SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YYYY, HH:mm:ss");

		Date date = new Date();

		Calendar calendar = Calendar.getInstance();

		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		System.out.println("Date: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]
				+ "\t\t\t\t\t\t (+91) 9325508449");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Customer name: ");
		String customername = scanner.nextLine();

		List<Room> room = new ArrayList<Room>();

		do {
			System.out.println("Enter Room details: ");
			System.out.println("Room number:");
			int roomNo1 = scanner.nextInt();

			System.out.println("capicity: ");
			int capicity1 = scanner.nextInt();

			System.out.println("price (per night): ");
			pricePerNight = scanner.nextDouble();

			totalPrice = pricePerNight * capicity1;
			
			
			room.add(new Room(roomNo1, capicity1, pricePerNight, totalPrice));

			System.out.print("Want to add more rooms? (y or n): ");

			choice = scanner.next().charAt(0);

			scanner.nextLine();

		} while (choice == 'y' || choice == 'Y');
		Room.displayFormat();
		for (Room p : room) {
			p.display();
		}
		// price calculation
		System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + totalPrice);
		// calculating discount
		discount = totalPrice * 2 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " + discount);
		// total amount after discount
		subtotal = totalPrice - discount;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal " + subtotal);
		// calculating tax
		sgst = totalPrice * 12 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) " + sgst);
		cgst = totalPrice * 12 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) " + cgst);
		// calculating amount to be paid by buyer
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + (subtotal + cgst + sgst));
		System.out.println("\t\t\t\t----------------Thank You for Koli Wada Hotel..!!----------------------------------");
		System.out.println("\t\t\t\t                     Visit Again");
		// close Scanner
		scanner.close();

	}

}
