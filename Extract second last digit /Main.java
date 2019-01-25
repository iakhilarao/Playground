import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int n1,f1,f2;
      Scanner a=new Scanner(System.in);
      n1=a.nextInt();
      f1=n1/10;
      f2=f1%10;
      System.out.println(f2);
	}
}