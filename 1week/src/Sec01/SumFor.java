package Sec01;

import java.util.Scanner;

public class SumFor {

	//1부터n까지정수의합을구하시오(for문)
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n 값 :");
		int n = stdIn.nextInt();
		
		int sum = 0; //합
		
		/*
		 * for(int i = 1; i<=n; i++) sum += i; //sum에 i를 더함
		 */		
		
		int i = 1;
		while(i<=n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
	}
}

