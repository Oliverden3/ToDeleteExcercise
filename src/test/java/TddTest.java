import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class TddTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void Test1(){
        System.out.println("Testing list is not empty");
        String expected = "Kasper, Denis, Oliver";
        String actual = MyClass.CombinedNames(null);
        assertEquals(expected,actual);
    }

    @Test
    public void Test2(){
        System.out.println("Testing for specific name");
        String expected = "Oliver";
        String actual = MyClass.CombinedNames(2);
    }
}