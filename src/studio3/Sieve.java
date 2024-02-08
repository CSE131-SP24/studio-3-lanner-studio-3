package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a number" );
		int n = in.nextInt();
		
		int[] numbList = new int[n-1];
	   
		for(int i = 0; i <= n-2; i++){
			numbList[i] = i+2;
		}
		for(int k = 2; k < n-1; k++) {
			if(numbList[k] != 0) {
				for(int j = k+1; j <= numbList.length-1; j+=(k+1)) {
					numbList[j] = 0;
				}
			}
		}
		for(int p = 0; p < numbList.length; p++) {
			if(numbList[p] != 0)
				System.out.print(numbList[p] + " ");
		}
		
	}

}
