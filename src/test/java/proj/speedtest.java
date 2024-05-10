package proj;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class speedtest {

    @Test
    public void testPerformance() {
        try {
            File file = new File("bigfile.txt");
            FileWriter writer = new FileWriter(file);

            for (int i = 0; i < 1000000; i++) {
                writer.write(String.valueOf(i));
                writer.write(" ");
            }

            writer.close();

            long startTime = System.currentTimeMillis();
            Operations.main(null);
            long endTime = System.currentTimeMillis();

            System.out.println("время выполнения для 1 млн чисел: " + (endTime - startTime) + " мс");

            assertEquals(true, (endTime - startTime) < 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

