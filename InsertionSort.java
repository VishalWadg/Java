public class InsertionSort {

    public static void inssort(int arr[]) {
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];      // current element i.e. element to be inserted taken in curr
            int prev = i-1;         // prev 
            while(prev >= 0 && arr[prev] > curr){ 
                arr[prev + 1] = arr[prev];          // making place for elem to be inserted by shifting all elements to the right
                prev--;
            }
            arr[prev + 1] = curr;  //inserting the element
        }
    }
    public static void main (String args[]) {
        int arr[] = {8,3,2,6,9,1,0};
        inssort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
