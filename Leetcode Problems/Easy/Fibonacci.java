import java.util.Scanner;

class Fibonacci {

    public int fib(int n){
        if(n==0)    return 0;
        else if(n==1 || n==2)   return 1;
        return  fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Fibonacci fb = new Fibonacci();

        int result = fb.fib(n);

        System.out.println(result);
        sc.close();
    }

}