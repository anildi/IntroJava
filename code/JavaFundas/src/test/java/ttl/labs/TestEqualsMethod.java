package ttl.labs;

import org.junit.jupiter.api.Test;

import java.util.Objects;

/**
 * @author whynot
 */
public class TestEqualsMethod {

    @Test
    public void testMyClassEquals() {
        MyClass mc1 = new MyClass(10);
        MyClass mc2 = new MyClass(10);

//        if(mc1 == mc2) {
        if (mc1.equals(mc2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        System.out.println("mc1: " + mc1.toString());
    }
}

class MyClass extends Object {
    int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return value == myClass.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
