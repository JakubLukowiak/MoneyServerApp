package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;


public class GUI_display extends Application {

    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle("Money App");

        // create a textfield
        TextField b = new TextField();

        // create a stack pane
        TilePane r = new TilePane(Orientation.VERTICAL);

        // create a text to be displayed
        Text text = new Text();
        text.setText("Wpisz swoje zarobki brutto");

        // create a label
        Label l = new Label();

        // create a button
        Button button = new Button();

        //create a button 2
        Button button_2 = new Button();






        // add textfield
        //r.getChildren().add(b);


        //after pressing enter after typing in the label
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                String text = b.getText();
                l.setText(text);

            }
        };
        //event - clicking the button
        EventHandler<MouseEvent> button_clicked = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e1) {
                String brutto_string = b.getText();
                button.setText(Backend.gross_to_net(brutto_string, 30));
            }
        };

        b.setOnAction(event);
        button.addEventFilter(MouseEvent.MOUSE_CLICKED,button_clicked);

        r.getChildren().add(text);
        r.getChildren().add(b);
        r.getChildren().add(l);
        r.getChildren().add(button);
        r.getChildren().add(button_2);

        // create a scene
        Scene sc = new Scene(r, 640, 480);
        l.getAlignment();

        // set the scene
        s.setScene(sc);

        s.show();
    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}