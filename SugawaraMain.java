import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		System.out.print("クラスの数>>");
		int room = new Scanner(System.in).nextInt();
		int[][] scores = new int[room][];

		for(int i=0 ; i<scores.length ; i++){
			System.out.printf("%d組の人数>>",i+1);
			int students = new Scanner(System.in).nextInt();
			scores[i] = new int[students];
			for(int j=0 ; j<scores[i].length ; j++){
				System.out.printf("%d人目の点数>>",j+1);
				scores[i][j] = new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
		for(int i=0 ; i<scores.length ; i++){
			System.out.printf("%d組 ",i+1);
			for(int j=0 ; j<scores[i].length ; j++){
				System.out.printf("%d ",scores[i][j]);
			}
			System.out.println();
		}
	}
}
