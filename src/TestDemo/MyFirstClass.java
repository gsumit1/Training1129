package TestDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class MyFirstClass {

	public static void main(String arg[]) {
		int a5 = 5;

		String s = "My Name is Sumit";

		System.out.println(Pattern.compile("^N").matcher("Name").find());

		for (String a : s.split(" ")) {
			if (Pattern.compile("^N").matcher("Name").find() == false) {
				System.out.println(a);
			}
		}
		int a1=10;
		int b=20;
		int c=a1+b;

		Integer[] a={58457907};
		
		List<Integer> al = Arrays.asList(a);

		Collections.sort(al);

		int k = 4;

		List<Integer> sl = al.subList(0, k);
		
		System.out.println(sl);
		
		int diff=sl.get(k-1)-sl.get(0);
		
		System.out.println(diff);
		
	}

}
