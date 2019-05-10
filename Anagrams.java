package InterviewQuestion.questions;

import java.util.HashMap;

public class Anagrams {
	
	static boolean  isAnagram(String input1, String input2) {
		
		input1= input1.replaceAll("\\s", "").toLowerCase();
		input2 = input2.replaceAll("\\s", "").toLowerCase();
		HashMap<Character, Integer> input1HashMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> input2HashMap = new HashMap<Character, Integer>();
		if(input1.length() != input2.length()) {
			return false;
		} 
		for(int i=0;i<input1.length();i++)
		{	
			if(input1HashMap.containsKey(input1.charAt(i))) {
				input1HashMap.put(input1.charAt(i), input1HashMap.get(input1.charAt(i)) + 1);
			} else {
				input1HashMap.put(input1.charAt(i), 1);
			}
			if(input2HashMap.containsKey(input2.charAt(i))) {
				input2HashMap.put(input2.charAt(i), input2HashMap.get(input2.charAt(i)) + 1);
			} else {
				input2HashMap.put(input2.charAt(i), 1);
			}		
		}
		if(input1HashMap.equals(input2HashMap)) {	
			return true;
		}	
		return false;
	}
	public static void main(String p[]) {
		System.out.println(isAnagram("Mother In Law", "Hitler Woman"));	 
		System.out.println(isAnagram("keEp", "peeK"));
		System.out.println(isAnagram("SiLeNt CAT", "LisTen AcT"));
		System.out.println(isAnagram("Debit Card", "Bad Credit"));
		System.out.println(isAnagram("School MASTER", "The ClassROOM"));
		System.out.println(isAnagram("DORMITORY", "Dirty Room"));
		System.out.println(isAnagram("ASTRONOMERS", "NO MORE STARS"));
		System.out.println(isAnagram("Toss", "Shot"));
		System.out.println(isAnagram("joy", "enjoy"));
	}
}
