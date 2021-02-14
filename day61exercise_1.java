package day61;

public class day61exercise_1 {
    public int minSwapsCouples(int[] row) {
        UnionFindSet unionFindSet = new UnionFindSet(row.length / 2);
        for (int i = 0; i < row.length; i+=2) {
            unionFindSet.union(row[i] / 2, row[i+1] / 2);
        }

        return unionFindSet.getCount();
    }
}

class UnionFindSet {
    int count;
    int[] f;

    public UnionFindSet(int n) {
        this.count = 0;
        f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = i;
        }
    }

    public int find(int x) {
        int fx = f[x];
        // 路径压缩
        if (fx != f[fx]) f[x] = find(fx);

        return f[x];
    }

    public void union(int x, int y) {
        int fx = find(x);
        int fy = find(y);

        if (fx != fy) {
            f[fx] = fy;
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
