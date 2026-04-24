import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));
        stage.setTitle("Vowel / Consonant / Space Counter");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private Button findButton;

    @FXML
    private Label lable_Consonant;

    @FXML
    private Label lable_Space;

    @FXML
    private Label lable_Vowel;

    @FXML
    private TextField textfield;

    @FXML
    public void handleButton(ActionEvent event) {
        String input = textfield.getText();
        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;

        if (input != null) {
            for (char ch : input.toCharArray()) {
                if (Character.isWhitespace(ch)) {
                    spaceCount++;
                } else if (Character.isLetter(ch)) {
                    char lower = Character.toLowerCase(ch);
                    if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }
        }

        lable_Vowel.setText("Count of Vowel is: " + vowelCount);
        lable_Consonant.setText("Count of Consonant is: " + consonantCount);
        lable_Space.setText("Count of Space is: " + spaceCount);
    }

}
