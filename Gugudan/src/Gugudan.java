import java.util.Scanner;

public class Gugudan {
//	public static void main(String[] args) {
		// 2,3단
//		int i;
//		for(i=2; i<=3; i++) {
//			for(int j=1; j<=9;j++) {
//				System.out.printf("%d * %d = %d%n",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		//4단
//		System.out.println("4단");
//		int result = 4*1;
//		System.out.println(result);
//		result = 4*2;
//		System.out.println(result);
//		result = 4*3;
//		System.out.println(result);
//		result = 4*4;
//		System.out.println(result);
//		result = 4*5;
//		System.out.println(result);
//		result = 4*6;
//		System.out.println(result);
//		result = 4*7;
//		System.out.println(result);
//		result = 4*8;
//		System.out.println(result);
//		result = 4*9;
//
//		System.out.println("구구단 중 출력할 단은?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		//6단
//		int i = 1;
//		while(i<10) {
//			System.out.println(6*i);
//			i++;
//		}
		//7단
//		for(i=1;i<10;i++) {
//			System.out.println(7*i);
//		}
		
		//사용자 입력
//		System.out.println("출력할 구구단의 단을 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if(num>1 && num<10) {
//			System.out.println(num+"단");
//			for(int i=1;i<10;i++) {
//				System.out.println(num*i);
//			}
//		}else {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//		}
		
		//배열을 활용한 2단
//		int[] result = new int[9];
//		for(int i=1; i<=result.length; i++) {
//			result[i-1] = 2*i;
//		}
//		
//		for(int i=1; i<=result.length; i++) {
//			System.out.println(result[i-1]);
//		}
//		
		//배열을 활용한 구구단
//		int[] result = new int[9];
//		
//		for(int j=2;j<=result.length;j++) {
//			for(int i=1; i<=result.length;i++) {
//				result[i-1] = j*i;
//			}
//			for(int i=1; i<=result.length;i++) {
//				System.out.println(result[i-1]);
//			}
//			System.out.println();
//		}
	
		//메소드 사용
//		for(int i=2;i<10;i++) {
//			int[] result = calculate(i);
//			print(result);
//		}
//	}
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=1; i<=result.length;i++) {
			result[i-1] = times*i;
		}
		return result;
	}
	public static void print(int[] result) {
		for(int i=1; i<=result.length;i++) {
			System.out.println(result[i-1]);
		}
	}
}
