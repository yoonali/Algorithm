package Sec01;

import java.util.Scanner;

public class PrintStars1 {

	//*��n������ϵ�w�������ٹٲ����ϴ����α׷��������Ͻÿ�
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n,w;
		
		System.out.println("*�� n�� ����ϵ� w������ ���� �ٲ㼭 ����մϴ�.");
		
		do { 
			System.out.println("n�� :");
			n = stdIn.nextInt();
		}while (n<= 0);
		
		do {
			System.out.println("w�� :");
			w = stdIn.nextInt();
		}while (w <= 0 || w > n);
		
		/*
		 * for (int i = 0; i < n; i++) { System.out.print("*"); if(i % w == w -1)
		 * System.out.println(); //��ٲ� if(n % w != 0) System.out.println(); //��ٲ� }
		 */
		String star = "*";
		
//		//repeat -> jdk 11 ����
//		for(int i = 0; i < n / w; i++)
//			System.out.println(star.repeat(w));
//		
//		int rest = n % w;
//		if(rest != 0)
//			System.out.println(star.repeat(rest));
	}
}
