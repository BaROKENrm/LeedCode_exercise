package day73;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class day74exercise_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());//trim()的作用是可以去掉字符串两端的多余的空格
        int[] a = new int[100010];
        int[] num=new int[100010];
        int k=0;
        while(n -- > 0)
        {
            String[] s1 = reader.readLine().split("\\s+");
            for(int i = 0;i < s1.length;i++)
            {
                a[k ++] = Integer.parseInt(s1[i]);
            }
        }
        int min=0x3f3f3f3f;
        for(int i=0;i<k;i++) {
            num[a[i]]++;
            min=Math.min(min, a[i]);
        }
        int m=0,nn=0;
        for(int i=min;i<min+k;i++) {
            if(num[i]==0)m=i;
            if(num[i]>1)nn=i;
        }
        System.out.println(m+" "+nn);
    }
}
