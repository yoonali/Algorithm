package Sec01;

import java.util.Scanner;

public class SumFor {

	//1����n�����������������Ͻÿ�(for��)
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n �� :");
		int n = stdIn.nextInt();
		
		int sum = 0; //��
		
		/*
		 * for(int i = 1; i<=n; i++) sum += i; //sum�� i�� ����
		 */		
		
		int i = 1;
		while(i<=n) {
			sum += i;
			i++;
		}
		
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�.");
	}
}

