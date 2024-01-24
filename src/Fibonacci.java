public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Set the number of Fibonacci numbers to generate

        System.out.println("Fibonacci Series (first " + n + " numbers):");
        for (int i = 0; i <= n; i++) {
            System.out.print(generateFibonacciV2(i) + " ");
        }
    }

    private static int generateFibonacciV2(int n){
        if(n<=1){
            return n;
        }
        int current=1;
        int previous=0;
        for(int i=2;i<=n;i++){
            int next = previous+current;
            previous = current;
            current = next;
        }
        return current;
    }

    private static int generateFibonacci(int i)
    {
        if(i<=1)
            return i;
        return generateFibonacci(i-1)+generateFibonacci(i-2);
    }
}
