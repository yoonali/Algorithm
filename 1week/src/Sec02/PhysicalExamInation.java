package Sec02;

import java.util.Scanner;

//��ü�˻� �����Ϳ� Ŭ���� �迭���� ��� Ű�� �÷��� ������ ���Ͻÿ�
public class PhysicalExamInation {

	static class PhyscData {
		String name;
		int height;
		
		//������
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
				new PhyscData("������", 160),
				new PhyscData("������", 160),
				new PhyscData("��ȿ��", 160),
				new PhyscData("������", 169),
		};
		
		System.out.println("��ü�˻� ����Ʈ");
		System.out.println("�̸� Ű �÷�");
		System.out.println("-----------------");
		for(int i = 0; i < x.length; i++) 
			System.out.printf("%-6s%3d\n",
					x[i].name, x[i].height);
		
		System.out.printf("\n ���Ű: %5.1fcm\n", aveHeight(x));
		
	}
}
