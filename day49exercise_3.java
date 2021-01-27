package day30sort;

import com.sun.org.apache.xerces.internal.util.XMLEntityDescriptionImpl;

import java.util.Arrays;

public class mergeSort {
    static int[] temp = new int[1000];
    public static void main(String[] args) {
        int[] arr = {9,18,27,16,35,14,21,23,1};
        mergeSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int l,int r){
        if(l >= r){
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid + 1,r);
        int k = 0,i = l,j = mid + 1;
        while(i <= mid && j <= r){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= r){
            temp[k++] = arr[j++];
        }
        for (i = l,j = 0;i <= r;i++,j++) {
            arr[i] = temp[j];
        }
    }
}
