/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeordenação;

/**
 *
 * @author 31381243
 */
public class InsertionSort {

    static void insertionSort(int[] chave) {
        int j, aux;
        for (int i = 1; i < chave.length; i++) {
            aux = chave[i];
            for (j = i - 1; j >= 0 && aux < chave[j]; j--) {
                chave[j + 1] = chave[j];
            }
            chave[j + 1] = aux;
        }
    }
}



