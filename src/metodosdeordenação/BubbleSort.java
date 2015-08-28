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
public class BubbleSort {
    int[] chaveOrdenada;
    public BubbleSort(int[] chave) {
        int n = chave.length;
        bubbleSort(chave, n);
    }
    
    public void bubbleSort(int[] chave, int n) {
        int temp;
// inicia o Bubble Sort
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (chave[j - 1] > chave[j]) {
//troca os elementos
                    temp = chave[j - 1];
                    chave[j - 1] = chave[j];
                    chave[j] = temp;
                }
            }
        }
        this.chaveOrdenada = chave;
    }

}
