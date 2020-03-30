package ch09.d0502;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HtmlButton extends JFrame implements ActionListener
{
	public static final String IMG_PATH
		= "C://00.koitt02//csWork//babyProject//src//images//img//";
	
	JButton mline = null;
	JButton rollover = null;
	ImageIcon on = null;
	ImageIcon off = null;
	
	public HtmlButton()
	{
		super(" HTML 태그를 갖는 버튼 ");
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(Color.yellow);
		
		mline = new JButton(  "<html>"
							+ "<font color=red>버튼제목</font>"
		                    + "<hr>이름"
		                    + "</html>");
		mline.addActionListener(this);
		
		on = new ImageIcon(IMG_PATH + "gaan.gif");
		off = new ImageIcon(IMG_PATH + "doki.gif");
		
		rollover = new JButton(off);
		rollover.setRolloverIcon(on);
		
		getContentPane().add(mline);
		getContentPane().add(rollover);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100, 100);
		setSize(300, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == mline)
		{
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
		
	public static void main(String[] args) {
		new HtmlButton();
	}

}
