import java.util.*;
public class MatsuokaMain{
	public static void main(String[] args){
		System.out.print("クラスの数>>");
		int classroom=new Scanner(System.in).nextInt();
		int classmate=0;
		int[][] scores=new int[classroom][];
		for(int i=0;i<classroom;i++){
			System.out.printf("%d組のクラスの人数",i+1);
			classmate=new Scanner(System.in).nextInt();
			scores[i]=new int[classmate];
				for(int j=0;j<classmate;j++){
					System.out.printf("%d組%d人目の点数",i+1,j+1);
					scores[i][j]=new Scanner(System.in).nextInt();
				}
		}
		System.out.println("--表出力--");
		for(int i=0;i<classroom;i++){
			System.out.printf("%d組",i+1);
			for(int j=0;j<scores[i].length;j++){
				System.out.printf("%d ",scores[i][j]);
			}
			System.out.println();
		}
	}
}
