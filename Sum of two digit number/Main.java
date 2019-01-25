import java.util.*;
class Main {
	public static void main (String[] args) {
		int n1,f1,f2,op;
      Scanner sc=new Scanner(System.in);
      n1=sc.nextInt();
      f1=n1%10;
      f2=n1/10;
      op=f1+f2;
     System.out.println(op);
	}
}