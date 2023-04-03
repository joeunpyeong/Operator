import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sData = sc.nextLine();
		
		int data = Integer.parseInt(sData) % 2;
		System.out.println(data == 0 ? "짝수" : "홀수");
		
		//콘솔창을 통해서 입력받아온 String데이터를 int로  바꾼 후 해당
		//숫자가 짝수인지 또는 홀수인지 판단하여 콘솔창에 출력
		
		
		System.out.print("num1의 값을 입력 : ");
		String sData1 = sc.nextLine();
		int num1 = Integer.parseInt(sData1);
		System.out.print("num2의 값을 입력 : ");
		String sData2 = sc.nextLine();
		int num2 = Integer.parseInt(sData2);
		System.out.println("\nnum1 + num2 =" + (num1+num2));
		System.out.println("num1 - num2 =" + (num1-num2));
		System.out.println("num1 * num2 =" + (num1*num2));
		System.out.println("num1 / num2 =" + (num1/num2)+"\n");

		String a = num1 > num2 ?">" : num1 < num2 ?"<" : "==";
		
		System.out.print(num1);
		System.out.print(a);		
		System.out.print(num2);
		//콘솔창을 통해서 String 데이터를 (숫자) 두개 입력받는다.
		//콘솔창을 통해서 String데이터(숫자)를 두개 입력받는다.
		//각각의 숫자는 num1과 num2로 구분한다.
		//두 숫자의 더하기, 빼기, 곱하기, 나누기 한 결과를 출력하기
		//두 숫자 중 더 큰 숫자가 어떤 숫자인지 표시하기

		
	}
}
