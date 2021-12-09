package ar.balanz.datateam;

public class Practice {

    public static void example1(int [] array){
        int sum = 0;
        int product = 1;
        for(int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        for(int i = 0 ; i < array.length ; i++){
            product *= array[i];
        }
    }

    public void example2(int [] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array.length ; j++){
                System.out.println(array[i]+","+array[j]);
            }
        }
    }

    public void example3(int [] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i + 1 ; j < array.length ; j++){
                System.out.println(array[i]+","+array[j]);
            }
        }
    }

    public void example4(int [] arrayA , int [] arrayB){
        for(int i = 0 ; i < arrayA.length ; i++){
            for(int j = 0 ; j < arrayB.length ; j++){
                if(arrayA[i] < arrayB[j]){
                    System.out.println(arrayA[i] + "" + arrayB[j]);
                }
            }
        }
    }

    public void example5(int [] arrayA , int [] arrayB){
        for(int i = 0 ; i < arrayA.length ; i++){
            for(int j = 0 ; j < arrayB.length ; j++){
                for(int k = 0 ; k < 100000 ; k ++){
                    System.out.println(arrayA[i] + "" + arrayB[j]);
                }
            }
        }
    }

    public void example6(){

    }

    public void example7(){}

    public void example8(){}

    public int example9(Node node){

        if(node == null){
            return 0;
        }

        return example9(node.left) + node.value + example9(node.right);

    }

    public boolean example10(int n){
        for(int x = 2 ; x * x <= n ; x++){
            if(n%x==0){
                return false;
            }
        }
        return true;
    }

    public void example11(){
        // escribir la funciòn factorial
    }

    public void example12(){

    }

    public void example13(){
        // hacer una funcion recursiva que calcue el n-esimo numero de fibonacci y calcular O
    }

    public void example14(){
        // hacer una funcion que imprima todos los numeros de fibonacci hasta n
    }

    public void example15(){
        // hacer una funcion que immprima todos los numero de fibonacci hasta n pero que se almacene los numeros calculados
    }

    public int example16(int n){
        if(n < 1){
            return 0;
        }
        else if (n == 1){
            System.out.println(1);
            return 1;
        }
        else{
            int prev = example16(n / 2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }

}
