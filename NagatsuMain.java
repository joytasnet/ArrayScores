import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		System.out.print("クラスの数>>");
		int nc = new Scanner(System.in).nextInt();
		int[][] scores = new int[nc][];
		for(int i=0;i<nc;i++){
			System.out.print((i+1)+"組のクラスの人数>>");
			int np = new Scanner(System.in).nextInt();
      scores[i] = new int[np];
			for(int j=0;j<np;j++){
				System.out.print((i+1)+"組"+(j+1)+"人目の点数>>");
				scores[i][j] = new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
		for(int i=0;i<scores.length;i++){
			System.out.print((i+1)+"組 ");
			for(int j=0;j<scores[i].length;j++){
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
	}
}
