import java.util.Arrays;
import java.util.Scanner;

public class ConverterTest {
	public static void main(String[] args) {
		
		System.out.println((char)70);
		Scanner scanner = new Scanner(System.in);
//		System.out.print("이진수로 변환할 십진수를 입력하세요: ");
//		int a = scanner.nextInt();
//		
//		int binary[] = new int[8];
//		int index= binary.length-1;
//		while(a!=0) {
//			binary[index--] = a%2;
//			a /= 2;
//		}
//		System.out.println(Arrays.toString(binary));
//		
//		System.out.print("팔진수로 변환할 십진수를 입력하세요: ");
//		int b = scanner.nextInt();
//		
//		int octa[] = new int[8];
//		int index2= octa.length-1;
//		while(b!=0) {
//			octa[index2--] = b%8;
//			b /= 8;
//		}
//		System.out.println(Arrays.toString(octa));
		
		System.out.print("16진수로 변환할 십진수를 입력하세요: ");
		int c = scanner.nextInt();
		
		int hexa[] = new int[8];
		int index3= hexa.length-1;
		
		while(c!=0) {
			if(c%16>=10) {
				hexa[index3--] = (char)(c%16-10+65);
			}else hexa[index3--] = c%16;
			c /= 16;
		}
		System.out.println(Arrays.toString(hexa));
	}
}
