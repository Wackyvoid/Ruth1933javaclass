public class Histogram {
    int lower;
    int upper;
    int[] freq;


    public Histogram(int lowerbound, int upperbound) {
        if (upperbound < lowerbound) {
            this.lower = upperbound;
            this.upper = lowerbound;
        } else {
            this.lower = lowerbound;
            this.upper = upperbound;
        }
        freq = new int[upper - lower + 1];
    }

    public boolean add(int i) {
        if (i <= upper && i >= lower) {
            freq[i - lower]++;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String string1 = "";
        for (int i = lower; i <= upper; i++) {
            string1 += i + ":";
            for (int j = lower; j < freq[i];j++) {
                string1 += "*";
            }
            string1 += "\n";
        }
        return string1;
    }

    public static void main(String[] args) {
        Histogram histo = new Histogram(0, 5);
        histo.add(3);
        histo.add(2);
        histo.add(1);
        histo.add(2);
        histo.add(3);
        histo.add(0);
        histo.add(1);
        histo.add(5);
        histo.add(3);
        System.out.println(histo);
    }
}
