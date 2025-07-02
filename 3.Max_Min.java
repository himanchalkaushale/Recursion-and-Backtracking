public static int findMax(int[] arr, int i, int max){
        //base case
        if(i>=arr.length){
            return max;
        }
        //processing
        if(arr[i]>max){
            max = arr[i];
        }
        //recurrence relation
        return findMax(arr, i+1, max);
    }
     public static int findMin(int[] arr, int i, int min){
        //base case
        if(i>=arr.length){
            return min;
        }
        //processing
        if(arr[i]<min){
            min = arr[i];
        }
        //recurrence relation
        return findMin(arr, i+1, min);
     }
