package ch09.d0502;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyGridTest extends JFrame implements ActionListener
{
	JLabel jl0 = null;
	JLabel jl1 = null;
	JLabel jl2 = null;
	JLabel jl3 = null;
	
	JTextField jf0 = null;
	JTextField jf1 = null;
	JTextField jf2 = null;
	JTextField jf3 = null;
	
	JButton jb0 = null;
	JButton jb1 = null;
	JButton jb2 = null;
	JButton jb3 = null;
	
	JPanel jp0 = null;
	JPanel jp1 = null;
	
	public MyGridTest()
	{
		super("회원가입");
		setLocation(200, 200);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(null);
		
		jl0 = new JLabel("회원번호", JLabel.CENTER);
		jl1 = new JLabel("회원이름", JLabel.CENTER);
		jl2 = new JLabel("회원아이디", JLabel.CENTER);
		jl3 = new JLabel("회원패스워드", JLabel.CENTER);
		
		jf0 = new JTextField();
		jf1 = new JTextField();
		jf2 = new JTextField();
		jf3 = new JTextField();
		
		jb0 = new JButton("조회");
		jb1 = new JButton("등록");
		jb2 = new JButton("수정");
		jb3 = new JButton("삭제");
		
		jp0 = new JPanel();
		jp1 = new JPanel();
		
		jp0.setLayout(new GridLayout(4,2,2,2));
		jp1.setLayout(new FlowLayout());
		
		jp0.add(jl0);	jp0.add(jf0);
		jp0.add(jl1);	jp0.add(jf1);
		jp0.add(jl2);	jp0.add(jf2);
		jp0.add(jl3);	jp0.add(jf3);
		
		jp1.add(jb0);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jb0.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		add(jp0, "Center");
		add(jp1, "South");
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		Object obj = e.getSource();
//		String strVal = e.getActionCommand();
//System.out.println(" obj : " + obj);		
//System.out.println(" strVal : " + strVal);
		
		if (e.getSource() == jb0)
		{
			System.out.println("  Selected Search Button");
			memberInfo(jb0.getActionCommand());
		}
		if (e.getSource() == jb1)
		{
			System.out.println("  Selected registration Button");
			memberInfo(jb1.getActionCommand());
		}
		if (e.getSource() == jb2)
		{
			System.out.println("  Selected modification Button");
			memberInfo(jb2.getActionCommand());
		}
		if (e.getSource() == jb3)
		{
			System.out.println("  Selected deletion Button");
			memberInfo(jb3.getActionCommand());
		}
		setTextClear();
		
	}
	
	void setTextClear()
	{
		jf0.setText("");
		jf1.setText("");
		jf2.setText("");
		jf3.setText("");
	}
	
	void memberInfo(String btn)
	{
		System.out.println(   " 회원번호: " + jf0.getText() +"\n"
							+ " 회원이름: " + jf1.getText() +"\n"
							+ " 회원아이디: " + jf2.getText() +"\n"
							+ " 회원패스워드: " + jf3.getText());
		System.out.println(" >> 다음 회원을 " + btn + " 하였습니다.");
	}
	
	public static void main(String[] args) {
		new MyGridTest();

	}

}
