package day30_immutableClasses;

import java.util.Scanner;

public class C04_Homeworksorusu {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double x=3;

		System.out.print("Boy olcunuzu giriniz (cm) :  ");
		double boy=scan.nextDouble()/100;
		System.out.print("Kilo olcunuzu giriniz (kg) :  ");
		double kilo=scan.nextDouble();

		
		x=kilo/(boy*boy);
		System.out.println("Bmi :  "+ x);



		  }
		}
