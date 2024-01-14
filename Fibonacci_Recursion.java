public class Fibonacci {
    public static int findNthFib(int n){
        // if(n==0){
        //     return 0;
        // }else if(n==1){
        //     return 1;
        // }

        //OR

        if(n==0 || n==1){
            return n;
        }
        int fib_nm2 = findNthFib(n-2);
        int fib_nm1 = findNthFib(n-1);
        int fib_n = fib_nm1+fib_nm2;
        return fib_n;
    }
    public static void main(String args[]){
        System.out.println(findNthFib(6));
    }
}
