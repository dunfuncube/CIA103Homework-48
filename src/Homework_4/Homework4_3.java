package Homework_4;

//有個字串陣列如下(八大行星)：{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//(提示：字元比對，String方法)

public class Homework4_3 {
	
	public static void main(String[] args) {
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		
		for (String planet : planets) {
			for (int i = 0; i < planet.length(); i++) {
				char ch = planet.charAt(i);
				switch (ch) {
					case 'a', 'e', 'i', 'o', 'u':
						count++;
						break;
					default:
						break;
				}
			}
		}
		System.out.println("行星陣列內共有 " + count + " 個母音！");
	}

}
