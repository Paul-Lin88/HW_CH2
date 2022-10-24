package practice1023;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
public class practice22 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入5個人的分數");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		Integer test[]= new Integer[5];
		for(int i=0;i<test.length;i++) 
		{
			String str=br.readLine();
			test[i] =Integer.parseInt(str);
		}
		
		Arrays.sort(test, Collections.reverseOrder());
		
		for(int i=0;i<test.length;i++) 
		{
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}
	}
}
