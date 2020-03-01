import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class selectSort {
    public void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public int[] sortFunc(int[] arr){
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
}

