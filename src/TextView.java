import javax.swing.*;
import java.awt.event.ActionListener;

// View
public class TextView {
    private JButton saveButton;
    private JTextField filePathField;


    public void setSaveButtonActionListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    public String getFilePath() {
        return filePathField.getText();
    }


}
