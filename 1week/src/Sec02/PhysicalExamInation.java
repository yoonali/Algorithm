package Sec02;

import java.util.Scanner;

//신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구하시오
public class PhysicalExamInation {

	static class PhyscData {
		String name;
		int height;
		
		//생성자
		PhyscData(String name, int height) {
			this.name = name;
			this.height = height;
		}
	}
	
	static double aveHeight(PhyscData[] data) {
		double sum = 0;
		
		for (int i = 0;i < data.length; i++) 
			sum += data[i].height;
		return sum/data.length;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[]x = {
				new PhyscData("임유나", 160),
				new PhyscData("유예린", 160),
				new PhyscData("김효진", 160),
				new PhyscData("최혜림", 169),
		};
		
		System.out.println("신체검사 리스트");
		System.out.println("이름 키 시력");
		System.out.println("-----------------");
		for(int i = 0; i < x.length; i++) 
			System.out.printf("%-6s%3d\n",
					x[i].name, x[i].height);
		
		System.out.printf("\n 평균키: %5.1fcm\n", aveHeight(x));
		
	}
}
