public class MatrixReverser {

    public void solve(int[][] m) {
        for (int i = 0; i <= Math.floorDiv(m.length, 2); i++) {
            int temp = m[i][i];
            m[i][i] = m[m.length - 1 - i][m.length - 1 - i];
            m[m.length - 1 - i][m.length - 1 - i] = temp;
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
