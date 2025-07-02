public static int countAllOccurrence(int[] arr, int i , int key,int count, ArrayList<Integer> list){
        //base condition
        if(i>=arr.length) return count;
        //processing
        if(arr[i] == key){
            list.add(i);
            count++;
        }
        //recurrence relation
        return countAllOccurrence(arr,i+1, key,count, list);
    }
