public class max {

    public static int getmax(int[]scores){
        int max=scores[0];
        for(int i=1;i<scores.length;i++){
            if(scores[i]>max){
                max=scores[i];
            }
        }
        return max;
    }

    public static void main(String[]args){
        int[]scores={90,85,77,92,88};
        int max=getmax(scores);
        System.out.println("最高分是:"+max);
    }

}
