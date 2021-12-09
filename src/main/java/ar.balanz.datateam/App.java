package ar.balanz.datateam;

public class App {
    public static void main (String[] args){
        System.out.println("Complexity");

        Constants.f();
        Constants.twof();

        int [] A = {0,1,2,3,4,5,6,7,8,9};
        int [] B = {0,1,2,3,4,5,6,7,8,9};
        Multipart.AplusB(A,B);
        System.out.println();
        Multipart.AtimesB(A,B); // batalla naval
        System.out.println();
        Multipart.AtimesBovertwo(A,B);
        System.out.println();
        Multipart.AtimesBovertwoINVERTED(A,B);
        System.out.println();
        AmortizedTime.logN();
        AmortizedTime.NlogN();

    }
}
