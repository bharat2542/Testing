

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		String  number=null;
		boolean isNumber;
		int x=0;
		System.out.println("enter  number");
		do {
			Scanner in = new Scanner(System.in);
			if(in.hasNextInt()) {
				number=in.nextLine();
				String a[] = number.split("[, ]+");
				for (String temp : a)
				{
					x= Integer.parseInt(temp);
				}
				isNumber=true;
			}else {
				System.out.println("Please Enter  correct number ");
				isNumber=false;
				in.next();

			}
		}
		while(!(isNumber));
		
		if(x  == 2) {
			for(int i=1;i<=x;i++) {

				for (int j=1;j<=x-1;j++) {
					System.out.print("*");

				}
				System.out.println();
			}

		}
		else{

			int mid=(x+1)/2;
			for(int i=1; i<=mid; i++) {
				for (int s=1; s<=mid-i;s++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(i*2-1);j++) {
					System.out.print("*");
				}

				System.out.println();

			}
			for (int i=1;i<=mid-1;i++) {
				for(int s=1; s<=i; s++) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*(mid-i)-1;j++){
					System.out.print("*");

				}
				System.out.println();

			}


		}


	}}


