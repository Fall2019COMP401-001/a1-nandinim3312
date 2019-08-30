package a1;

import java.util.Scanner;

public class A1Novice {

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
		int num = scan.nextInt();
		for (int i = 0; i<num; i++) {
			
			String first = scan.next();
//			char[] firstArray = first.toCharArray();
			char firstInitial = first.charAt(0);
			String last = scan.next();
			double total = 0.0;
			
			int v = scan.nextInt();
			for (int j = 0; j < v; j++) {
				int x = scan.nextInt();
				String y = scan.next();
				double z = scan.nextDouble();
				total = total + x * z;
			}	
			
			new Customer (first, last, total);
			
			System.out.println(firstInitial + ". " + last + ": " + (String.format ("%.2f", total)));
		}
		scan.close();
		
		}
	
	}

