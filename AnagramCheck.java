package test;
import java.util.*;
public class AnagramCheck {
	static void checkAnagram(String s1,String s2) {
		if(s1.length() != s2.length()) {
			System.out.println("Are not Anagram");
		}
		else {
			char ar1[] = s1.toLowerCase().toCharArray();
			char ar2[] = s2.toLowerCase().toCharArray();
			
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			if(Arrays.equals(ar1, ar2) == true) {
				System.out.println("Strings are Anagram.");
			}
			else {
				System.out.println("Strings are not Anagram");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkAnagram("tar","car");
	
	}

}
