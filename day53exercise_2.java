package day53;

public class day53exercise_2 {
    static int N;
    static int[][] son = new int[N][26];
    static int[] con = new int[N];
    static int index;

    public static void main(String[] args) {

    }

    public static void insert(String str){
        int p = 0;//0即是根节点，又是空节点
        for (int i = 0; i < str.length(); i++) {
            int u = str.charAt(i) - 'a';
            if(son[p][u] == 0){
                son[p][u] = ++index;
            }
            p = son[p][u];
        }
        con[p]++;
    }


    public static int query(String str){
        int p = 0;
        for (int i = 0; i < str.length(); i++) {
            int u = str.charAt(i) - 'a';
            if(son[p][u] == 0){
                return 0;
            }
            p = son[p][u];
        }
        return con[p];
    }
}
