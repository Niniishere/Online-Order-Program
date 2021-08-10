import java.util.Scanner;
// -------------------------------------------------------
// Assignment 2 Question 2
// Written by: Hao Yi Liu (40174210)
// Date: 17/02/2021
// For COMP 248 Section W 2204 - Winter 2021
// -------------------------------------------------------
/*This program prompts the user to make an online order by choosing between many options and calculate the price they have to pay,
including the tips and the delivery fees if there are any. It also has the option to make multiple orders. */
public class Question2 {
	public static void main(String[] args){
		System.out.println("**************************************");
		System.out.println(" Welcome to Online Order Program!"); //printing the welcome message
		System.out.println("**************************************");
		double priceWithoutMeat=7.5, priceWithBeef=25.5, priceWithPork=17.5, delivery=5, tips=0, totalPrice=0, priceToPay=0; //declaring variables with initial values
		int choice; 
		String answer="yes", food;
		boolean condition1=false; //making a flag variable
		Scanner keyboard=new Scanner(System.in); //letting the user put inputs
		System.out.println("  1. Hamburger"); //displaying the menu
		System.out.println("\n  2. Pizza");
		System.out.println("\n  3. Noodle");
		System.out.println("\n  4. Salad");
		System.out.println("\n  5. Sandwich");
		System.out.println("\n  6. Exit");
		System.out.println("**************************************");
		while (!condition1){ //repeating the statements until a valid choice number is obtained for every ordered item  
			choice=0; //setting default choice to be invalid in case the input is not an integer
			System.out.println("\nPlease enter your choice (1-6): ");
			try {
				choice=keyboard.nextInt(); //checking the keyboard entry for integer but getting ready in case the input fires an error
			} catch (Exception e) { //in the case the input is not an integer
				keyboard.next(); //go to next line to prevent infinite looping
			}
			if (choice < 1 || choice > 6){ //checking if the choice is valid
					System.out.print("\nThat is a wrong input. Please try again!");
			}
			switch (choice){ //choosing between many options in the menu
				case 1: //when the user puts the integer 1 for choice
					System.out.print("Your choice is: Hamburger."); //displaying the item for choice 1
					System.out.print("\nWould you like to have some meat on your Hamburger? "); //asking the user if they want meat
					answer=keyboard.next();
					if (answer.equalsIgnoreCase("Yes")){ 
						System.out.print("\nBeef or Pork? ");
						food=keyboard.next();
						if (food.equalsIgnoreCase("Beef")){ //setting the price if the user chooses beef
							totalPrice=totalPrice+25.5;
						}
						else if (food.equalsIgnoreCase("Pork")){
							totalPrice=totalPrice+17.5;
						}
					}
					else {
						totalPrice=totalPrice+7.5; //setting the price if the user doesn't want meat
					}
					break;
				case 2: //when the user puts the integer 2 for choice
					System.out.print("Your choice is: Pizza.");
					System.out.print("\nWould you like to have some meat on your Pizza? ");
					answer=keyboard.next();
					if (answer.equalsIgnoreCase("Yes")){
						System.out.print("\nBeef or Pork? ");
						food=keyboard.next();
						if (food.equalsIgnoreCase("Beef")){
							totalPrice=totalPrice+25.5;
						}
						else if (food.equalsIgnoreCase("Pork")){
							totalPrice=totalPrice+17.5;
						}
					}
					else {
						totalPrice=totalPrice+7.5;
					}
					break;
				case 3: //when the user puts the integer 3 for choice
					System.out.print("Your choice is: Noodle.");
					System.out.print("\nWould you like to have some meat on your Noodle? ");
					answer=keyboard.next();
					if (answer.equalsIgnoreCase("Yes")){
						System.out.print("\nBeef or Pork? ");
						food=keyboard.next();
						if (food.equalsIgnoreCase("Beef")){
							totalPrice= totalPrice+25.5;
						}
						else if (food.equalsIgnoreCase("Pork")){
						totalPrice=totalPrice+17.5;
						}
					}
					else {
						totalPrice=totalPrice+7.5;
					}
					break;
				case 4: //when the user puts the integer 4 for choice
					System.out.print("Your choice is: Salad.");
					System.out.print("\nWould you like to have some meat on your Salad? ");
					answer=keyboard.next();
					if (answer.equalsIgnoreCase("Yes")){
						System.out.print("\nBeef or Pork? ");
						food=keyboard.next();
						if (food.equalsIgnoreCase("Beef")){
							totalPrice=totalPrice+25.5;
						}
						else if (food.equalsIgnoreCase("Pork")){
							totalPrice=totalPrice+17.5;
						}
					}
					else {
						totalPrice=totalPrice+7.5;
					}
					break;
				case 5: //when the user puts the integer 5 for choice
					System.out.print("Your choice is: Sandwich.");
					System.out.print("\nWould you like to have some meat on your Sandwich? ");
					answer=keyboard.next();
					if (answer.equalsIgnoreCase("Yes")){
						System.out.print("\nBeef or Pork? ");
						food=keyboard.next();
						if (food.equalsIgnoreCase("Beef")){
							totalPrice=totalPrice+25.5;
						}
						else if (food.equalsIgnoreCase("Pork")){
							totalPrice=totalPrice+17.5;
						}
					}
					else {
						totalPrice=totalPrice+7.5;
					}
					break;
				case 6: //when the user puts the integer 6 for choice
					System.out.print("Your choice is: Finish the order!");
					condition1=true; //switching the flag to true to break out of the loop in case the user wants to exit
					break;
			}
			if (choice <= 5 && choice >= 1){
				System.out.print("\nWould you like to have more food? "); //asking the user if they want more food
				answer=keyboard.next();
				if (answer.equalsIgnoreCase("No")){
					condition1=true; //switching the flag to true to move on to payment
				}
			}
		}
		if (totalPrice > 50 || totalPrice == 0){ //deciding if there is delivery fee according to the price
			System.out.print("\n\nNo need to pay the delivery fee.");
		}
		else {
			System.out.print("\nThe total price is less than $50. You need to pay the delivery fee $5.");
			totalPrice=totalPrice+5;
		}
		if (totalPrice > 0) { //to prevent asking for tips if the user does not order anything
			System.out.print("\n\nWould you like to pay some tips? Please enter the amount: ");
			tips=keyboard.nextDouble();
			priceToPay=totalPrice+tips;
		}
		System.out.print("\n\nThe total price is $"); 
		System.out.printf("%.2f.", priceToPay); //displaying the price to pay
		System.out.print("\n\nThank you for using Online Order Program!"); //displaying the closing message
	}
}