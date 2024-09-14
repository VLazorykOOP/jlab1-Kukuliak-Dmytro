public class Task2 {
    public
    int x[];
    int a,b;
    Task2(int A,int B,int[] X){
       x=X;a=A;b=B;
    }
    public int SumA(){
        int result=0;
        for(int i=0;i<a;i++){
            result+=x[i];
        }
        return result;
    }
    public int dobutB(){
        int result=0;
        for(int i=b;i<x.length;i++){
            result*=x[i];
        }
        return result;
    }
    public int min(){
        int min=0;
        for(int i=0;i<a;i++){
            if(x[i]<min){
                min=x[i];
            }
        }
        return min;
    }
    public int max(){
        int max=0;
        for(int i=0;i<a;i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        return max;
    }
}
