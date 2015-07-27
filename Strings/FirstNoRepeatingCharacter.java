package Strings;

import java.util.HashMap;

public class FirstNoRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geekforgeeks";
		HashMap<Character, Value>result=new HashMap<Character, Value>();
		for(int i=0;i<s.length();i++){
			Value a = result.get(s.charAt(i));
			if(a==null){
				a=new Value();
				a.count=1;
				a.occurence=i;
				result.put(s.charAt(i), a);
			}else{
				a.count++;
				result.put(s.charAt(i), a);
			}
			
		}
		Integer resultAlphabet=null;
		Character finalAlphabet=null;
for(Character x:result.keySet()){
	System.out.println(x+":: Occurence = "+result.get(x).occurence+" value = "+result.get(x).count);
	Value v = result.get(x);
	if(v.count==1){
		if(resultAlphabet!=null){
		if(v.occurence<resultAlphabet){
			resultAlphabet=v.occurence;
			finalAlphabet=x;
		}
		}else{
			resultAlphabet=v.occurence;
			finalAlphabet=x;
		}
	}
}
System.out.println("The First Non Repeating alphabet is "+finalAlphabet);
	}
	static class Value{
		public Value() {
			// TODO Auto-generated constructor stub
		}
		int occurence;
		int count;
	}

}
