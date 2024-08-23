package Homework_2;
//請設計一支Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
public class Homework2_2 {
	
	public static void main(String[] args) {
		int i;
		int numPro = 1;
		for(i = 1; i <= 10; i++) {
			numPro *= i;
		}
		System.out.println(numPro);
	}

}
