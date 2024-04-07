import java.io.IOException;


public class TextEditorController {
    private Main model;
    private TextView view;

    public TextEditorController(Main model, TextView view) {
        this.model = model;
        this.view = view;
        view.setSaveButtonActionListener(e -> {
            try {
                model.saveToFile(view.getFilePath());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
