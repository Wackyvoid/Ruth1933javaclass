public class MyTicket { //add the stuff
    private String color;
    private static int numbticket = 0;
    private int currnumb = numbticket;
    public MyTicket(String c){
        this.color = c;
        numbticket++;
    }
    public int getNumber(){
        return numbticket;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        String s = color + ":"+currnumb;
        return s;

    }
    public static void main(String[] args){
        MyTicket t1 = new MyTicket("blue");
        //System.out.println(t1.toString());
        MyTicket t2 = new MyTicket("blue");
        //System.out.println(t2.toString());;
        MyTicket t3 = new MyTicket("white");
        MyTicket t4 = new MyTicket("green");
        MyTicket t5 = new MyTicket("white");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        System.out.println(t5.toString());
    }
    /*
    public static int getInfo(Cell[][] board, int col){
       for(int i = 0; i<board.length; i++){
            int smallindx = board[0][col];
            int bcount = 0;
            for (int j = 0; j < board[col].length; j++) {
                if (board[i][j].getStatus() == 'b') {
                    if(j<smallindx){
                        smallindx = j;
                    }
                    bcount++;
                }
            }
       }
       if(bcount>0){
            return smallindx;
       }else if(bcount == o){
            return -1;
        }
    }
     */
}
