package vn.techmaster;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    static void getData() throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("ĐƯờng dẫn file");
    }
}
