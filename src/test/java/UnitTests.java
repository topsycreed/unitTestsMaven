import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnitTests {

    @Test
    @Tag("smoke")
    void simpleTest() {
        int a = 2;
        int b = 3;
        System.out.println("simpleTest");
        Assertions.assertEquals(a, b);
    }

    @Test
    void simpleTest2() {
        int a = 2;
        int b = 3;
        System.out.println("simpleTest2");
        Assertions.assertEquals(a, b);
    }
}
