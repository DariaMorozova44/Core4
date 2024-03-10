package task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class UserInfoFileManager {

    public static void createFail(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("File.txt"))) {
            writer.write(String.valueOf(user));
            System.out.println("ok");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
