package Others;

import java.util.Scanner;

public class LongestProject {

	public static void main(String []args){
		int n=6;
		pair [] p=new pair [n];
		//ArrayList<pair>a=new ArrayList<pair>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++){
			p[i]=new pair(sc.nextInt(),sc.nextInt());
			
		}
		print(p);
		//sortPairsOntwo(p);
		//print(p);
		sortPairsOnone(p);
		print(p);
		getSequence(p);
	}
	
	 static void getSequence(pair[] p) {
		// TODO Auto-generated method stub
		 int maxCount=0;
		for(int i=0;i<p.length;i++){
			pair temp =p[i];
			int count=0;
			for(int j=i+1;j<p.length;j++){
				if(p[j].one>temp.two){
					temp=p[j];
					count++;
				}
				if(count>maxCount){
					maxCount=count;
				}
			}
		}
		System.out.println(maxCount+1);
	}

	static void print(pair [] p){
		for(int i=0;i<p.length;i++){
			System.out.print("("+p[i].one+","+p[i].two+"),");
		}
		System.out.println();
	}

	static boolean validLinks(pair p1,pair p2){
		if(p1.two<p2.one){
			return true;
		}else{
			return false;
		}
	}
	
	static void sortPairsOntwo(pair [] p){
		for(int i=0;i<p.length;i++){
			for(int j=0;j<i;j++){
				if(p[i].two<p[j].two){
					pair temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
	}
	static void sortPairsOnone(pair [] p){
		for(int i=0;i<p.length;i++){
			for(int j=0;j<i;j++){
				if(p[i].one<p[j].one){
					pair temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
	}
}

class pair{
	int one;
	int two;
	public pair(int a,int b) {
		// TODO Auto-generated constructor stub
	one=a;
	two=b;
	}
}
