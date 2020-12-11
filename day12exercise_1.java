package day12;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

//请编写一个函数，函数内不使用任何临时变量，直接交换两个数的值。
//给定一个int数组AB，其第零个元素和第一个元素为待交换的值，请返回交换后的数组。
public class day12exercise_1 {
    public static int[] Exchange(int[] arr){
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];//arr[1]是arr[0]的值
        arr[0] = arr[0] ^ arr[1];
        return arr;
   }

}


class Out{
    int num = 10;//外部类成员变量
    public void methodOut(){

    }
    class in{
        int num = 20;//内部类成员变量
        public void mthodIn(){
            int num = 30;//内部类方法局部变量
            System.out.println(num);//30
            System.out.println(this.num);//20
            System.out.println(Out.this.num);//10
        }
    }
}
