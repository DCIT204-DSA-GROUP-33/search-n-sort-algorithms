import java.util.ArrayList; // Used ArrayList instead of Array so that the so numbers Array would not have a limit.
import java.util.List;
import java.util.Scanner;

public class Methods {
    public static void startAlgorithmApp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
            Hello User, welcome to the Algorithm App
            Please select an algorithm type by the number assigned to them
            1. Searching
            2. Sorting
            Enter your selection: \s"""
        );

        int selection = scanner.nextInt(); // Read user input

        // Process the user's selection
        switch (selection) {
            case 1: // Handle selection for Searching
                System.out.println("You selected Searching.");
                System.out.println("""
                    Which Searching algorithm do you want to use? (Select using the numbers assigned to them)
                    1. Linear Search
                    2. Binary Search
                    3. Compare execution time for each algorithm for n number of inputs.
                    Enter your selection here:\s"""
                );

                int selection2 = scanner.nextInt(); // Read user input

                switch (selection2) {
                    case 1:
                        // Perform linear search using the input numbers
                        int[] numbers1 = getInputNumbers(scanner);
                        int key1 = getSearchKey(scanner);

                        // Call linear search algorithm function with numbers1 as parameter
                        Search.linearSearch(numbers1, key1);
                        break;

                    case 2:
                        // Perform binary search using the input numbers
                        int[] numbers2 = getInputNumbers(scanner);
                        int key2 = getSearchKey(scanner);

                        // Call binary search algorithm function with numbers2 and key2 as parameter
                        Search.binarySearch(numbers2, key2);
                        break;

                    case 3:
                        // Perform search using the input numbers
                        int[] numbers3 = getInputNumbers(scanner);
                        int key3= getSearchKey(scanner);

                        // Call searching algorithms function with numbers2 and key2 as parameter
                        Search.binarySearch(numbers3, key3);
                        Search.linearSearch(numbers3, key3);
                        break;

                    default:
                        System.out.println("Invalid selection.");
                        break;
                }
                break;

            case 2: // Handle selection for Sorting
                System.out.println("You selected Sorting.");
                System.out.println("""
                    Which Sorting algorithm do you want to use? (Select using the numbers assigned to them)
                    1. Bubble Sort
                    2. Selection Sort
                    3. Insertion Sort
                    4. Merge Sort(Not implemented)
                    5. Compare execution time for each algorithm on n number of inputs
                    Enter your selection here:\s"""
                );

                int selection3 = scanner.nextInt(); // Read user input

                switch (selection3) {
                    case 1:
                        // Perform bubble sort using the input numbers
                        System.out.println("You selected Bubble Sort.");
                        int[] numbers3 = getInputNumbers(scanner);
                        Sort.bubbleSort(numbers3);
                        break;

                    case 2:
                        // Perform selection sort using the input numbers
                        System.out.println("You selected Selection Sort.");
                        int[] numbers4 = getInputNumbers(scanner);
                        Sort.selectionSort(numbers4);
                        break;

                    case 3:
                        // Perform insertion sort using the input numbers
                        System.out.println("You selected Insertion Sort.");
                        int[] numbers5 = getInputNumbers(scanner);
                        Sort.insertionSort(numbers5);
                        break;

                    // case 4:
                    //     // Perform merge sort using the input numbers
                    //     System.out.println("You selected Merge Sort.");
                    //     int[] numbers6 = getInputNumbers(scanner);
                    //     Sort.mergeSort(numbers6);
                    //     break;

                     case 5:
                         // Perform merge sort using the input numbers
                         System.out.println("You selected Option 5.");
                         int[] numbers6 = getInputNumbers(scanner);
                         Sort.bubbleSort(numbers6);
                         Sort.insertionSort(numbers6);
                         Sort.selectionSort(numbers6);
                         break;

                    default:
                        System.out.println("Invalid selection.");
                        break;
                }
                break;

            default:
                System.out.println("Invalid selection.");
                break;
        }

        scanner.close();
    }

    public static int[] getInputNumbers(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (enter -1 to stop):");

        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();

            if (input == -1) {
                break; // Stop collecting input when -0 is entered
            }

            numbers.add(input);
        }

        int[] result = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }

    public static int getSearchKey(Scanner scanner) {
        System.out.println("Enter your search key or target: ");
        return scanner.nextInt();
    }
}
