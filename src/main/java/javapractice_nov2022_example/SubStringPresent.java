package javapractice_nov2022_example;

import java.util.Scanner;

public class SubStringPresent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter main text string");
		String text = sc.nextLine();
		System.out.println("enter substring");
		String str1 = sc.nextLine();
		checkSubStringPresenceInString(text, str1);
		sc.close();

	}

	private static void checkSubStringPresenceInString(String text, String str1) {

		int index = text.indexOf(str1);

		if (index == -1 || str1.isEmpty() || str1.isBlank()) {
			System.out.println("substring : " + str1 + " is  not presnt in main text :" + text);

		} else {
			System.out.println("substring :" + str1 + " is  presnt in main text :" + text);
		}

	}

}
