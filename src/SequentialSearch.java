import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[] = new int[5];
			a[0] = 22;
			a[1] = 56;
			a[2] = 2;
			a[3] = 29;
			a[4] = 87;
			System.out.print("數列:");
			for(int i=0; i<5; i++) {
				System.out.print(a[i]+"\t");
			}
			System.out.println();
			System.out.println("請輸入一個值:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int value = Integer.parseInt(line);
			for(int i=0; i<5; i++) {
				if(a[i]==value) {
					System.out.println("此值在第"+(i+1)+"的位置");
					
				}
			}
			
			
		
	}

}
