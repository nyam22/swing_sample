package ch09.d0502;

import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

public class BorderTest extends JFrame
{
	JLabel   noborder = null;
	JLabel   raised = null;
	JLabel   etched = null;
	JLabel   title1 = null;
	JLabel   title2 = null;
	JLabel   lowered = null;
	JLabel   line = null;
	JLabel   matte = null;
	
	public BorderTest()
	{
		super("Swing Borders");
		
		getContentPane().setLayout(new GridLayout(4, 2, 10, 10));
		
		noborder = new JLabel("No Border");
		
		raised = new JLabel("Raised Border");
		raised.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		lowered = new JLabel("Lowered Border");
		lowered.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		
		line = new JLabel("Line Border");
		line.setBorder(new LineBorder(Color.blue));
		
		etched = new JLabel("Etched Border");
		etched.setBorder(new EtchedBorder());
		
		title1 = new JLabel("Title Border");
		title1.setBorder(new TitledBorder("Hello"));
		
		title2 = new JLabel("Title Border");
		title2.setBorder(new TitledBorder(new TitledBorder("Hello"), "World",
							TitledBorder.RIGHT, TitledBorder.BOTTOM));
		
		matte = new JLabel("Matte Border");
		matte.setBorder(new MatteBorder(5, 10, 5, 10, Color.green));
		
		getContentPane().add(noborder);
		getContentPane().add(line);
		getContentPane().add(raised);
		getContentPane().add(lowered);
		getContentPane().add(etched);
		getContentPane().add(title1);
		getContentPane().add(title2);
		getContentPane().add(matte);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				setVisible(false);
				dispose();
				System.exit(1);
			}
		});
		
		setSize(450, 400);
		setVisible(true);		
	}
		
	public static void main(String[] args) {
		new BorderTest();
	}

}
