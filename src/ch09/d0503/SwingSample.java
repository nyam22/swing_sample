package ch09.d0503;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingSample extends JFrame
{
	JPanel nFrame = new JPanel();	// 각 프레임단위를
	JPanel eFrame = new JPanel();	// J패널로 instance
	JPanel okFrame = new JPanel();
	
	public SwingSample(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 460);	// 전체창 크기
		setTitle(title);
		nameFrame();		// Name프레임 호출
		emailFrame();		// E-mail프레임 호출
		contactFrame();		// Name & Email, OK버튼 Boundary 
		setLayout(null);	// 각 프레임 위치 초기화
		setVisible(true);
	}
	
	void nameFrame()
	{	
		JPanel npl = new JPanel();	// Name 패널 instance
		npl.setLayout(null);		// Name 패널 위치 초기화
		npl.setPreferredSize(new Dimension(450, 115));
									// Name 패널 사이즈 재정의
		//npl.setBackground(Color.gray);
		
		// Label & TextField instance
		JLabel lb1 = new JLabel("이  름 : ", JLabel.RIGHT);
		JLabel lb2 = new JLabel("직  책 : ", JLabel.RIGHT);
		JLabel lb3 = new JLabel("아이디 : ", JLabel.RIGHT);
		JTextField jt1 = new JTextField();
		JTextField jt2 = new JTextField();
		JTextField jt3 = new JTextField();
		
		// Label & TextField 위치 지정
		lb1.setBounds(0, 4, 60, 20);
		lb2.setBounds(0, 27, 60, 20);
		lb3.setBounds(220, 27, 60, 20);
		jt1.setBounds(60, 4, 150, 20);
		jt2.setBounds(60, 27, 150, 20);
		jt3.setBounds(280, 27, 150, 20);
		
		// Label & TextField 패널에 부착
		npl.add(lb1);	npl.add(lb2);	npl.add(lb3);
		npl.add(jt1);	npl.add(jt2);	npl.add(jt3);
		
		nFrame.add(npl);	// Name 패널을 Name 프레임에 부착 
	}
	
	void emailFrame()
	{
		JPanel ep1 = new JPanel();	// E-mail 패널1 instance
		ep1.setLayout(null);		// E-mail 패널1 위치 초기화
		ep1.setPreferredSize(new Dimension(450, 130));
									// E-mail 패널1 사이즈 재정의
		//ep1.setBackground(Color.yellow);
		
		// Label & TextField & TextArea & Button instance
		JLabel lbl = new JLabel("이메일 주소 :", JLabel.LEFT);
		JTextField jtf = new JTextField();
		JTextArea jta = new JTextArea();
		jta.setBorder(new LineBorder(Color.gray));
		
		JButton btn1 = new JButton("Add");
		JButton btn2 = new JButton("Edit");
		JButton btn3 = new JButton("Remove");
		JButton btn4 = new JButton("Default");
		
		// Label & TextField & TextArea & Button 위치 지정
		lbl.setBounds(15, 0, 80, 20);
		jtf.setBounds(95, 0, 250, 20);
		jta.setBounds(15, 25, 330, 100);
		
		btn1.setBounds(355, 0, 80, 25);
		btn2.setBounds(355, 33, 80, 25);
		btn3.setBounds(355, 66, 80, 25);
		btn4.setBounds(355, 99, 80, 25);
		
		// Label & TextField & TextArea & Button 패널에 부착
		ep1.add(lbl);	ep1.add(jtf);	ep1.add(jta);
		ep1.add(btn1);	ep1.add(btn2);	ep1.add(btn3);	ep1.add(btn4);
		
		// ======================================================== //
		
		JPanel ep2 = new JPanel();	// e-mail 패널2 instance
		ep2.setLayout(null);		// e-mail 프레임2 위치 초기화
		ep2.setPreferredSize(new Dimension(450, 40));
									// E-mail 패널2 사이즈 재정의
		//ep2.setBackground(Color.cyan);
		
		// Label & Toggle Button instance
		JLabel jlb = new JLabel("Mail Format:");
		
		JRadioButton rbt1 = new JRadioButton("HTML", true);
		JRadioButton rbt2 = new JRadioButton("Plain Text");
		JRadioButton rbt3 = new JRadioButton("Custom");
		
		// Radio Button Grouping
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rbt1);  bgroup.add(rbt2);  bgroup.add(rbt3);
		
		// Label & Toggle Button 위치 지정
		jlb.setBounds(15, 0, 80, 20);
		rbt1.setBounds(20, 23, 60, 20);
		rbt2.setBounds(85, 23, 90, 20);
		rbt3.setBounds(180, 23, 70, 20);
		
		// Label & Toggle Button 패널에 부착
		ep2.add(jlb);
		ep2.add(rbt1);	ep2.add(rbt2);	ep2.add(rbt3);
		
		// E-mail 패널1, 패널2 를 E-mail 프레임에 부착
		eFrame.add(ep1);	eFrame.add(ep2);
	}
		
	void contactFrame()		// 각 프레임을 전체창에다 정렬 부착
	{
		nFrame.setBounds(10, 10, 465, 150);		// Name 프레임 위치 지정
		nFrame.setBorder(new TitledBorder("Name"));		// 프레임 테두리
		getContentPane().add(nFrame);			// 전체창에 프레임 부착
		
		eFrame.setBounds(10, 160, 465, 220);	// E-mail 프레임 위치 지정
		eFrame.setBorder(new TitledBorder("E-mail"));	// 프레임 테두리
		getContentPane().add(eFrame);			// 전체창에 프레임 부착
		
		okFrame.setBounds(280, 380, 200, 40);	// OK-Cancel 단추 위치 지정
		okFrame.add(new JButton("     OK     "));
		okFrame.add(new JButton("  Cancel  "));
		//okFrame.setBackground(Color.blue);
		getContentPane().add(okFrame);		// 전체창에 OK-Cancel 단추 부착
	}
	
	public static void main(String[] args) {
		SwingSample ss = new SwingSample("E-mail Contacts");
	}
}
