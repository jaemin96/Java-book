package algorithm.basic.math.search;

public class MinimumCountExam {
    public int findMinCount(int cash) {
        for (int i=0; i<cash; i++) {
            for (int j=0; j<cash; j++) {
              if(3*i + 5*j == cash) {
                  return i+j;
              }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        MinimumCountExam mc = new MinimumCountExam();

        int min = mc.findMinCount(25);

        System.out.print("min >> "+ min);
    }
}
