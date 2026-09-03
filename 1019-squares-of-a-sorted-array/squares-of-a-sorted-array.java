class Solution {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int[] arr = new int[nums.length];
        for(int x:nums){
            arr[i] = x*x;
            i++;
        }
        quickSort(arr,0,arr.length-1);
        return arr;
    }
}