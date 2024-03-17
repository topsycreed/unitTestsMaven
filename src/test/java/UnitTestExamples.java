import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnitTestExamples {

    @Test
    void simpleTest() {
        int a = 2;
        int b = 3;
        Assertions.assertEquals(a, b);
    }
}
