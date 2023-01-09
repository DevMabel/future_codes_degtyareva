public class Home10 {
    public static void main(String[] args) {
        System.out.println();
        int[] sort = new int[100];
        for (int i = 0; i != 100; i++) {
            int b = (int) (Math.random() * 100) + 1;
            System.out.print(b + " ");
            sort[i] = b;
        }
        for (int i = 0; i < sort.length - 1; i++) {
            int maxElementIndex = i;
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[maxElementIndex] < sort[j]) {
                    maxElementIndex = j;
                }
            }

            if (maxElementIndex != i) {
                int temp = sort[i];
                sort[i] = sort[maxElementIndex];
                sort[maxElementIndex] = temp;
            }
        }
        System.out.println("Сортированные данные из масива:");
        System.out.println();
        for (int i = 0; i != 100; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}