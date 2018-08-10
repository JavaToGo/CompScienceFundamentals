package io.javatogo.util;

import java.util.*;

public class Generator {
 
	private static Random random = new Random(System.currentTimeMillis());
    
	
	// method to generate string of length L from given characters
	public static String randomString(int L, String alphas) {
		char[] a = new char[L];

      	for(int i=0; i<L; i++) {
			int t = random.nextInt(alphas.length());
			a[i] = alphas.charAt(t);
		}
		
		return new String(a);
	}
	
	
	/* this method requires 3 arguments.
	 * 1. Number of Strings to be generated.
	 * 2. length of each string.
	 * 3. characters to generate strings from.
     */
	public static void main(String[] args) {
		// check if there are 3 arguments.
		if(args.length != 3)
			System.out.println("Program requires 3 parameters.");
			
		// no of random strings.
		int N = Integer.parseInt(args[0]);		
		
		// length of each string.
		int L = Integer.parseInt(args[1]);
		
		// characters to generate strings from.
		String chars = args[2];
		
		for(int i=0; i<N; i++) {
			System.out.println(randomString(L, chars));
		}
		
	}
}