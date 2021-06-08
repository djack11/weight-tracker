package com.WeightTracker;

import java.util.Scanner;

public class WeightT {

	public static void main(String[] args) {


		char option = '\0';
		double WeightBef = 0;
		double WeightAdd = 0;
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome Team LIDD-6!");
		System.out.println("Let's start your weight tracking journey!");
		System.out.println("******************************************");
		System.out.println("Enter An Option: ");
		System.out.println();
		System.out.println("A. Enter your starting weight");
		System.out.println("B. Enter today's weight");
		//System.out.println("C. Subtract Weight");
	//	System.out.println("D. Show Previous Weigh In");
		System.out.println("C. Finished");
		
		do  { 
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch (option ) {
			//case 'A' allow the user to see previous Weight
			case 'A' :
				Scanner PreWeight = new Scanner(System.in);
				System.out.println("PLEASE enter your starting weight ");
				String PrevWeight = PreWeight.nextLine();
				WeightBef = Double.parseDouble(PrevWeight);
				break;
				//User added Weight
			case 'B':
				Scanner addWeight = new Scanner(System.in);
				System.out.println("PLEASE enter your current Weight ");
				String addedWeight = addWeight.nextLine();
				WeightAdd = Double.parseDouble(addedWeight);
			
				System.out.println("Your current weight is "+ WeightAdd);
				
				
				double test = WeightBef - WeightAdd;
				  if (test <0) {
					  test = test *-1;
				  System.out.println("You have gained some weight "+ test);
				  }
				  else
					  System.out.println("You have lost some weight "+ test);
				  
				WeightBef = WeightAdd;
				
				break;
			/*case 'C' :
				  double test = WeightBef - WeightAdd;
				  if (test <0) {
					  test = test *-1;
				  System.out.println("You Gain Weight "+ test);
				  }
				  else
					  System.out.println("You lose Weight Congratulations "+ test);
				  
				  break;
			/*case 'D' :
				System.out.println( "======================");
			//	getLastWeighIn();
				System.out.println("=======================");
				System.out.println();
				break;
				// case E exists the user from their account
			case 'E':
				System.out.println("========================");
				break;
				default:
				System.out.println("Error: invalid option; Please enter A, B, C, D, E");
				break;*/
			}	
				
			
			
			} while (option != 'C');
		     	
		       
		 System.out.println("Thank you for being great!");	
		 System.out.println("");	
		  
	}
}	
					