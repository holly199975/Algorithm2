import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			ans=ans*i;
		} // for 結束
		System.out.println(val+ "!="+ans);
	}

}
