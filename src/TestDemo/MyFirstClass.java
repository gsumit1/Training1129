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
			

		String st="KKKK";
		
		try {
		for(int i=0; i<st.length();i++) {
			for(int j=1;j<st.length();j++) {
				
				
				
				String sb=st.substring(i+1, j);
				
				System.out.println(sb);
				
				
				
				
				
			}
		}
		
		}catch(Exception e) {}

}
}
