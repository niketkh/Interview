public class BubbleSort {
    public static void sort(int arr[]) {
        boolean swapped = true;
        for(int i=0; i<arr.length && swapped; i++) {
            swapped = false;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j-1]>arr[j]) {
                    swapped = true;
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
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
        BubbleSort.sort(arr);
        BubbleSort.printArray(arr);
    }
}

