import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		int[][] scores;
		System.out.print("クラスの数>>");
		int number = new Scanner(System.in).nextInt();
		scores = new int[number][];

		for(int i =0;i<scores.length;i++){
			System.out.printf("%d組のクラスの人数>>",i+1);
			int classmate = new Scanner(System.in).nextInt();
			scores[i] = new int[classmate];
			for(int j=0;j<scores[i].length;j++){
				System.out.printf("%d組の%d人目の点数>>",i+1,j+1);
				int point = new Scanner(System.in).nextInt();
				scores[i][j] = point;
			}
		}

		System.out.println("--表出力--");
		for(int i=0;i<scores.length;i++){
			System.out.printf("%d組 ",i+1);
			for(int j=0;j<scores[i].length;j++){
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
	}
}
