package Homework_1;
// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
public class Homework1_5 {
	
	public static void main(String[] args) {
		double presentValue = 1_500_000;
		double rate = 0.02;
		double year = 10;
		double finalValue = presentValue * Math.pow(1+rate,year);
		
		System.out.println("某人在 " + year + " 年後，本金加利息總共有 " + finalValue + " 元。");
				
	}

}
