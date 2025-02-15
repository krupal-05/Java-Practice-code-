import java.util.Scanner;
  
 class swap{

    public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  int  num1 = sc.nextInt();
	  int num2 = sc.nextInt();
System.out.println("After Swape");
System.out.println("A ="+ num1);
System.out.println("B ="+ num2);

		int temp = num1;
		    num1 = num2;
		    num2 = temp;

System.out.println("befor Swape");
System.out.println("A ="+ num1);
System.out.println("B ="+ num2);	

	}
}