package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void someTest() {
        String value = System.getProperty("value");
        System.out.println(value);
        // null
    }

    @Test
    void someTest1() {
        String value = System.getProperty("value", "default_value");
        System.out.println(value);
        // default_value
    }

    @Test
    void someTest2() {
        System.setProperty("value", "another_value");
        String value = System.getProperty("value");
        System.out.println(value);
        // another_value
    }

    @Test
    void someTest3() {
        System.setProperty("value", "another_value");
        String value = System.getProperty("value", "default_value");
        System.out.println(value);
        // another_value
    }

    @Test
    @Tag("properties")
    void someTest4() {
        String value = System.getProperty("browser", "chrome");
        System.out.println(value);
        // another_value
    }
}
