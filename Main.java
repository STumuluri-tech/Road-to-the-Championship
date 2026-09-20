import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application{
    @Override
    public void start(Stage primaryStage){
        StackPane intro_stuff = new StackPane();

        Image introScreen = new Image(getClass().getResourceAsStream("/IntroScreen.png"));

        BackgroundImage backgroundImage = new BackgroundImage(
            introScreen,
            BackgroundRepeat.NO_REPEAT,  
            BackgroundRepeat.NO_REPEAT,  
            BackgroundPosition.CENTER,   
            new BackgroundSize(
                BackgroundSize.AUTO,     
                BackgroundSize.AUTO,     
                false,                   
                false,                   
                false,                   
                true                     
            )
        );

        intro_stuff.setBackground(new Background(backgroundImage));

        primaryStage.setScene(new Scene(intro_stuff, 768,384));
        primaryStage.show();


    }

    public static void main(String[] args){
        launch(args);
    }
}