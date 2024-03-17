import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleTests {

    @Test
    @Tag("smoke")
    void simpleTest3() {
        int a = 2;
        int b = 3;
        System.out.println("simpleTest");
        Assertions.assertEquals(a, b);
    }
}
