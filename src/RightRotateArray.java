import java.util.Scanner;

public class RightRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int b= sc.nextInt();
        if (b>n){
            b%=n;
        }
        rotateArray(array,0,n-1);
        rotateArray(array,0,b-1);
        rotateArray(array,b,n-1);
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }

    static void rotateArray(int a[],int start,int end){
        int i=start,j=end,temp;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
}

