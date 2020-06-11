package Apple;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    /*@Test
    public void getApple() {
        Apple apple = new Apple();
        assertEquals("pear", apple.getApple());
    }*/

    @Test
    public void getApple() {
        Apple apple = new Apple();
        assertEquals("apple", apple.getApple());
    }
}