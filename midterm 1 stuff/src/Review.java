public class Review {
//    public static void arrayInit(int[] a, int initValue){
//        for(int i = 0; i < a.length; i++){
//            a[i] = initValue;
//            System.out.println(a[i]);
//        }
//    }
//    public static void main(String [] args){
//        int[] n = {1,2,4,5};
//        arrayInit(n,24);
//    }
//    public static void reset(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < 0 || a[i] > 100) {
//                a[i] = -1;
//            }
//            System.out.println(a[i]);
//        }
//    }
//    public static void main(String [] args){
//        int[] n = {-5,2,4000,5};
//        reset(n);
//    }
//    public int[][] make2DArray(int nRows){
//        int [][] r =new int [nRows][ ];
//        for(int i= 0; i<nRows; i++){
//            r[i] = new int[0];
//        }
//        return r;
//    }

//    public static int[] reverse(int[] a){
//        int[]n = new int[a.length];
//        int c = a.length;
//        for (int i=0; i<a.length; i++){
//            n[c - 1] = a[i];
//            c = c - 1;
//        }
//        for(int i =0; i<n.length;i++){
//            System.out.println(n[i]);
//        }
//        return n;
//    }
//    public static void main(String [] args){
//        int[] b = {-5,2,4000,5};
//       reverse(b);
//    }
    public static int getSmall(int[] a){
        if (a.length == 1){
            return a[0];
        }else if (a[-1] > a[0]){
            int[] newArray = new int[a.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = a[i];
            }
            return getSmall(newArray);
        } else {
            return getSmall(a);
        }
    }
    public static void main(String [] args){
        int[] b = {-5,2,4000,5};
       getSmall(b);
    }
}

