import java.util.Scanner;

public class insertSort {
    public void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public int[] sortFunc(int[] arr){
        for (int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){ //& 位运算，会判断两个条件，将两个条件的结果位运算，&& 逻辑运算，若第一个条件不满足则不会判断第2个
                swap(arr,j,j-1);
                j=j-1;

            }
        }
        return arr;
    }

}
