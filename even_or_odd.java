import java.util.Scanner;

public class even_or_odd {
  public static void main(String[] args) {
    Scanner ip=new Scanner(System.in);

    System.out.println("Enter the number: ");
    int a=ip.nextInt();

    //using modulo "%" operator

    // if(a%2==0){
    //   System.out.println("Even Number");
    // }
    // else{
    //   System.out.println("Odd Number");
    // }


    // using "&" operator

    if((a&1)==0){
      System.out.println("Even Number");
    }
    else{
      System.out.println("Odd Number");
    }
    ip.close();
  }
}
