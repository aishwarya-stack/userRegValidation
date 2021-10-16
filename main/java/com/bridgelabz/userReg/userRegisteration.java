package com.bridgelabz.userReg;

import java.util.Scanner;
import java.util.regex.Pattern;

public class userRegisteration {
	static Scanner sc = new Scanner(System.in);

	public void validFirstName() {
		System.out.println("Enter your First Name : ");
		String firstName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
	}

	public static void main(String[] args) {
		userRegisteration object = new userRegisteration();
		object.validFirstName();
	}
}
