package day100;
//剑指 Offer 65. 不用加减乘除做加法
public class day100exercise_3 {
    public int add(int num1, int num2) {
        while(num2 != 0){
            int sum = num1 ^ num2;
            int carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
