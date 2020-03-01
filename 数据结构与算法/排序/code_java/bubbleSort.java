import java.util.Scanner;

//右侧为排好序的一侧
public class bubbleSort {
    public void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public int[] sortFunc(int[] arr){
        boolean isSwap=false;
        for (int i=arr.length-1;i>=0;i--){
            int j=0;
            while(j<i){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    isSwap=true;
                }
                j=j+1;
            }
            if(isSwap=false)
                break;
        }
      return arr;
    }

}
