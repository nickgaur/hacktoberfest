import java.util.Arrays;

public class Ques2 {

    static void right() {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int k = 0;
        int[] count = new int[mat.length];
        int[] res = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1)
                    soldiers++;
                else
                    break;
            }
            count[i] = soldiers * 1000 + i;
        }

        Arrays.sort(count);

        for (int i = 0; i < k; i++)
            res[i] = count[i] % 1000;

        return res;
    }

    public static void main(String[] args) {
        right();
    }
}