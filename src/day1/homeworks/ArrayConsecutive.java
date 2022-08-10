package day1.homeworks;

public class ArrayConsecutive {
    public static void main(String[] args) {
        int[] v ={4,4,2,5,6,6,9};
        consecutive(v);


    }
    static int[] consecutive(int[] x){
        int number=0;
        for(int i=0;i<x.length-1;i++){
            if(x[i]==x[i+1]){
                number++;
            }
        }
        int[] y=new int[number];
        for(int i=0;i<y.length;i++){
            for (int j=i;j<x.length-2;j++){
                if (x[j]==x[j+1]){
                    y[i]=x[j];
                    break;
                }
            }
        }

        for (int r:y) {
            System.out.println(r);

        }
        x=y;
        return y;
    }
}
