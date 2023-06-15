package com.matrizes;

public class Manipulaçao_de_Matriz {
    public static void main(String[] args) {
        String [][] sala = new String[6][4];

        sala[0][0] = "Ana";
        sala[0][2] = "Paulo";
        sala[1][0] = "Rosa";
        sala[1][1] = "Cléo";
        sala[1][3] = "Rui";
        sala[2][2] = "João";
        sala[2][3] = "Sonia";
        sala[3][1] = "Mari";
        sala[4][0] = "Rony";
        sala[4][3] = "José";
        sala[5][1] = "Jonas";
        sala[5][2] = "Lucy";

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }
}
