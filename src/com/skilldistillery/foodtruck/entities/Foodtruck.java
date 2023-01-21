package com.skilldistillery.foodtruck.entities;

import java.util.*;

public class Foodtruck {
	
	private static int nextTruckId = 0;
	private int truckId =1;
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
		super();
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
		return "Foodtruck [truckid=" + truckId + ", truckName=" + truckName + ", truckRating=" + truckRating
				+ ", foodType=" + foodType + "]";
	}

}
