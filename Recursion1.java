import java.util.*;
public class Recursion_Basics {
    public static void printCounting(int n){
        //base case
        if(n ==0) return;
        //processing
        System.out.print(n+" ");
        //recurrance relation
        printCounting(n-1);
    }
    
    public static void printArray(int[] arr, int i){
        //base cae
        if(i>=arr.length) return;
        //processing
        System.out.print(arr[i]+" ");
        //recurrence relation
        printArray(arr, i+1);
    }
    
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
    public static void printDigits(int n){
        //base case
        if(n==0) return;
        //recurrence relation
        printDigits(n/10);
         //processing
        System.out.print(n%10+" ");
    }
    public static int powerOfTwo(int a,int b){
        //base condition
        if(b==1) return 2;
        return a *powerOfTwo(a,b-1);
    }
    public static boolean searchInString(String str, int i, char key){
        //base condition
        if(i>=str.length()) return false;
        //ek step 
        if(str.charAt(i) == key) return true;
        //recurrence relation
        return searchInString(str, i+1, key);
        
    }
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the value of N: ");
        /*int n = sc.nextInt();
        //printCounting(n);
        int[] arr = {1,2,4,8,9,7,5,4,6};
        int i = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;*/
       // printArray(arr,i);
        /*System.out.println();
        System.out.println("The max in array is :"+ findMax(arr, i, max));
        System.out.println("The min in array is :"+ findMin(arr, i, min));*/
        //printDigits(n);
        
        /*int a = 2;
        int b = sc.nextInt();
        System.out.print(powerOfTwo(a,b));*/
        
       /* String str = "Himanchal";
        int i = 0;
        char key = sc.next().charAt(i);
        System.out.println(searchInString(str,i, key));*/
        int[] arr = {1,2,4,8,9,7,5,4,6,6,6,6,6};
        int i = 0;
        int count = 0;
        int key = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("The total no. of occurrence in array: " + countAllOccurrence(arr, i, key, count, list));
        for (int num : list) {
            System.out.print(num + " ");
        }
        
    }
}
