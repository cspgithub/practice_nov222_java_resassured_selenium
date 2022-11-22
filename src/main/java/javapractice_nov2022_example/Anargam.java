package javapractice_nov2022_example;

import java.util.Arrays;
import java.util.Scanner;

public class Anargam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String str1 = sc.nextLine();
		System.out.println("enter second string");
		String str2 = sc.nextLine();
		sc.close();
		isAnagrams(str1, str2);

	}

	private static void isAnagrams(String str1, String str2) {

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// check string length is same or not
		if (str1.length() == str2.length() && !(str1.isBlank() && str2.isBlank())) {

			// convert string to array of chars
			char[] arrayStr1 = str1.toCharArray();
			char[] arrayStr2 = str2.toCharArray();

			// sort char arrays
			Arrays.sort(arrayStr1);
			
			Arrays.sort(arrayStr2);

			// if for arrays are same after sorting then both strings are Anagrams
			boolean status = Arrays.equals(arrayStr1, arrayStr2);

			if (status) {
				System.out.println("is anargam");
			} else {
				System.out.println("not anargam");
			}

		} else {
			System.out.println("length of strings are not equal hence both strings :" + str1 + " AND " + str2
					+ " are not anargam");
		}

	}

}
