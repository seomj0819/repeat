package for_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("반복 횟수 입력");
		int repeat = input.nextInt();
		for (int i=0 ; i < repeat ; i++) {
			System.out.println(i + ".번 반복");
		}
		System.out.println("다음 문장들 실행");
		for (int i=10 ; repeat < i ; i--) {
			System.out.println(i + ".번 반복");
	}

	}}
