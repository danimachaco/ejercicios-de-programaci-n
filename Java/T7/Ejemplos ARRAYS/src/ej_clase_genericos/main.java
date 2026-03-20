package ej_clase_genericos;

import java.util.ArrayList;

public class main {
    public static ArrayList<Integer> metodoArrayListInteger (Integer[] array) {

        ArrayList<Integer> arraySalida = new ArrayList<>();

        for (Integer x: array) {
            arraySalida.add(x);
        }
        return arraySalida;

    }

    public static ArrayList<Double> metodoArrayListDouble (Double[] array) {
        ArrayList<Double> arraySalida = new ArrayList<>();
        for (Double x: array) {
            arraySalida.add(x);
        }
        return arraySalida;

    }
    public static <V> ArrayList<V> convertirToArray (V[] array) {
        ArrayList<V> arraySalida = new ArrayList<>();
        for (V x: array) {
            arraySalida.add(x);
        }
        return arraySalida;
    }



    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[]{1,2,3,4,5};
        Double[] arrayDouble = new Double[]{1.0,2.0,3.0,4.0,5.0};
        String[] arrayString = new String[]{"pirry","bfdv","dfzsv","zbxgf","zdf"};

        ArrayList<Integer> arrayFinalInteger = new ArrayList<>();
        arrayFinalInteger = metodoArrayListInteger(arrayInteger);
//        System.out.println(arrayFinalInteger);

        ArrayList<Double> arrayFinalDouble = new ArrayList<>();
//        arrayFinalDouble = metodoArrayListDouble(arrayDouble);
//        System.out.println(arrayFinalDouble);

        ArrayList<Integer> arrayFinalArray = new ArrayList<>();
        arrayFinalDouble = convertirToArray(arrayDouble);
//        System.out.println(arrayFinalDouble);

        ArrayList<String>  arrayFinalString = new ArrayList<>();
        arrayFinalString = convertirToArray(arrayString);
        System.out.println(arrayFinalString);
    }
}


