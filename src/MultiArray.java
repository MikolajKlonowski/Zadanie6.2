import java.util.Random;

public class MultiArray {
    int[][] tab;

    public MultiArray(int n, int m) {
        this.tab = new int[n][m];
        randomize();
    }


    public void randomize() {
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = rand.nextInt(100);
            }
        }


    }

    public void print() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " , ");
            }
        }


    }

    public int min() {
        int min = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] < min) {
                    min = tab[i][j];
                }
            }
        }return min;
    }

    public int max() {
        int max = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] > max) {
                    max = tab[i][j];
                }
            }
        }return max;

    }
}


