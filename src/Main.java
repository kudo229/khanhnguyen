import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private List<String> textLines = new ArrayList<>();

    public void addTextLine(String line) {
        textLines.add(line);
    }

    public void removeTextLine(int index) {
        textLines.remove(index);
    }
    public void saveToFile(String filePath) throws IOException {
        Files.write(Paths.get(filePath), textLines);
    }
    public void loadFromFile(String filePath) throws IOException {
        textLines = Files.readAllLines(Paths.get(filePath));
    }
    public void traverseDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        traverseDirectory(file);
                    } else {

                    }
                }
            }
        }
    }
}

