import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	public static void main(String[] args) {
		
		//frame
		Frame frame = new Frame("My first frame"); 
		
		//visible
		frame.setVisible(true);
		
		//set size
		frame.setSize(400, 400);
		
		//set color, need color class
		frame.setBackground(new Color(85, 150, 68));
		
		// set location
		frame.setLocation(200, 200);
		
		//set fixed size
		frame.setResizable(false);
		
		// frame can't be closed
	}

}
