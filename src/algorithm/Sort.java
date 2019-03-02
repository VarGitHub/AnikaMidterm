package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for (int i = 1; i < list.length; i++) {
            int j = i - 1, pass = list[i];
            while(j >= 0 && list[j] > pass) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = pass;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for (int i = 0; i < list.length - 1; i++)
            for (int j = 0; j < list.length - i - 1; j++)
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] mergeSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        msort(list, list.length);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private void msort(int [] arr, int arrLength) {
        // If arrayLength is 1 then the array has been divided to 1 elements.
        if (arrLength <= 1) return;

        int mid = arrLength / 2;
        int [] left = new int[mid];
        int [] right = new int[arrLength - mid];

        for (int i = 0; i < mid; i++)
            left[i] = arr[i];

        for (int i = mid; i < arrLength; i++)
            right[i - mid] = arr[i];

        msort(left, mid);
        msort(right, arrLength - mid);

        merge(arr, left, right, mid, arrLength - mid);
    }

    private void merge(int [] arr, int [] leftArr, int [] rightArr, int left, int right) {
        int leftIndex = 0, rightIndex = 0, origIndex = 0;

        while (leftIndex < left && rightIndex < right) {
            if (leftArr[leftIndex] < rightArr[rightIndex])
                arr[origIndex++] = leftArr[leftIndex++];
            else
                arr[origIndex++] = rightArr[rightIndex++];
        }

        while(leftIndex < left)
            arr[origIndex++] = leftArr[leftIndex++];

        while(rightIndex < right)
            arr[origIndex++] = rightArr[rightIndex++];
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
