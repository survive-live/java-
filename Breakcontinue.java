public class Breakcontinue {
    public static void main(String[]args){
        System.out.println("break示例");
        for(int i=1;i<=10;i++){
        if(i==5){
            break;
        }
        System.out.println(i);
    }
    System.out.println("continue示例");
    for(int i=1;i<=10;i++){
        if(i==5){
            continue;
        }
        System.out.println(i);
    }
    }
}
