 public static boolean checkSorted(int[] arr, int i){
        //base condition
        if(i == arr.length-1) return true;
        //processsing
        if(arr[i+1]<arr[i]){
            return false;
        }

        //reccurrence relation
        return checkSorted(arr, i+1);
    }
