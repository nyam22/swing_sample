package ch09.d0502;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ActionEventTest extends JFrame
{
	JPanel jp = null;
	JButton jb = null;
	JButton jb1 = null;
	JLabel jl = null;

	public ActionEventTest()
	{
		jp = new JPanel();
		jb = new JButton(" 눌러봐라 버튼 ");
		jb1 = new JButton(" 누르면 안됨 ");
		jl = new JLabel(" 모하노? 버튼 눌러야지? 골라라!! ");

		jb.addActionListener(new MyListener());
		jb1.addActionListener(new MyListener());

		jp.add(jb);
		jp.add(jb1);
		jp.add(jl);
		getContentPane().add(jp);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,300,200);
		//setSize(300, 200);		
		setTitle(" Action 이벤트 ");
		setVisible(true);
	}

	private class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println(" ActionEvent e : " + e + "\n");
			Object obj = e.getSource();
			System.out.println(" e.getSource() : " + obj + "\n");
			String str = e.getActionCommand();
			System.out.println(" e.getActionCommand() : " + str + "\n");			
//			System.out.println(" e.getSource() : " + e.getSource() + "\n");
//			System.out.println(" e.getActionCommand() : " + e.getActionCommand() + "\n");
			
			if (" 눌러봐라 버튼 ".equals(str)){
				System.out.println(">>>>>>>>>>>>>>>>>");
			}
			if (jb == obj){
				System.out.println("<<<<<<<<<<<<<<<<<");
			}
			
			
			
			if (e.getSource() == jb)
			{
System.out.println(" jb.getText() : " + jb.getText() + "\n");
				jl.setText(" 이 버튼 아니다. 단디 해라. ");
			}

			if (e.getSource() == jb1)
			{
System.out.println(" jb.getText() : " + jb1.getText() + "\n");
				jl.setText(" 아까 그 버튼이 맞다. 쫌!! ");
			}
		}
	}

	public static void main(String args[])
	{
		new ActionEventTest();
	}
}

