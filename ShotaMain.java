import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		System.out.print("クラスの数>>");
		int room = new Scanner(System.in).nextInt();
		int[][] nums=new int[room][];

		for(int i=0; i<nums.length;i++){
			System.out.print(i+1+"組のクラスの人数>>");
			int numbers=new Scanner(System.in).nextInt();
			nums[i]=new int[numbers];
			for(int j=0; j<nums[i].length;j++){
				System.out.print(j+1+"人目の点数を入力>>");
				nums[i][j]=new Scanner(System.in).nextInt();
			}
		}
		System.out.println("--表出力--");
		for(int i=0;i<nums.length;i++){
			System.out.print((i+1)+"組");
			for(int j=0; j<nums[i].length;j++){
				System.out.printf("%3d ",nums[i][j]);
			}
			System.out.println();
		}
	}
}

