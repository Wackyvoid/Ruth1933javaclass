public class Rev <T extends Comparable<T>>{

    private int hash2(T key) { //first two char length

        if(key.toString().length() ==1){ //in the case that the key is only one char long
            return key.toString().charAt(0)%5;
        }
        return  (26* key.toString().charAt(0)+key.toString().charAt(1))% 5;

    }

}
