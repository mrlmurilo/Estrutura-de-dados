import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 6, 3, 2, 1, 11, 23, 22, 14455, 45, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int tamanho = arr.length;
        for (int v = 0; v < tamanho; v++) {
            for (int i = 0; i < tamanho - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                }
            }
        }

    }
}