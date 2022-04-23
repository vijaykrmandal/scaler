package Day13_Sorting;

import java.util.Arrays;

public class QuicksortImpl {

    public int partition(int A[], int start, int end) {
        int pivot = A[end]; // pivot element  
        int pIndex = start ;     
        for (int i = start; i < end ; i++)  
        {  
            if (A[i] < pivot)  
            {  
                int temp = A[pIndex];  
                A[pIndex] = A[i];  
                 A[i] = temp;
                pIndex++;  
            }  
        }  
        int temp = A[pIndex];  
        A[pIndex] = A[end];  
        A[end] = temp;  
        return pIndex;  
    }

    public void quickSort(int A[], int start, int end) {
        if (start < end) {
            int pIndex = partition(A, start, end);
            quickSort(A, start, pIndex - 1);
            quickSort(A, pIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int A[] = { 2, 1, 3, 6, 8, 5, 7, 4 };
        int N = A.length;
        QuicksortImpl obj = new QuicksortImpl();
        obj.quickSort(A, 0, N - 1);
        Arrays.stream(A).forEach(a->System.out.println(a));
    }
}
