package com.skilldistillery.foodtruck.entities;


public class Foodtruck {
	
	private static int nextTruckId = 1;
	private int truckId;
	private String truckName;
	private int truckRating;
	private String foodType;

	public void setTruckId(int truckId) {
		this.truckId = nextTruckId;
		}
	
	public int getTruckId() {
		return truckId;
		
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public Foodtruck( String truckName, String foodType, int truckRating) {
		this.truckId = nextTruckId;
		nextTruckId++;
		this.truckName = truckName;
		this.truckRating = truckRating;
		this.foodType = foodType;
	}

	public Foodtruck() {
	}

	@Override
	public String toString() {
		return  "Truck# " + truckId + ", Name:" + truckName + ", Rating:" + truckRating +
				", Type:"  +  foodType + "\n";
	}

}
