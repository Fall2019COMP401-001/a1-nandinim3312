package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// loop to make the Grocery Item array
		// j = the number of grocery items
		int j = scan.nextInt();
		String[] groceryItem = new String[j];
		for (int i = 0; i < j; i++) {
			groceryItem[i] = scan.next();
			double[] itemPrice = new double[j];
			itemPrice[i] = scan.nextDouble();
		}
		

		int[] numberBought = new int[j];
		int[] numberOfCustomers = new int[j];
		
		int k = scan.nextInt();
		// number of customers^^
		
		// Customer loop 
		for (int i = 0; i < k; i++) {
			String first = scan.next();
			String last = scan.next();
			
			int num = scan.nextInt();
			
			String[] alreadyBought = new String[num];
			
			int index = 0;
			// Per grocery item
			for (int a = 0; a < num; a++) {
				int howMany = scan.nextInt();
				String currItem = scan.next();
				
				// int index = 0;
				for (int p = 0; p < j; p++) {
					if (groceryItem[p].equals(currItem)) {
						index = p;
					}
				}
				numberBought[index] = numberBought[index] + howMany;
							
				for (int t = 0; t < alreadyBought.length; t++) {
					if (alreadyBought[t] == null) {
						alreadyBought[t] = currItem;
						numberOfCustomers[index] = numberOfCustomers[index] + 1;
					} if (alreadyBought[t].equals(currItem)) {
						t = alreadyBought.length;
					} else {
						
					}
				}
			}
			
		
	
	}
		for (int y = 0; y < j; y++) {
			if (numberBought[y] == 0) {
				System.out.println("No customers bought " + groceryItem[y]);
			} else {
				System.out.println(numberOfCustomers[y] + " customers bought " + numberBought[y] + " " + groceryItem[y]);
				}
			}
		
		scan.close();
		

		}
	}


