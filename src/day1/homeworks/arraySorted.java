package day1.homeworks;

public class arraySorted {
    public static void main(String[] args) {
       int[] v={1,2,8,4};
       sorted(v);
    }
    static int[] sorted(int[] x){
        boolean sortat=false;
        for(int i=0;i<x.length-1;i++){
            if(x[i]<x[i+1]){
                sortat=true;
            }else{
                sortat=false;
                break;
            }
        }
        if(sortat){
            System.out.printf("Array sorted");
        }else{
            System.out.println("Not sorted");
        }
        return x;
    }
}
