package ch09.d0501;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

public class SwingVideo extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static final String FILE_PATH 
	= "C://00.koitt02//csWork//babyProject//src//images//midi//";

	public SwingVideo() throws IOException{
		
		Desktop.getDesktop().open(new File(FILE_PATH + "//" + "La Catedral.mp4"));
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	   
//	    setSize(480, 360);
//	    setVisible(true);
	}
	
    public static void main(String[] args) throws IOException{
    	new SwingVideo();
    }
}
