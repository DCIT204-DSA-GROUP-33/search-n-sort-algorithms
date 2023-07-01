public class Sort {
    public static void bubbleSort(int[] arr) {
        long startTime = System.nanoTime(); // Start time
        int n = arr.length;

        // Bubble Sort algorithm start
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Bubble sort algorithm end

        long endTime = System.nanoTime(); // End time
        long executionTime = (endTime - startTime);
        System.out.println("Bubble sort executed in " + executionTime + " nanoseconds.");

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        long startTime = System.nanoTime(); // Start time

        // Selection Sort algorithm start
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        // Selection Sort algorithm end

        long endTime = System.nanoTime(); // End time
        long executionTime = (endTime - startTime);
        System.out.println("Selection sort executed in " + executionTime + " nanoseconds.");

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        long startTime = System.nanoTime(); // Start time

        // Insertion Sort algorithm start
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        // Insertion Sort algorithm end

        long endTime = System.nanoTime(); // End time
        long executionTime = (endTime - startTime);
        System.out.println("Insertion sort executed in " + executionTime + " nanoseconds.");

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

