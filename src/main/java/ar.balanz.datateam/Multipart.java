package ar.balanz.datateam;

public class Multipart {
    public static void AplusB(int [] A, int [] B){
        // O(A + B)
        for(int a : A ){
            System.out.println(a);
        }
        for(int b : B ){
            System.out.println(b);
        }
    }
    public static void AtimesB(int [] A, int [] B){
        // O(A*B)
        for(int a : A){
            for(int b : B){
                System.out.print("(" + a + "," + b + ")   ");
            }
            System.out.println();
        }
    }
    public static void AtimesBovertwo(int [] A, int [] B){
        // O(A*B / 2) = O(N2 / 2) = O(N2)
        for(int a : A){
            for(int b : B){
                if(a < b) {
                    System.out.print("(" + a + "," + b + ")   ");
                }
            }
            System.out.println();
        }
    }
    public static void AtimesBovertwoINVERTED(int [] A, int [] B){
        // O(A*B / 2) = O(N2 / 2) = O(N2)
        for(int a : A){
            for(int b : B){
                if(a >= b) { // el igual decide si aparece la diagonal o no
                    System.out.print("(" + a + "," + b + ")   ");
                }
            }
            System.out.println();
        }
    }
}
