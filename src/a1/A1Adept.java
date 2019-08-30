package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		class Customer  {
			private String first;
			private String last;
			private double total;
			
			public Customer (String first, String last, double total) {
				this.first = first;
				this.last = last;
				this.total = total;
			}
			
			public String getFirst() {
		        return this.first;
		    }
			public String getLast() {
				return this.last;
			}
			public double getTotal() {
				return this.total;
			}
		}
		
//		class Grocery {
//			private String itemName;
//			private double price;
//			
//			public Grocery (String itemName, double price) {
//				this.itemName = itemName;
//				this.price = price;
//			}
//			
//			public String getItemName() {
//				return this.itemName;
//			}
//			public double getPrice() {
//				return this.price;
//				
//			}
//		}
		
		// Grocery list loop
		int j = scan.nextInt();
		// j is the total number of items
		double[] price = new double[j];
		String[] groceryItem = new String[j];
		for (int i = 0; i < j; i++) {
			
			groceryItem[i] = scan.next();
			
//			double[] price = new double[j];
			price[i] = scan.nextDouble();
			
		}
		
	
		int k = scan.nextInt();
		Customer[] customerArray = new Customer[k];
		
		//making new customers loop
		for (int i = 0; i < k; i++) {
			String first = scan.next();
			String last = scan.next();
			double total = 0.00;
			
			int a = scan.nextInt();
			// number of grocery items
			
			//total cost loop
			for (int t = 0; t < a; t++) {
				int x = scan.nextInt();
				
				// finding the index loop
				int n = 0;
				
				String currItem = scan.next();
				for (int p = 0; p < j; p++) {
					if (groceryItem[p].equals(currItem)) {
						n = p;
						
						double y = price[n];
						total = total + y * x;
					}
				
				}
					
			}
				
			customerArray[i] = new Customer (first, last, total);
			
		}
		
		scan.close();
		
		// Loop to find the Biggest Spender
		double mostSpent = 0.00;
		int f = 0;
		for (int i = 0; i < k; i++) {
			if (customerArray[i].total> mostSpent) {
				mostSpent = customerArray[i].total;
				f = i;		
			}
		}
		
		// Loop to find Smallest Spender
		double leastSpent = mostSpent;
		int r = 0;
		for (int i = 0; i < k; i++) {
			if (customerArray[i].total < leastSpent) {
			leastSpent = customerArray[i].total;
			r = i;
			}
		}
		
		for (int i = 0; i < customerArray.length; i++) {
			System.out.println(customerArray[i].total);
		}
	
		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + customerArray[i].total;
		}
		double average = sum / k;
		
		System.out.println("Biggest: " + customerArray[f].first + " " + customerArray[f].last + " (" + (String.format ("%.2f", mostSpent)) + ")");			
		System.out.println("Smallest: " + customerArray[r].first + " " + customerArray[r].last + " (" + (String.format ("%.2f", leastSpent))+ ")");
		System.out.println("Average: " + (String.format ("%.2f", average)));
		
	}
}
