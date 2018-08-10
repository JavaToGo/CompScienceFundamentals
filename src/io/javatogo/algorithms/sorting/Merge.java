package io.javatogo.algorithms.sorting;

import java.util.Scanner;

/**
 * <p> This is an implementation of Merge sort algorithm.
 * 
 * @author JavaToGo
 *
 */
public class Merge {
	
	private static String[] aux;
	
	public static void merge(String[] a, int lo, int mid, int hi) {
		
		int i = lo, j = mid, N = (hi-lo);
		
		for(int k=0; k < N; k++) {
			if(i == mid) aux[k] = a[j++];
			else if(j == hi) aux[k] = a[i++];
			else if (a[j].compareTo(a[i]) < 0) aux[k] = a[j++];
			else aux[k] = a[i++];
		}
		
		for(int k=0; k < N; k++)
			a[lo + k] = aux[k];
	}

	public static void sort(String[] a) {
		aux = new String[a.length];
		sort(a, 0, a.length);
	}
	
	private static void sort(String[] a, int lo, int hi) {
		int N = (hi - lo);
		if(N <= 1) return;
		
		int mid = lo + N/2;
		sort(a, lo, mid);
		sort(a, mid, hi);
		merge(a, lo, mid, hi);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] a = line.split("\\s+");
		
		in.close();
	
		long start = System.currentTimeMillis();
		Merge.sort(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		long now = System.currentTimeMillis();
		System.out.println("Time Taken : " + (now - start) + " ms");
		
	}

}