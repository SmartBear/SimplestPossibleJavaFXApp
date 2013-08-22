package javafx.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * @author renato
 */
public class MyComp extends VBox
{
	private int count = 0;

	@FXML
	protected Label label;

	@FXML
	protected Button button;

	@FXML
	public void initialize()
	{
		System.out.println( "Initializing MyComp" );
		onClick();
	}

	@FXML
	public void onClick()
	{
		System.out.println( "You clicked" );
		label.setText( "You pressed the button " + count++ + " times!" );
	}

}
