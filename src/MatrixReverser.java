public class MatrixReverser {

    public void solve(int[][] m) {
        int z = m.length;
        for (int i = 0; i < z / 2; i++) {
            for (int j = i; j < z - i - 1; j++) {
                int temp = m[i][j];
                m[i][j] = m[z - j - 1][i];
                m[z - j - 1][i] = m[z - i - 1][z - j - 1];
                m[z - i - 1][z - j - 1] = m[j][z - i - 1];
                m[j][z - i - 1] = temp;
            }

        }
    }

    public void showMatrix(int[][] m) {
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
