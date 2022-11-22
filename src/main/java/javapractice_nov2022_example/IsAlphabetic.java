package javapractice_nov2022_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsAlphabetic {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// System.out.println("ente char");
		// char ch = input.next().charAt(0);
		isAlaphebeticOrNotch();
		// input.close();

	}

	private static void isAlaphebeticOrNotch() {

		// boolean status = Character.isAlphabetic(ch);
		// String result = (Character.isAlphabetic(ch)) ? "pass" : "fail";
		// System.out.println(result);

		List<String> listOfDropdownValues = new ArrayList<>();
		listOfDropdownValues.add("ca");
		listOfDropdownValues.add("ca");
		listOfDropdownValues.add("ca");
		System.out.println(listOfDropdownValues);

		Set<String> removeduplicate = new HashSet<String>(listOfDropdownValues);
		System.out.println(removeduplicate);

	}
	
	

}
