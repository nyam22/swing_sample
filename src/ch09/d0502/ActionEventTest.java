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
		jb = new JButton(" �������� ��ư ");
		jb1 = new JButton(" ������ �ȵ� ");
		jl = new JLabel(" ���ϳ�? ��ư ��������? ����!! ");

		jb.addActionListener(new MyListener());
		jb1.addActionListener(new MyListener());

		jp.add(jb);
		jp.add(jb1);
		jp.add(jl);
		getContentPane().add(jp);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,300,200);
		//setSize(300, 200);		
		setTitle(" Action �̺�Ʈ ");
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
			
			if (" �������� ��ư ".equals(str)){
				System.out.println(">>>>>>>>>>>>>>>>>");
			}
			if (jb == obj){
				System.out.println("<<<<<<<<<<<<<<<<<");
			}
			
			
			
			if (e.getSource() == jb)
			{
System.out.println(" jb.getText() : " + jb.getText() + "\n");
				jl.setText(" �� ��ư �ƴϴ�. �ܵ� �ض�. ");
			}

			if (e.getSource() == jb1)
			{
System.out.println(" jb.getText() : " + jb1.getText() + "\n");
				jl.setText(" �Ʊ� �� ��ư�� �´�. ��!! ");
			}
		}
	}

	public static void main(String args[])
	{
		new ActionEventTest();
	}
}

