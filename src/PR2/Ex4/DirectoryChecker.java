package PR2.Ex4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryChecker {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Kirill\\IdeaProjects\\PR_1\\src\\PR2\\Ex4\\Zad4_Base";
        Path path = Paths.get(directoryPath);

        if (Files.exists(path)) {
            System.out.println("Директория существует.");
        } else {
            System.out.println("Директория не найдена: " + directoryPath);
        }
    }
}

