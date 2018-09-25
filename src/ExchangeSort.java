
public class ExchangeSort {

	public static void main(String[] args) {
		int n[] = {51,23,6,65,15};
		for(int i=0; i<n.length - 1; i++){
			for(int j=(i+1); j<n.length; j++){ 
				if(n[i] > n[j]){
					int tmp = n[i]; //tmp代表暫存
					n[i] = n[j];
					n[j] = tmp;
				}
			}
			}
			for(int num: n){ //num是標號的意思
				System.out.print(num + " ");
			}
	}

}
