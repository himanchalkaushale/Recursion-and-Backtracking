public static void printCounting(int n){
        //base case
        if(n ==0) return;
        //processing
        System.out.print(n+" ");
        //recurrance relation
        printCounting(n-1);
}
