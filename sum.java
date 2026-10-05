public class sum{
    public static void main(String[]args){
        int sum=0;
        int[]scores={90,85,77,92,88};
        for(int i=0;i<scores.length;i++){
        sum=sum+scores[i];
        }
        System.out.println(sum);
        System.out.println("平均分:"+sum/(double)scores.length);
    }
}