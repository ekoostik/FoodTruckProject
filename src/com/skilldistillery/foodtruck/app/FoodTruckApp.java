package com.skilldistillery.foodtruck.app;

import java.util.*;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {
	private Foodtruck[] fleet = new Foodtruck[5];
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Hello! welcome to the foodtruck app!\nWe'er going to rate some foodtrucks.");
		FoodTruckApp app = new FoodTruckApp();
		app.makeTruck();
		app.menu();

	}

	public void makeTruck() {
		for (int i = 0; i < fleet.length; i++) {
			System.out.println("Please enter the foodtruck name. Or 'quit' ");
			String truckName = sc.next();
			if (truckName.equalsIgnoreCase("quit")) {
				break;

			}
			System.out.println("Please enter the trucks food type.");
			String foodType = sc.next();

			System.out.println("Please enter a rating from 1-5, with 5 being the best.");
			int truckRating = sc.nextInt();
			sc.nextLine();

			Foodtruck truck = new Foodtruck(truckName, foodType, truckRating);
			fleet[i] = truck;

		}

	}

	private void avgTruckRating() {
		// calculate the average
		double sum = 0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				sum = sum + fleet[i].getTruckRating();
			}
		}

		double avg = sum / fleet.length;

		System.out.println("The average truck rating is " + avg);

	}

	private void highestRated() {
		// calculate the highest rated
		Foodtruck highest = fleet[0];
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				if (highest.getTruckRating() < fleet[i].getTruckRating()) {
					highest = fleet[i];
				}
			}

		}
		System.out.println("The highest rated truck is " + highest);

	}

	public void menu() {
		// menu
		boolean go = true;

		do {

			System.out.println("1: List all existing food trucks. ");
			System.out.println("2: See the average rating of food trucks. ");
			System.out.println("3: Display the highest-rated food truck. ");
			System.out.println("4: Quit. ");
			int userIn = sc.nextInt();
			switch (userIn) {

			case (1):
				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i] == null) {
						continue;
					} else
						System.out.println(fleet[i].toString());
				}
				break;

			case (2):
				avgTruckRating();
				break;

			case (3):
				highestRated();
				break;

			case (4):
				System.out.println("Goodbye");
				sc.close();
				go = false;
			}
		} while (go == true);
		return;
	}

}
