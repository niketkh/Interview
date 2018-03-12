public class SelectionSort {
    public static void sort(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           int minIndex = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[j] < arr[minIndex])
                   minIndex = j;
           }
           
           // Swap 
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
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
        SelectionSort.sort(arr);
        SelectionSort.printArray(arr);
    }
}

