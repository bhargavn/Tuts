package Others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PrintBrackets {

	static HashMap<Integer, ArrayList<String>> group=new HashMap<Integer,ArrayList<String>>();
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("()");
		group.put(1, a);
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Enter a number to print its combinations and 0 to exit  :  ");
			 i = sc.nextInt();
			 if(i!=0){
			ArrayList<String>result=printBraces(i);
			for(String s:result){
				System.out.print(s);
				System.out.print(";");
			}
			 }
			System.out.println();
		}while(i!=0);
	}
	private static ArrayList<String> printBraces(int i) {
		// TODO Auto-generated method stub
		if(group.containsKey(i)){
			return group.get(i);
		}else{
			ArrayList<String> temp=printBraces(i-1);
			ArrayList<String> temp1=new ArrayList<String>();
			for(String s:temp){
				String s1=s+"()";
				temp1.add(s1);
				s="("+s+")";
				temp1.add(s);
			}
			group.put(i, temp1);
			return temp1;
		}
		
	}

}
