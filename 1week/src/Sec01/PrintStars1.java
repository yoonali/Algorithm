package Sec01;

import java.util.Scanner;

public class PrintStars1 {

	//*를n개출력하되w개마다줄바꿈을하는프로그램을구현하시오
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n,w;
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		
		do { 
			System.out.println("n값 :");
			n = stdIn.nextInt();
		}while (n<= 0);
		
		do {
			System.out.println("w값 :");
			w = stdIn.nextInt();
		}while (w <= 0 || w > n);
		
		/*
		 * for (int i = 0; i < n; i++) { System.out.print("*"); if(i % w == w -1)
		 * System.out.println(); //즐바꿈 if(n % w != 0) System.out.println(); //즐바꿈 }
		 */
		String star = "*";
		
//		//repeat -> jdk 11 지원
//		for(int i = 0; i < n / w; i++)
//			System.out.println(star.repeat(w));
//		
//		int rest = n % w;
//		if(rest != 0)
//			System.out.println(star.repeat(rest));
	}
}
