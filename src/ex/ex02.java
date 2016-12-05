package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021061 李柏毅
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		double x = 0 , y = 0;
		
		if(n <= 120){x = y = n * 2.1;}
		else if(n <= 330){
			x = (n - 120) * 3.02 + 252 ; y = (n - 120) * 2.68 + 252;}
		else if(n <= 500){
			x = (n - 330) * 4.39 + 886.2 ; y = (n - 330) * 3.61 + 814.8;}
		else if(n <= 700){
			x = (n - 500) * 4.97 + 1632.5 ; y = (n - 500) * 4.01 + 1428.5;}
		else if(n > 700){
			x = (n - 700) * 5.63 + 2626.5 ; y = (n - 700) * 4.50 + 2230.5;}
		System.out.println(x);
		System.out.println(y);

	}

}
