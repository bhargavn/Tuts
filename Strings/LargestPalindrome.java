package Strings;

import java.util.HashMap;

public class LargestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcccbs";
		HashMap<String, Integer>h=new HashMap<String,Integer>();
		int i=findPal(s,h);
System.out.println(i);
	}

	private static int findPal(String s,HashMap<String, Integer>h) {
		// TODO Auto-generated method stub
		boolean eval=h.containsKey(s);
		if(eval){
			return h.get(s);
		}
		boolean check=checkPalidrome(s);
		if(check){
			return s.length();
		}else{
			return Math.max(findPal(s.substring(1),h),findPal(s.substring(0,s.length()-1),h));
		}
	}

	private static boolean checkPalidrome(String s) {
		
		// TODO Auto-generated method stub
		for(int i=0;i<(s.length()/2);i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				return false;
			}
		}
		return true;
	}

}
