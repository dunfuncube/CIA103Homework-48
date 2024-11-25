package Homework_4;

// 班上有8位同學，他們進行了6次考試，請算出每位同學考最高分的次數
// (提示：二維陣列)
public class Homework4_6 {

    public static void main(String[] args) {
        int[][] score = { 
            { 10, 35, 40, 100, 90, 85, 75, 70 },
            { 37, 75, 77, 89, 64, 75, 70, 95 },
            { 100, 70, 79, 90, 75, 70, 79, 90 },
            { 77, 95, 70, 89, 60, 75, 85, 89 },
            { 98, 70, 89, 90, 75, 90, 89, 90 },
            { 90, 80, 100, 75, 50, 20, 99, 75 }
        };

        int[] highestCount = new int[8]; // 儲存每位同學考最高分的次數

        // 計算每次考試中的最高分
        for (int i = 0; i < score.length; i++) {
            int max = score[i][0]; // 初始化最大值
            for (int j = 1; j < score[i].length; j++) {
                if (score[i][j] > max) {
                    max = score[i][j];
                }
            }
            
            // 計算哪些同學取得了最高分
            for (int j = 0; j < score[i].length; j++) {
                if (score[i][j] == max) {
                    highestCount[j]++;
                }
            }
        }

        // 輸出結果
        for (int i = 0; i < highestCount.length; i++) {
            System.out.println((i + 1) + "號同學考最高分的次數: " + highestCount[i]);
        }
    }
}
