package Strings;

public class LargestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcccbs";
		int i=findPal(s);
System.out.println(i);
	}

	private static int findPal(String s) {
		// TODO Auto-generated method stub
		boolean check=checkPalidrome(s);
		if(check==true){
			return s.length();
		}else{
			return Math.max(findPal(s.substring(1)),findPal(s.substring(0,s.length()-1)));
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
