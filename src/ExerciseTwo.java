public class ExerciseTwo {
    public static void main(String[] args) {
        MatrixReverser matrixReverser = new MatrixReverser();
        int[][] arrayOne = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        matrixReverser.showMatrix(arrayOne);
        System.out.println();
        matrixReverser.solve(arrayOne);
        matrixReverser.showMatrix(arrayOne);
    }
}
