package tersUcgen;

import java.util.Scanner;

public class tersUcgen {

	public static void main(String[] args) {

		int sayi,sayi2,i,j;
		Scanner input = new Scanner(System.in);

		System.out.print("Kaç kat üçgen istediğinizi yazınız : ");
		sayi = input.nextInt();
		sayi2=sayi;
		
		for(i=0 ; i<=sayi ; i++) {
			
			for (j=0 ; j<(sayi2*2)-1 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			sayi2=sayi2-1;			
		}		
	}
}
