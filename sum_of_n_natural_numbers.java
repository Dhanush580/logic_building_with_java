import java.util.Scanner;

class sum_of_n_natural_numbers{
  public static void main(String[] args) {
    Scanner ip=new Scanner(System.in);
    System.out.print("Enter value of n: ");
    
    int n=ip.nextInt();

    int sum=0;
    for(int i=1; i<=n; i++){
      sum+=i;
    }
    System.out.println("sum of natural number upto "+n+" is "+sum);

    ip.close();
  }
}