package day42;

import java.util.*;

//某校大门外长度为L的马路上有一排树，每两棵相邻的树之间的间隔都是1米。
//
//        我们可以把马路看成一个数轴，马路的一端在数轴0的位置，另一端在L的位置；数轴上的每个整数点，即0，1，2，……，L，都种有一棵树。
//
//        由于马路上有一些区域要用来建地铁。
//
//        这些区域用它们在数轴上的起始点和终止点表示。
//
//        已知任一区域的起始点和终止点的坐标都是整数，区域之间可能有重合的部分。
//
//        现在要把这些区域中的树（包括区域端点处的两棵树）移走。
//
//        你的任务是计算将这些树都移走后，马路上还有多少棵树。
//
//        输入格式
//        输入文件的第一行有两个整数L和M，L代表马路的长度，M代表区域的数目，L和M之间用一个空格隔开。
//
//        接下来的M行每行包含两个不同的整数，用一个空格隔开，表示一个区域的起始点和终止点的坐标。
//
//        输出格式
//        输出文件包括一行，这一行只包含一个整数，表示马路上剩余的树的数目。
//
//        数据范围
//        1≤L≤10000,
//        1≤M≤100
public class day42exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int M = scan.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            list.add(new int[]{l,r});
        }

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> ret = new ArrayList<>();
        int l = Integer.MIN_VALUE;
        int r = Integer.MIN_VALUE;

        for (int[] a :list) {
            if(a[0] > r){
                if(r != Integer.MIN_VALUE){
                    ret.add(new int[]{l,r});
                }
                l = a[0];
                r = a[1];
            }
            else{
                r = Math.max(r,a[1]);
            }
        }

        ret.add(new int[]{l,r});

        int sum = 0;
        for (int[] a:ret) {
            sum += a[1] - a[0] + 1;
        }

        System.out.println(L + 1 - sum);

    }

}
