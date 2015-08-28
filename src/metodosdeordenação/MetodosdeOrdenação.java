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
public class MetodosdeOrdenação {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        
        int[] vetor = new int[50000];
        for (int i=0;i<vetor.length;i++){
        vetor[i]=(int) (50000*Math.random());
        }
        
       int[] vetorBubble = vetor;
       long inicioBubble = System.currentTimeMillis();
       BubbleSort bs = new BubbleSort(vetorBubble);
       long fimBubble = System.currentTimeMillis();
       System.out.println ("Tempo Bubble: " + (fimBubble-inicioBubble));
       
       int[] vetorInsertion = vetor;
       long inicioInsertion = System.currentTimeMillis();
        InsertionSort.insertionSort(vetor);
       long fimInsertion = System.currentTimeMillis();
       System.out.println ("Tempo Insertion: " + (fimInsertion - inicioInsertion));
       
       
       
       int[] vetorQuick = vetor;
       long inicioQuick = System.currentTimeMillis();
       QuickSort.quickSort(vetorQuick, 0, vetorQuick.length - 1);
       long fimQuick = System.currentTimeMillis();
       System.out.println ("Tempo Quick: " + (fimQuick - inicioQuick));
       
       int[] vetorMerge = vetor;
       long inicioMerge = System.currentTimeMillis();
       MergeSort.sort(vetorMerge, 0, vetorMerge.length);
       long fimMerge = System.currentTimeMillis();
       System.out.println ("Tempo Merge: " + (fimMerge - inicioMerge));
       

    }

}

