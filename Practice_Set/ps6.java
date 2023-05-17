package Practice_Set;

public class ps6 {
    static void reverse(int arr[], int n){
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void displayArray(int arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // Question 1
        /*
        float []marks = {56.5f, 87.5f, 98f, 75.5f, 68.0f};

        float sum = 0;
        for (float ele : marks) {
            sum += ele;
        }
        System.out.println("The Sum is :" + sum);


        // Question 2
        float []marks = {56.5f, 87.5f, 98f, 75.5f, 68.0f};

        float num = 75.5f;
        boolean isAvailable = false;
        for (float ele : marks) {
            if(num == ele){
                isAvailable = true;
            }
        }
        if(isAvailable){
            System.out.println("Element is Present!!!");
        }
        else{
            System.out.println("Element is Not Present!!!");
        }
        

        // Question 3
        float []marks = {56.5f, 87.5f, 98f, 75.5f, 68.0f};

        float sum = 0;
        for (float ele : marks) {
            sum += ele;
        }
        System.out.println("The Average is :" + sum/marks.length);
        

        // Question 4
        int [][]A = {{2, 3, 6},
                     {5, 9, 2}};

        int [][]B = {{2, 7, 5},
                     {1, 4, 2}};

        int [][]C = {{0, 0, 0},
                     {0, 0, 0}};

        // Calculating the sum of 2X3 Mattix
        for(int i = 0; i < A.length; i++){  // row numbers of time
            for(int j = 0; j < B[i].length; j++){ // Column numbers of time
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Printing the elements of 2X3 Matrix
        System.out.println("The Resultant Matrix is : ");
        for(int i = 0; i < A.length; i++){  // row numbers of time
            for(int j = 0; j < A[i].length; j++){ // Column numbers of time
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        

        // Question 5

        int []arr = {2, 4, 5, 6, 7};

        System.out.println("The Original Array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        reverse(arr, arr.length);

        System.out.println("\nThe reversed Array is: ");
        displayArray(arr, arr.length);
       

        // Question 6
        int []arr = {2, 4, 6, 9, 10000};

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The Maximum Value is : " + max);
        */

        // Question 7
        int []arr = {2, 4, 6, 9, -10000};

        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("The Minimum Value is : " + min);


        // Question 8
        int []array = {23, 56, 89, 45, 32};
        boolean isSorted = true;

        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                isSorted = false;
            }
        }

        if(isSorted){
            System.out.println("Array is Sorted.");
        }
        else{
            System.out.println("Array is Not Sorted.");
        }


    }
}
