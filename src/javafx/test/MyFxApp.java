package javafx.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author renato
 */
public class MyFxApp
{

	public static void main( String[] args )
	{
		Application.launch( App.class );
	}

	public static class App extends Application
	{

		@Override
		public void start( Stage stage ) throws Exception
		{
			VBox root = new VBox();
			root.setSpacing( 30 );

			root.getChildren().add( new Rectangle( 100, 100, Color.BLUE ) );
			root.getChildren().add( myComp() );

			Scene scene = new Scene( root );
			stage.setScene( scene );
			stage.show();
		}

		private Node myComp()
		{
			try
			{
				return FXMLLoader.load( getClass().getResource( "MyComp.fxml" ) );
			}
			catch( IOException e )
			{
				throw new RuntimeException( e );
			}
		}
	}

}
