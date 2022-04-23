package Day34;

public class Sieve {
    public static int sieveImplementation(int N) {
        int res = 0;
        int isPrime[] = new int[N + 1];
        isPrime[0] = isPrime[1] = 0;
        for (int i = 2; i <= N; i++)
            isPrime[i] = 1;
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i] == 1) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = 0;
                }
            }
        }
        for (int i = 0; i <= N; i++)
            res += isPrime[i];
        return res;
    }

    public static void main(String[] args) {
        int N = 15;
        System.out.println(sieveImplementation(N));

    }
}
