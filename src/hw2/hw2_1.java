package hw2;
//請設計一支Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
public class hw2_1 {

	public static void main(String[] args) {
		int sum = 0;
		int i, j = 1000;
		for(i = 1; i <= j; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~1000 的偶數和 = " + sum);			
	}
	
}
