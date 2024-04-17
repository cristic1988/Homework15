import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    Matrix matrix;

    @BeforeEach
    void setUp() {
        matrix = new Matrix();
    }

    @AfterEach
    void tearDown() {
        matrix = null;
    }

    @Test
    void avgArray() {
        int[] array = new int[] {1,2,3,4,5};
        assertEquals(3.0, matrix.avgArray(array));
    }

    @Test
    void isSquareMatrix() {
        int[][] matrix1 = new int[5][5];
        assertTrue(matrix.isSquareMatrix(matrix1));

    }

    @Test
    void isSquareMatrixTeeth() {
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
        assertFalse(matrix.isSquareMatrix(matrix2));

    }

    @Test
    void isSquareMatrixZero() {
        int[][] matrix3 = new int[0][0];
        assertFalse(matrix.isSquareMatrix(matrix3));
    }
    @Test
    void isSquareMatrixNull() {
        int[][] matrix4 = null;
        assertFalse(matrix.isSquareMatrix(matrix4));
    }
    @Test
    void isSquareMatrixNo() {
        int[][] matrix5 = new int[5][8];
        assertFalse(matrix.isSquareMatrix(matrix5));
    }
}