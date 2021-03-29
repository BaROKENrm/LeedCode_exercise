package day97;

public class MyPriorityQueue {
  int size;
  int[] arr;

    public MyPriorityQueue(int size, int[] arr) {
        size = 0;
        arr = new int[100];
    }

    public int peek(){
        if(size == 0){
            throw new RuntimeException("空");
        }
        return arr[0];
    }

    public void add(int x){
        arr[size ++] = x;
        adjustUp(size - 1);
    }

    public int remove(){
        if(size == 0){
            throw new RuntimeException("空");
        }
        int ret = arr[0];
        arr[0] = arr[size - 1];
        adjustDown(arr[0]);
        return ret;
    }

    private void adjustUp(int index){
        while(true){
            if(index == 0){
                return;
            }
            int parentIndex = (index - 1) / 2;
            if(arr[parentIndex] > arr[index]){
                return;
            }
            swap(arr,index,parentIndex);
            index = parentIndex;
        }
    }

    private void adjustDown(int index){
        while(true){
            if(index * 2 + 1 > size){
                return;
            }
            int maxIndex = index * 2 + 1;
            if(maxIndex + 1 < size && arr[maxIndex + 1] > arr[maxIndex]){
                maxIndex ++;
            }
            if(arr[index] >= arr[maxIndex]){
                return;
            }
            swap(arr,index,maxIndex);
            index = maxIndex;
        }
    }


    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
