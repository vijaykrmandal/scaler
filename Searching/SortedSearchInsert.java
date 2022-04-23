package Searching;

public class SortedSearchInsert {
    public int searchInsert(int[] A, int B) {
        int L = 0;
        int R = A.length - 1;
        int pos = -1;
        int M = 0;
        if (B > A[R])
            return R + 1;
        if (B < A[0])
            return 0;
        while (L <= R) {
            M = L + (R - L) / 2;
            if (B == A[M])
                return M;
            if (B < A[M]) {
                R = M - 1;
                pos = M;
            } else {
                L = M + 1;
                pos = L;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int A[] = { 17, 30, 32, 69, 94, 96, 106, 118, 127, 159, 169, 170, 178, 183, 209, 238, 242, 247, 253, 261, 265,
                279, 288, 302, 305, 316, 352, 357, 374, 376, 392, 402, 410, 421, 439, 442, 444, 446, 454, 458, 464, 467,
                468, 498, 500, 513, 523, 541, 545, 556, 575, 608, 616, 629, 631, 635, 669, 674, 682, 686, 693, 695, 719,
                733, 754, 755, 756, 778, 802, 822, 824, 828, 835, 847, 848, 862, 864, 878, 883, 885, 904, 908, 928,
                934 };
        int B = 104;
        SortedSearchInsert obj = new SortedSearchInsert();
        System.out.println(obj.searchInsert(A, B));
    }
}
