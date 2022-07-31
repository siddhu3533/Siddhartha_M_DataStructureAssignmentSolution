package com.greatlearning.dataStructureAssignmentSolution.Question1;

import java.util.Stack;

public class FloorsAssembled {
	
	//This method is used to print the order of construction of Floors.
	void orderOfConstruction(int [] floorsDelivered,int noOfFloors) {
		Stack<Integer> floorsStack = new Stack<Integer>();
		int floorToBeConstructed= noOfFloors; 
		System.out.println("The order of construction is as follows");
		for(int i=0; i<noOfFloors; i++) {
			//Inserting all floors delivered into stack.
			floorsStack.push(floorsDelivered[i]);
			System.out.println("\nDay: "+(i+1));
			if(floorToBeConstructed == floorsDelivered[i] ) {
				//checking the stack of the delivered floors if they can be constructed on same day.
				while(floorsStack.size()>0&&floorToBeConstructed==floorsStack.peek()) {
					System.out.print(floorsStack.pop()+" ");
					floorToBeConstructed--;
				}
			}
		}
	}

}
