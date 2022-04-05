import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		int[][] scores; 

		System.out.print("クラスの数>>");
		int classNumber = new Scanner(System.in).nextInt();
		scores = new int[classNumber][];

		for(int i=0; i<scores.length;i++){
			System.out.println(i+1+ "組のクラスの人数>>");
			int member = new Scanner(System.in).nextInt();
			scores[i] = new int[member];
			for(int j=0;j<scores[i].length; j++){
				System.out.print(i+1+"組"+(j+1)+"人目の点数>>");
				scores[i][j] = new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
for(int i=0; i<scores.length; i++){
	System.out.print(i+1+"組");
	for(int j=0; j<scores[i].length; j++){
		System.out.print(scores[i][j]+ " ");
	}
	System.out.println("");
}
	//	System.out.println(classNumber + "組"+ )







	}
}
