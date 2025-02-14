import java.io.*;
import java.util.Scanner;

public class fibonai {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int f=sc.nextInt();
        System.out.println(fibo(f));
        
        
    }
        static int fibo(int n){
            if(n<2)
            return 1;

            return fibo(n-1)+fibo(n-2);
        }


}
