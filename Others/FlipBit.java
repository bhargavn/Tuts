package Others;

import java.util.Scanner;

public class FlipBit {

	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int [] a=new int[N];
		for(int i=0;i<N;i++){
			int j=sc.nextInt();
			if(j>1||j<0){
				System.out.println("enter valid bit");
				System.exit(0);
			}else{
				a[i]=j;
				
			}
		}
		flipInitial(a);
		
	}

	private static void flipInitial(int[] a) {
		// TODO Auto-generated method stub
		int maxCount=0;
		int count=0;
		int l=0;
		int j=a.length-1;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				++count;
				if(count>=maxCount){
					maxCount=count;
					j=i;
					
				}
			}else{
				--count;
				if(count<0){
					
					l=i+1;
				}
			}
		}
		System.out.println(l);
		System.out.println(j);
	}
}
