package metodosdeordenação;


public class QuickSort {


    static int separa(int[] vetor, int ini, int fim) {
        int pivo, esq;
        pivo = vetor[ini];
        esq = 0;
        while (ini < fim) {
            if (esq == 0) {
                if (pivo >= vetor[fim]) {
                    vetor[ini] = vetor[fim];
                    ini++;
                    esq = 1;
                } else {
                    fim--;
                }
            } else if (pivo < vetor[ini]) {
                vetor[fim] = vetor[ini];
                fim--;
                esq = 0;
            } else {
                ini++;
            }
        }
        vetor[fim] = pivo;
        return fim;
    }

    static void quickSort(int[] vetor, int ini, int fim) {
        int k;
        if (fim > ini) {
            k = separa(vetor, ini, fim);
            quickSort(vetor, ini, k - 1);
            quickSort(vetor, k + 1, fim);
        }
    }
}
