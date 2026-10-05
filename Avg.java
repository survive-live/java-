public class Avg {
    public static double getAvg(int[]scores){
        int sum=0;
        for(int i=0;i<scores.length;i++){
            sum=sum+scores[i];
        }
        return sum/(double)scores.length;
    }
    public static void main(String[]args){
        int[]scores={90,85,77,92,88};
        double resurn=getAvg(scores);
        System.out.println("平均分:"+resurn);
    }
}
