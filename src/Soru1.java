import java.util.Random;

public class Soru1 {
    public static void main(String[] args){
        int n=5;
        int[] A=new int[n];
        int[] B=new int[n*2];
        Random rnd=new Random();
        for(int i=0;i<A.length;i++){
            A[i]=rnd.nextInt(100);
        }
        int tmp;

        for(int i=0; i<A.length; i++)
        {
            for(int j=A.length-1 ; j>i;j--)
            {
                if(A[j-1]>A[j])
                {
                    tmp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=tmp;
                }
            }
        }

        for(int i=0;i<B.length/2;i++){
            B[i]=rnd.nextInt(100);
        }

        for(int i=0; i<B.length/2; i++)
        {
            for(int j=B.length/2-1 ; j>i;j--)
            {
                if(B[j-1]>B[j])
                {
                    tmp=B[j-1];
                    B[j-1]=B[j];
                    B[j]=tmp;
                }
            }
        }

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");

        }
        System.out.println();
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println();
        birlestir(A,B);
    }

    public static void birlestir(int[] A, int[] B){
        int i=A.length-1, j=B.length/2-1;
        for(int k=B.length-1;k>0;k--){
            if(A[i]>B[j]){
                B[k]=A[i];
                i--;
            }else if(A[i]<B[j]){
                B[k]=B[j];
                j--;
            }else{
                B[k]=A[i];
                i--;
            }
        }
        for (int k=0;k<B.length;k++){
            System.out.print(B[k]+" ");
        }
    }
}
