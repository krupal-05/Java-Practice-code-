import java.io.*;
import java.util.Scanner;

public class D2B{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		d2b(i);
	
	} 

	static void d2b(int n){
		int[] binary =new int[100];
 	int i=0;
	do{  
		binary[i] = n%2;
		     n = n/2;
			i++;
		}while(n>0);
	for(int j=i-1;j>=0;j--){
			System.out.print(binary[j]);
		}
			
		
	
	}



	}