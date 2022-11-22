package javapractice_nov2022_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sapienttest {

	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<>();
		ArrayList<String> arrayList2 = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first string");
		int n1= Integer.parseInt(scan.next());
		for(int i=0;i<n1;i++) {
			arrayList1.add(scan.next());
		}
		System.out.println("enter second string");
		int n2= Integer.parseInt(scan.next());
		for(int i=0;i<n2;i++) {
			arrayList2.add(scan.next());
		}
		System.out.println(checktwoListequalsOrNot(arrayList1,arrayList2));
		scan.close();
		
		
	}

	private static boolean checktwoListequalsOrNot(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
		
		Collections.sort(arrayList1);
		Collections.sort(arrayList2);
		
		return arrayList1.equals(arrayList2);
		
		
	
		
	}

}
