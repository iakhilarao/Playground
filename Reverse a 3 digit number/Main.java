import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   int n,firstdig,seconddig,thirddig,reverse;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    firstdig=n/100;
    seconddig=(n/10)%10;
    thirddig=n%10;
    reverse=(thirddig*100)+(seconddig*10)+firstdig;
    System.out.println(reverse);
  }
}