package MyCalendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public void printSampleCalendar() {
		System.out.println("SUN MON TUE WED THU FRI SAT");
		System.out.println("---------------------------");
		System.out.println(" 1   2   3   4   5   6   7 ");
		System.out.println(" 8   9  10  11  12  13  14 ");
		System.out.println("15  16  17  18  19  20  21 ");
		System.out.println("22  23  24  25  26  27  28 ");
	}
	
	public static void main(String[] args) {
		
		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n",month,cal.maxDaysOfMonth(month));
		
		cal.printSampleCalendar();
		
		scanner.close();
	}
}
