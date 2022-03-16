package com.challenge;

import java.util.LinkedList;

public class Intersection {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.add(3);
		l1.add(7);
		l1.add(8);
		l1.add(10);
		l2.add(99);
		l2.add(1);
		l2.add(8);
		l2.add(10);
		
		for(int i=0; i<l1.size(); i++) {
			if(l2.contains(l1.get(i))) {
				System.out.println(l1.get(i));
				break;
			}
		}
	}
	

	
	
	

}
