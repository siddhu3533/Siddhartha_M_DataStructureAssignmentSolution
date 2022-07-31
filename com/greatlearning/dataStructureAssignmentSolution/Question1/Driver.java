package com.greatlearning.dataStructureAssignmentSolution.Question1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		FloorsAssembled floorsAssembledObject = new FloorsAssembled();
		Scanner sc = new Scanner(System.in);
		int noOfFloors;
		System.out.println("Enter the total no of floors in the building");
		noOfFloors = sc.nextInt();
		int [] floorsDelivered = new int[noOfFloors];
		for(int i=0; i<noOfFloors; i++) {
			System.out.println("Enter the floor size given on day: "+(i+1));
			floorsDelivered[i] = sc.nextInt();
		}
		floorsAssembledObject.orderOfConstruction(floorsDelivered,noOfFloors);
		sc.close();
	}

}
