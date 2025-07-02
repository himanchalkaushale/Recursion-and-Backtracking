public static void printArray(int[] arr, int i){
        //base cae
        if(i>=arr.length) return;
        //processing
        System.out.print(arr[i]+" ");
        //recurrence relation
        printArray(arr, i+1);
    }
