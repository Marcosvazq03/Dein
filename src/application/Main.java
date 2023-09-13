package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage escenario) throws Exception{
		escenario.setTitle("HolaFX Aplicacion");
		escenario.show();
	}

}
