 public static int binarySearch(int[] arr, int start, int end, int target){
        //base case
        if(start>end) return -1;
        // 2nd base case
        int mid = start + (end- start)/2;
        if(arr[mid] == target){
            return mid;
        } 

        //ab baki recursion sambhal lega
        if (arr[mid]<target){
            return binarySearch(arr, mid+1, end, target);
        }else{
            return binarySearch(arr, start, mid-1, target);
        } 
    }
