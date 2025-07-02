 public static boolean searchInString(String str, int i, char key){
        //base condition
        if(i>=str.length()) return false;
        //ek step 
        if(str.charAt(i) == key) return true;
        //recurrence relation
        return searchInString(str, i+1, key);
        
    }
