import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		System.out.print("クラスの数>>");
		int cNum = new Scanner(System.in).nextInt();
		int[][] scores = new int [cNum][];
		for(int i =0;i<cNum;i++){
			System.out.printf("%d組のクラスの人数>>",i+1);
			int sNum = new Scanner(System.in).nextInt();
			scores[i]= new int[sNum];
			for(int j =0;j<sNum;j++){
				System.out.printf("%d組の%d人目の点数>>",i+1,j+1);
				scores[i][j] = new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
		for(int i =0;i<scores.length;i++){
			System.out.printf("%d組",i+1);
			for(int j=0;j<scores[i].length;j++){
				System.out.printf("%d ",scores[i][j]);
			}
			System.out.println();
		}
	}
}
