import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void avgArray() {
        Matrix matrix = new Matrix();
//        int[] array = new int[];
//        assertEquals(matrix.avgArray(array));
    }

    @Test
    void isSquareMatrix() {
        Matrix matrix = new Matrix();
        int[][] matrix1 = new int[5][5];
        assertTrue(matrix.isSquareMatrix(matrix1));

    }

    @Test
    void isSquareMatrixTeeth() {
        Matrix matrix = new Matrix();
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
        assertFalse(matrix.isSquareMatrix(matrix2));

    }

    @Test
    void isSquareMatrixZero() {
        Matrix matrix = new Matrix();
        int[][] matrix3 = new int[0][0];
        assertFalse(matrix.isSquareMatrix(matrix3));
    }
    @Test
    void isSquareMatrixNull() {
        Matrix matrix = new Matrix();
        int[][] matrix4 = null;
        assertFalse(matrix.isSquareMatrix(matrix4));
    }
    @Test
    void isSquareMatrixNo() {
        Matrix matrix = new Matrix();
        int[][] matrix5 = new int[5][8];
        assertFalse(matrix.isSquareMatrix(matrix5));
    }
}