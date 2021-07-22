package SortingAlgorithms;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arrayToSort = new int[]{1, 5, 6, 3, 7, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayToSort);
        bubbleSort.printSortedArray(arrayToSort);
    }

    private void printSortedArray(int[] arrayToSort) {
        for (int elements : arrayToSort) {
            System.out.println(elements);
        }
    }

    private void sort(int[] arrayToSort) {
        int n = arrayToSort.length;// get the length of the array
        boolean isSwapped;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            //inner for loop iterates less than i because by every iteration of outer for loop
            //we have required element at the end of an array
            for (int j = 0; j < n - 1 - i; j++) {
                int temp = 0;//to store the varible dusring swapping
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;

                    isSwapped = true;//settting to true as swap is done
                }//closing of if
            }//closing of inner for loop
            //we will come out of outer for loop, when all elements are sorted or no swapping is done
            if (isSwapped == false)
                break;

        }//closing of outer for loop

    }
}
