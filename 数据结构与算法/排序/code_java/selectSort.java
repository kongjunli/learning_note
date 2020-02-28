import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class selectSort {
    public int[] getInput(int n){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[n];
        System.out.println("input:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public int[] sortFuc(int[] arr){
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[index])
                    index=j;
            }
            swap(arr,i,index);
        }

        return arr;
    }
    public static void main(String[] args){
        selectSort ex=new selectSort();
        int[] arr=ex.getInput(6);
        int[] result=ex.sortFuc(arr);
        for (int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");

    }

}

