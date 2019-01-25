import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	 Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int val1,val2,val3;
      val1=num1%10;
      val2=num1/100;
      val3=val1+val2;
      System.out.println(val3);
	}
}