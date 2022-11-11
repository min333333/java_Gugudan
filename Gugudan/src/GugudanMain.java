import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		//메소드 사용(기본)
//		for(int i=2;i<10;i++) {
//			int[] result = Gugudan.calculate(i);
//			Gugudan.print(result);
//		}
		
//		문제1
//		사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//		예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.
//		System.out.println("2 이상의 값을 입력해주세요.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if(num>1) {
//			System.out.println(num+""+num+"단");
//			for(int i=2;i<=num;i++) {
//				for(int j=1;j<=num;j++) {
//					System.out.println(i+"*"+j+" = "+i*j);
//				}
//			}
//		}else {
//			System.out.println("2이상의 값을 입력해주세요.");
//		}
		
//		문제2
//		사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//		예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
//		팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
		System.out.println("두개의 정수를 ,로 구분하여 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitValue = inputValue.split(",");
		int i = Integer.parseInt(splitValue[0]);
		int j = Integer.parseInt(splitValue[1]);
		
		for(int a=2;a<=i;a++) {
			for(int b=1;b<=j;b++) {
				System.out.println(a+"*"+b+" = "+a*b);
			}
		}
		
	}
}


