import java.util.Scanner;

public class Talk {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("你叫什么名字");
        String name=sc.nextLine();

        System.out.print("你今年几岁");
        int age=sc.nextInt();

        System.out.println("你好呀，"+name+"!");
        System.out.println("原来你"+age+"岁了，真年轻~");

        sc.close();

    }
    
}
