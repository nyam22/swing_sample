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

		jb1 = new JButton("일반구현");
		jb2 = new JButton("내부구현");
		jb3 = new JButton("익명구현");
		jb4 = new JButton("외부구현");

		// 일반 구현
		jb1.addActionListener(this); // this 는 ActionListener 가리킴
									 // 만든 버튼이 눌렀을때 동작하게 한다
		// 내부 구현 
		jb2.addActionListener(new MyActionListener());
		// 익명 구현 
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(" 이벤트 리스너 익명구현 >>> : ");
				if (e.getSource() == jb3)
				{
					jp2.setBackground(Color.blue);
				}
			}
		});
		// 외부 구현
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
		System.out.println(" 이벤트 리스너 일반구현 >>> : ");
		if (e.getSource() == jb1)
		{
			jp2.setBackground(Color.white);
		}
	}

	private class MyActionListener implements ActionListener{
			// ActionListener interface를 구현(overriding)하는 사용자class
		public void actionPerformed(ActionEvent e){ // override 함수 구현
			System.out.println(" 이벤트 리스너 내부구현 >>> : ");
			if (e.getSource() == jb2)			// 버튼2 누를때
			{
				jp2.setBackground(Color.red);	// red 색상 변경
			}
		}
	}
	
	
	public static void main(String args[]){
		
		new EventListenerType().setTitle("이벤트리스너 테스트");
	
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
		System.out.println(" 이벤트 리스너 외부구현 >>> : ");
		((JFrame)elt).setTitle(e.getActionCommand() + " : " + ++cnt);
	}
}