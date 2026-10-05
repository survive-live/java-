import java.util.Scanner;

public class IfDemo {
  public static void main(String[]args){
Scanner sc =new Scanner(System.in);

System.out.print("你今年几岁？");
int age=sc.nextInt();

if(age>=18){
    System.out.println("你成年了");
}else{
    System.out.println("你还未成年");
}

sc.close();

  }    
}
