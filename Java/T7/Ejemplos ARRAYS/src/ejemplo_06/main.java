package ejemplo_06;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] array1={3,5,2,4,6,9};
        int variable=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i] % 2 != 0){
                variable++;
            }
        }

        int[] array2 = new int[variable];
        int variable2 = 0;

        for(int j=0;j<array1.length;j++){
            if(array1[j] % 2 != 0){
                int x =  array1[j];
                array2[variable2] = x;
                variable2++;
            }
        }

        System.out.println("Array1: "+ Arrays.toString(array1));
        System.out.println("Array2: "+ Arrays.toString(array2));

    }
}
