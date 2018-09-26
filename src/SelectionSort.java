
public class SelectionSort {

	public static void main(String[] args) {
		int n[] = {43,1,9,12,25};
		for(int i=0;i<n.length-1;i++) {
			int k=i;//找出最小值
			for(int j=(i+1);j<n.length;j++) {
				if(n[k]>n[j]) {
					k=j;
				}
			}
			if(i != k) {//跟最前面一筆(未排序)的交換
				int tmp = n[i];
				n[i] = n[k];
				n[k] = tmp;
			}
		}
		for(int num : n) {
			System.out.print(" "+num);
		}
	}

}
