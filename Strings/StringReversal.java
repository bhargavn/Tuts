package Strings;

public class StringReversal {
	public static void main(String[] args){
		String s = "bhargav";
		for(int i=0;i<s.length()/2;i++){
			char front=s.charAt(i);
			char back=s.charAt(s.length()-i-1);
			s=s.substring(i+1, s.length()-i-1);
			s=s+front;
			s=back+s;
		}
		System.out.println(s);
	}
	public StringReversal() {
		// TODO Auto-generated constructor stub
	}
}
