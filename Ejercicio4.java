package Examen4.Ejercicio4;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[][] matriz3x3 = {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
        System.out.println("La matriz es:");
        imprimirMatriz(matriz3x3);
        System.out.println("La Primera Diagonal es:");
        diagonal1(matriz3x3);
        System.out.println("La Segunda Diagonal es:");
        diagonal2(matriz3x3);
        

    }
    public static void imprimirMatriz(String[][] matriz3x3){
        for (int i= 0; i<matriz3x3.length; i++){
            for (int j = 0; j<matriz3x3[i].length; j++){

            } System.out.println(Arrays.toString(matriz3x3[i]));
        }
    }

    public static void diagonal1 (String[][] matriz3x3){
        for (int i= 0; i<matriz3x3.length; i++){
            for (int j = 0; j<matriz3x3[i].length; j++){
                if (i==j){
                    System.out.println(matriz3x3[i][j]);
                    /**
                     * Aquí lo que hago es utilizar un if para que cuando i sea igual a j imprima el valor, pues
                     * en las diagonales el número de la fila con el número de la columna ha de coincidir.
                     */
                }
            }
        }
    }

    public static void diagonal2 (String[][] matriz3x3){
        int j = matriz3x3.length -1;
        for (int i = 0; i<matriz3x3.length; i++){
                System.out.println(matriz3x3[i][j--]);
            /**
             * Aquí he declarado j fuera del bucle porque lo probé dentro y daba como resultado un bucle infinito
             * Imprimo la matriz con i para que recorra normalmente las filas pero j lo pongo de manera que disminuya
             * el número de la columna
             */
        }

        }
    }



