public class InsertionSort {
    public static void sort(int arr[]) {
       for(int i=1; i<arr.length; i++) {
           int key = arr[i];
           int j = i-1;
           // Move elements of arr[0...i-1]
           // that are greater than key,
           // to one position ahead of their current position 
           while(j>=0 && arr[j] > key) {
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = key;
       }
    }
    
    public static void printArray(int arr[]) {
        for(int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 89, 24, 56, 67};
        InsertionSort.sort(arr);
        InsertionSort.printArray(arr);
    }
}

