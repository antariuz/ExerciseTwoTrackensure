public class MatrixReverser {

    public void solve(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[m.length - 1 -j][i] + " ");
            }
            System.out.println();
        }
    }

    public void showInitialMatrix(int[][] m) {
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
