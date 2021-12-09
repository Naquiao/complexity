package ar.balanz.datateam;

public class AmortizedTime {

    /*
    Lo importante aca es el hecho bàsico que N < logN

    lo cual tambien significa que

    N*logN < N*N

    VER GRÀFICOS

    logaritmo significa dividir muchas veces

    es mas natural pensar en multiplicar muchas veces, lo que se conoce como interes compuesto

    dividir  muchas veces es lo que hace la inflacion, en Argentina la inflacion promedio es 53.3% anual, lo cual es equivalente a un logaritmo en base dos

    */

    static int MIN = 0;
    static int MAX = 10000000; // 10 millones

    public static void logN(){
    /*

    Supongamos que tenemos 100 000 000 MILLONES DE (dolares,pesos argentinos, bolivares)

    los tenemos en:

    > billetes de 1
    > billetes de 10
    > billetes de 100
    > billetes de 1000
    ...
    > billetes de 100 000 000

    Y los queremos contar

    */
        double [] step  = {1,10,100,1000,10000,100000,1000000,10000000};
        double [] times = {0,0,0,0,0,0,0,0};

        times[0] = count(1,false);
        times[1] = count(10,false);
        times[2] = count(100,false);
        times[3] = count(1000,false);
        times[4] = count(10000,false);
        times[5] = count(100000,false);
        times[6] = count(1000000,true);
        times[7] = count(10000000,true);

        for(double d : times){
            System.out.println(d);
        }



    }

    private static double count(int step,boolean v){
        double start = 0;
        double end = 0;
        double elapsed = 0;
        start = System.currentTimeMillis();
        for(int i = MIN ; i < MAX ; ){
            i = i + step;
            if(v){
                System.out.println(i);
            }
        }
        end = System.currentTimeMillis();
        elapsed = end - start;
        return elapsed;
    }

    public static void NlogN(){

        int N = 100;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N / 4 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static int linearSearch(int target , int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}
