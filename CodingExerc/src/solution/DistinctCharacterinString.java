package solution;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdABCDabcdAa";
		char[] charvar = str.toCharArray();
		Map<Character, Integer> charc = new HashMap<>();
		
		for(char c:charvar) {
			if(charc.containsKey(c)) { // c =a
				charc.put(c, charc.get(c)+1);
			}else {
				charc.put(c, 1);
			}
		}
		System.out.println(charc);

	}

}
