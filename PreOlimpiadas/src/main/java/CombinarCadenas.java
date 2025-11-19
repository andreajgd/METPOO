class Main {
    public static void main(String[] args) {

        int[] a = {5, 1, 9};
        int[] b = {3, 8, 2};

        int size = a.length + b.length;
        int[] combinado = new int[size];

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            combinado[index] = a[i];
            index++;
        }

        for (int i = 0; i < b.length; i++) {
            combinado[index] = b[i];
            index++;
        }

        for (int i = 0; i < combinado.length - 1; i++) {
            for (int j = 0; j < combinado.length - 1 - i; j++) {
                if (combinado[j] > combinado[j + 1]) {
                    int temp = combinado[j];
                    combinado[j] = combinado[j + 1];
                    combinado[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < combinado.length; i++) {
            System.out.print(combinado[i] + " ");
        }
    }
}
