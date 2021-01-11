package MyCalendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1,s2;
		System.out.println("두 수를 입력하세요.");
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d와 %d의 합은 %d입니다.",a,b,a+b);
		scanner.close();
	}
}
