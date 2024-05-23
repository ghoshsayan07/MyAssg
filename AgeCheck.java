package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class AgeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        String category;
        if (age < 13)
            category = "Child";
        else if (age >=13 && age < 20)
            category = "Teenager";
        else if (age >=20 && age < 65)
            category = "Adult";
        else
            category = "Senior";
        
        System.out.println("You belong to the category: " + category);

	}

}
