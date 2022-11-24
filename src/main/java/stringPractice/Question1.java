package stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {

	public static void main(String[] args) {
		String a = "TEST";
		String b = new String(a);
//		String c="TEST";
		if (a == b) {
			System.out.println("scp...same refrenece");
		} else {
			System.out.println("heap...no same refrenece");
		}
		if (a.equals(b)) {
			System.out.println("scp/heap---checking values eual");
		} else {
			System.out.println("scp/heap---checking values noteual");
		}

		//String[] arr = { "csp", "sasa" };
//
		//List<String> arL1 = new ArrayList<>(Arrays.asList(arr));
//
//		String[] arr1 = { "csp", "sasa" };
//
//		ArrayList<String> arL2 = new ArrayList<>(Arrays.asList(arr));
//
//		Collections.sort(arL1);
//		Collections.sort(arL2);
//
//		System.out.println(arL1.equals(arL2));

//		
//		System.out.println((a==c)?true:false);
//		System.out.println((a.equals(c))?true:false);
//		System.out.println(a.compareTo(c));
//		
	}

}
