import java.util.*;
public class SasakiMain{
	public static void main(String[] args){
		System.out.print("クラスの数>>");
		int classNum = new Scanner(System.in).nextInt();
		int[][] classScores = new int[classNum][];
		for(int i=0;i<classScores.length;i++){
			System.out.print(i+1 +"組のクラスの人数>>");
			int num = new Scanner(System.in).nextInt();
			classScores[i] = new int[num];
			for(int j=0;j<num;j++){
				System.out.print((i+1) + "組"+(j+1)+"人目の点数>>");
				classScores[i][j] = new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
		for(int i=0;i<classScores.length;i++){
			System.out.print(i+1 + "組 ");
			for(int j=0;j<classScores[i].length;j++){
				System.out.print(classScores[i][j] + " ");
			}
			System.out.println();
		}
	}
}
