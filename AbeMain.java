import java.util.*;
public class AbeMain{
	public static void main(String[] args){
		System.out.print("クラスの数>>");
		int cla = new Scanner(System.in).nextInt();
		int[][] scores = new int[cla][];	
		for(int i = 0; i < cla; i++){
			System.out.printf("%d組のクラスの人数>>",i+1);
			int num = new Scanner(System.in).nextInt();
			scores[i] = new int[num];
			for(int j = 0; j < num; j++){
				System.out.printf("%d組%d人目の点数",i+1,j+1);
				int score = new Scanner(System.in).nextInt();
				scores[i][j] = score;
			}
		}
		System.out.println("--表出力--");
		for(int i = 0; i < scores.length; i++){
			System.out.printf("%d組",i+1);
			for(int j = 0; j < scores[i].length; j++){
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
	}
}
