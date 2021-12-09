package ar.balanz.datateam;

public class Constants {
    public static void f(){
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        min = max - 5;
        for(int i = min ; i < max ; i++ ) {
            System.out.println(i);
        }
    }
    public static void twof(){
        f();
        f();
    }
    /*

    O significa COTA SUPERIOR

    f y twof TIENEN LA MISMA COMPLEJIDAD!
    O(N) = O(2*N)

    lo mismo pasa para este caso , el cual vamos a ver en multipart

    O(N2 + N) = O(N2)
    */
}
