import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 6, 3, 2, 1, 1, 11, 23, 22, 14455, 45, 2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] dados) {
        if (dados.length > 1) {
            int meio = dados.length / 2;

            // Divide o array em duas partes
            int[] esquerda = new int[meio];
            int[] direita = new int[dados.length - meio];

            // Copia os dados para os arrays da esquerda e direita
            System.arraycopy(dados, 0, esquerda, 0, meio);
            System.arraycopy(dados, meio, direita, 0, dados.length - meio);

            // Chama recursivamente mergeSort em cada metade
            mergeSort(esquerda);
            mergeSort(direita);

            // Intercala os dados
            merge(dados, esquerda, direita);
        }
    }

    static void merge(int[] dados, int[] esquerda, int[] direita) {
        int i = 0, j = 0, k = 0;

        // Compara e mescla os dados
        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] < direita[j]) {
                dados[k++] = esquerda[i++];
            } else {
                dados[k++] = direita[j++];
            }
        }

        // Copia o restante dos elementos da esquerda, se houver
        while (i < esquerda.length) {
            dados[k++] = esquerda[i++];
        }

        // Copia o restante dos elementos da direita, se houver
        while (j < direita.length) {
            dados[k++] = direita[j++];
        }
    }
}

