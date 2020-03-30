package ch09.d0501;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EventListenerType extends JFrame implements ActionListener{

	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;

	JPanel  jp1;
	JPanel  jp2;
	
	public EventListenerType(){
	
		jp1 = new JPanel();		
		jp2 = new JPanel();
		jp1.setBackground(Color.yellow);
		jp2.setBackground(Color.cyan);

		jb1 = new JButton("�Ϲݱ���");
		jb2 = new JButton("���α���");
		jb3 = new JButton("�͸���");
		jb4 = new JButton("�ܺα���");

		// �Ϲ� ����
		jb1.addActionListener(this); // this �� ActionListener ����Ŵ
									 // ���� ��ư�� �������� �����ϰ� �Ѵ�
		// ���� ���� 
		jb2.addActionListener(new MyActionListener());
		// �͸� ���� 
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(" �̺�Ʈ ������ �͸��� >>> : ");
				if (e.getSource() == jb3)
				{
					jp2.setBackground(Color.blue);
				}
			}
		});
		// �ܺ� ����
		jb4.addActionListener(new MyActionListener1(this));


		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);

		getContentPane().add(jp1, "North");
		getContentPane().add(jp2, "Center");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(400, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println(" �̺�Ʈ ������ �Ϲݱ��� >>> : ");
		if (e.getSource() == jb1)
		{
			jp2.setBackground(Color.white);
		}
	}

	private class MyActionListener implements ActionListener{
			// ActionListener interface�� ����(overriding)�ϴ� �����class
		public void actionPerformed(ActionEvent e){ // override �Լ� ����
			System.out.println(" �̺�Ʈ ������ ���α��� >>> : ");
			if (e.getSource() == jb2)			// ��ư2 ������
			{
				jp2.setBackground(Color.red);	// red ���� ����
			}
		}
	}
	
	
	public static void main(String args[]){
		
		new EventListenerType().setTitle("�̺�Ʈ������ �׽�Ʈ");
	
	}
}

class MyActionListener1 implements ActionListener
{
	EventListenerType elt;
	private int cnt;

	public MyActionListener1(EventListenerType elt){
		this.elt = elt;
	}
	
	public void actionPerformed(ActionEvent e){
		System.out.println(" �̺�Ʈ ������ �ܺα��� >>> : ");
		((JFrame)elt).setTitle(e.getActionCommand() + " : " + ++cnt);
	}
}