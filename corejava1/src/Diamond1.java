import java.util.Scanner;

public class Diamond1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number :");
		String input = sc.nextLine();


		String a[] = input.split("[, ]+");
		for (String temp : a)
		{
			int x = Integer.parseInt(temp);
			System.out.println(x);

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
		








		}}}


		
		


