package io.javatogo.algorithms.sorting;

import java.util.Scanner;

/**
 * <p>This is an implementation of Insertion sort.
 * It is a kind of Bubble Sort, but not really.</p>
 * 
 * @author JavaToGo
 *
 */
public class Insertion {

	public static void sort(String[] a) {
		
		int N = a.length;
		
		for(int i=1; i<N; i++) {
			for(int j=i; j>0; j--) {
				if(a[j-1].compareTo(a[j]) > 0)
					exch(a, j-1, j);
				else break;
			}
		}
	}
	
	private static void exch(String[] a, int i, int j) {
		String t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] a = line.split("\\s+");
		
		in.close();
	
		long start = System.currentTimeMillis();
		Insertion.sort(a);
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		long now = System.currentTimeMillis();
		System.out.println("Time Taken : " + (now - start) + " ms");
		
	}

}
