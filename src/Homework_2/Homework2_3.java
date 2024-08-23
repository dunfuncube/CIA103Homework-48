package Homework_2;
//請設計一支Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
public class Homework2_3 {
	
	public static void main(String[] args) {
		int i = 1;
		int numPro = 1;
		while ( i <= 10 ) {
			numPro *= i;
			i++;
		}
		System.out.println(numPro);
		
	}

}
