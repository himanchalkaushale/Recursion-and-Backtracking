public static int powerOfTwo(int a,int b){
        //base condition
        if(b==1) return 2;
        return a *powerOfTwo(a,b-1);
    }
