/*
 * Aarav Goyal
 * Clothes.java
 * 9-18-2024
 * Psuedocode:
 * - Import Scanner
 * - Create a welcome message
 * - Ask to enter cost of shirt and the number of shirts bought
 * - Ask to enter cost of pant and the number of pants bought
 * - Ask to enter cost of shoes and the number of shoes
 * - Tax: 9.375%
 * - Discount: 10%
 * - Print all the information out with the total price of each item (Shirts, Pants, Shoes, Subtotal, Discount, Total Before Tax, Tax, Total)
 * - Print the end message out with the total cost and the number of items purchased.
 */ 


import java.util.Scanner;
public class Clothes{
	
	public static void main(String[] Args){
		Scanner in = new Scanner (System.in);
		System.out.println("\n\n\nWelcome to ClothesRUS, your one stop shopping for shirts, pants and shoes.\n\n");
		
		System.out.print("Please enter the cost of one shirt -> ");
		double ShirtCost = in.nextDouble();
		
		System.out.print("\nPlease enter the number of shirts purchased -> ");
		int NumOfShirts = in.nextInt();
		
		System.out.print("\nPlease enter the cost of one pair of pants -> ");
		double PantCost = in.nextDouble();
		System.out.print("\nPlease enter the number of pants purchased -> ");
		int NumOfPant = in.nextInt();
		System.out.print("\nPlease enter the cost of one pair of shoes -> ");
		double ShoeCost = in.nextDouble();
		System.out.print("\nPlease enter the number of shoes purchased -> ");
		int NumOfShoe = in.nextInt();
		//tax = 9.375%
		//discount = 10%
		
		double ShirtTotal = ShirtCost*(double)NumOfShirts;
		double PantTotal = PantCost*(double)NumOfPant;
		double ShoeTotal = ShoeCost*(double)NumOfShoe;
		double Subtotal = ShirtTotal+PantTotal+ShoeTotal;
		double Discount = Subtotal*0.1;
		double TotalBeforeTax = Subtotal - Discount;
		double Tax = TotalBeforeTax*9.375/100;
		double Total = TotalBeforeTax - Tax;
		int TotalNumOfClothing = NumOfShirts+NumOfPant+NumOfShoe;
		
		System.out.printf("\n\n%-17s= $ %,13.2f", "Shirts", ShirtTotal);
		System.out.printf("\n%-17s= $ %,13.2f", "Pants", PantTotal);
		System.out.printf("\n%-17s= $ %,13.2f", "Shoes", ShoeTotal);
		System.out.printf("\n%-17s= $ %,13.2f","Subtotal", Subtotal);
		System.out.printf("\n%-17s= $ %,13.2f", "Discount", Discount);
		System.out.printf("\n%s = $ %,13.2f", "Total before tax", TotalBeforeTax);
		System.out.printf("\n%-17s= $ %,13.2f", "Tax", Tax);
		System.out.printf("\n%-17s= $ %,13.2f\n\n", "Total", Total);
		System.out.printf("The toal cost for %,d items is $%,.2f. Thank you for shopping at ClothesRUS.\n\n\n\n", TotalNumOfClothing, Total);
		
	}
}
