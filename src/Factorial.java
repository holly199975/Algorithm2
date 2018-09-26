import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)  {
		int i,val,ans;
		System.out.print("請輸入要計算階乘的數字：");
		Scanner scanner = new Scanner(System.in);
		val = scanner.nextInt();
		ans=1;
		for (i=1;i<=val;i=i+1)
		{
			ans=ans*i;     // 1*...*(n-2)*(n-1)*n
		} // for 結束
		System.out.println(val+ "!="+ans);
	}

}
