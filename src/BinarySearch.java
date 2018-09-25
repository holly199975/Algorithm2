import java.util.Scanner;

public class BinarySearch {
	public static int BinarySearch(int[] a,int target) {
		int start = 0;
		int end = a.length -1;
		while(start <= end) {//左邊的索引位置小於右邊索引的位置
			int mid = (start+end)/2;
			if(target > a[mid]) { //所查詢值比中間值大,故值會在中間的右邊數列
				start = mid +1;
			}else if(target < a[mid]) {
				end = mid -1;
			}else 
				return mid;
		}
		return -1; //找不到時
	}
	public static void main(String[] args) {
		int a[] = {9,11,14,22,31};
		int target;
		System.out.print("數列:");
		for(int i=0; i<5; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.println("請輸入一個值:");
		Scanner scanner = new Scanner(System.in);
		target = scanner.nextInt();
		int find = BinarySearch(a, target);
		if(find > -1) {
			System.out.println("此值位於:"+ (find+1));
		}else
			System.out.println("查無此值!");
	}

}
