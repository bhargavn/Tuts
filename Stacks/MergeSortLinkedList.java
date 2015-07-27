package Stacks;

import java.util.LinkedList;

public class MergeSortLinkedList {

	public static void main(String []args){
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(10);
	l.add(50);
	l.add(20);
	l.add(40);
	l.add(30);
	l.add(60);
	}
	
	public static void sort(LinkedList<Integer>list){
		
	}
	public static LinkedList<Integer> Sorting(LinkedList<Integer>list,int i,int j){
		if(i-j<1)
		return list;
		else{
			Sorting(list,i,(i+j)/2-1);
		}
	}
}
