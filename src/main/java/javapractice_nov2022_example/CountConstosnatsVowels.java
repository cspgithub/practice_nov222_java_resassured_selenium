package javapractice_nov2022_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountConstosnatsVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter string ");
		String str = sc.nextLine();

		findCountConsonentsAndVowels(str);
		sc.close();

	}

	private static void findCountConsonentsAndVowels(String str) {
		// vowels are a e i o u
		// consonant are any of the letters of the English alphabet except a, e, i, o,
		// and u

		Character[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		List<Character> listOfVowels = Arrays.asList(vowels);

		ArrayList<Character> arrayOfCharFromString = new ArrayList<>();

		char[] charArray = str.replaceAll("\\s", "").toCharArray();
		for (char c : charArray) {
			arrayOfCharFromString.add(c);
		}

		System.out.println(listOfVowels);
		System.out.println(arrayOfCharFromString);

		int vowelsCount = 0;
		int consonantCount = 0;

		for (char ch : arrayOfCharFromString) {

			if (listOfVowels.contains(ch)) {
				vowelsCount++;

			} else {
				consonantCount++;
			}

		}

		System.out.println("vowels Count:" + vowelsCount);
		System.out.println("conso conunt:" + consonantCount);

	}

}
