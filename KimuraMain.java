import java.util.*;
public class KimuraMain{
	public static void main(String[] arg){
		System.out.print("クラスの数>>");
		int cl_num = new Scanner(System.in).nextInt();
		int[][] cl_scores = new int[cl_num][];
		for(int i=0;i<cl_scores.length;i++){
			System.out.printf("%d組のクラスの人数>>",i+1);
			int inp_mem_num = new Scanner(System.in).nextInt();
			cl_scores[i] = new int[inp_mem_num];
			for(int j=0;j<cl_scores[i].length;j++){
				System.out.printf("%d組%d人目の点数>>",i+1,j+1);
				int inp_mem_sco = new Scanner(System.in).nextInt();
				cl_scores[i][j] = inp_mem_sco;
			}
		}
		System.out.println("--表出力--");
		for(int i=0;i<cl_scores.length;i++){
			System.out.printf("%d組",i+1);
			for(int j=0;j<cl_scores[i].length;j++){
				System.out.printf("%2d ",cl_scores[i][j]);
			}
			System.out.println();
		}
	}
}
