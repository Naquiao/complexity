package ar.balanz.datateam;

public class Factorial {

    int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return factorial(n-1) * n;

    }

    int f(int n){
        if(n <= 1){
            return 1;
        }
        return f(n-1) + f(n-1);
        /*
        4
        3 3
        2 2 2 2
        1 1 1 1 1 1 1 1
        runtime O(2 N)
        spacetime O(N)
        */
    }
}
