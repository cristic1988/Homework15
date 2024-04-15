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
        assertEquals( (double).matrix , matrix.avgArray());

    }

    @Test
    void isSquareMatrix() {
    }
}