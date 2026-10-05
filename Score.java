import java.util.Scanner;

public class Score {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("你的分数？");
    int Score=sc.nextInt();

    if(Score>=90){
        System.out.println("优秀");
    }else if(Score>=80){
    System.out.println("良好");
    }else if(Score>=60){
        System.out.println("及格");
    }else{
        System.out.println("不及格，加油");
    }
    sc.close();
  }  
}
