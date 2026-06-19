import java.util.*;

class positive_or_negative_number{
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  System.out.print("Enter the number: ");
  int a=input.nextInt();

  if(a<0){
    System.out.println("Negative Number");
  }
  else if(a==0){
    System.out.println("Zero");
  }
  else{
    System.out.println("Positive Number");
  }

  input.close();
}

}