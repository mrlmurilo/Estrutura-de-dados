public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 6, 3, 2, 1, 11, 23, 22, 14455, 45, 2};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(arr, inicio, fim);
            quickSort(arr, inicio, posicaoPivo - 1);
            quickSort(arr, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] arr, int inicio, int fim) {
        int pivo = arr[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (arr[i] <= pivo) i++;
            else if (pivo < arr[f]) f--;
            else {
                int troca = arr[i];
                arr[i] = arr[f];
                arr[f] = troca;
                i++;
                f--;
            }
        }
        arr[inicio] = arr[f];
        arr[f] = pivo;
        return f;
    }
}
