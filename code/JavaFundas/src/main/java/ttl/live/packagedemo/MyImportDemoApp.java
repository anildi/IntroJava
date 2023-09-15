package ttl.live.packagedemo;

import ttl.labs.labfourab.Student;
import ttl.live.packagedemo.yourpack.YourClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whynot
 */
public class MyImportDemoApp {

    public static void main(String[] args) {
        MyClass mc = new MyClass();

        YourClass yc = new YourClass();

        System.out.println(mc.doIt("Boo"));

        List<Student> students = new ArrayList<Student>();

//        List<String> lstr;

    }
}
