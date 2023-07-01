public class Search {
    public static int linearSearch(int[] arr, int key) {
        long startTime = System.nanoTime(); // Start time

        // Linear Search algorithm start
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                long endTime = System.nanoTime(); // End time
                long executionTime = (endTime - startTime);
                System.out.println("Linear search executed in " + executionTime + " nanoseconds.");
                System.out.println("Key found at index: " + i);
                return i;
            }
        }
        // Linear Search algorithm end

        long endTime = System.nanoTime(); // End time
        long executionTime = (endTime - startTime);
        System.out.println("Linear search executed in " + executionTime + " nanoseconds.");
        System.out.println("Key not found.");
        return -1; // Key not found
    }

    public static int binarySearch(int[] arr, int key) {
        // Insertion sort algorithm
          for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        int [] sortedArray = arr;
        // Insertion Sort algorithm end

        long startTime = System.nanoTime(); // Start time

        // Binary Search algorithm start
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                long endTime = System.nanoTime(); // End time
                long executionTime = (endTime - startTime);
                System.out.println("Binary search executed in " + executionTime + " nanoseconds.");
                System.out.println("Key found at index: " + mid);
                return arr[mid];

            } else if (sortedArray[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } // Binary Search algorithm end

        long endTime = System.nanoTime(); // End time
        long executionTime = (endTime - startTime);
        System.out.println("Binary search executed in " + executionTime + " nanoseconds.");
        System.out.println("Key not found.");
        return -1; // Key not found
    }
}
