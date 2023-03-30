package frame.com.Utils;

import java.util.Random;

public class Utils {
    Random value = new Random();

    public String randomString() {

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String name = "";
        for (int i = 0; i < 10; i++) {
            name = name + array[value.nextInt(10)];
        }
        return name;
    }

    public int randomInt() {
        return value.nextInt(30);
    }


}
