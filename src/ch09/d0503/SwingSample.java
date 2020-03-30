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
	JPanel nFrame = new JPanel();	// �� �����Ӵ�����
	JPanel eFrame = new JPanel();	// J�гη� instance
	JPanel okFrame = new JPanel();
	
	public SwingSample(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 460);	// ��üâ ũ��
		setTitle(title);
		nameFrame();		// Name������ ȣ��
		emailFrame();		// E-mail������ ȣ��
		contactFrame();		// Name & Email, OK��ư Boundary 
		setLayout(null);	// �� ������ ��ġ �ʱ�ȭ
		setVisible(true);
	}
	
	void nameFrame()
	{	
		JPanel npl = new JPanel();	// Name �г� instance
		npl.setLayout(null);		// Name �г� ��ġ �ʱ�ȭ
		npl.setPreferredSize(new Dimension(450, 115));
									// Name �г� ������ ������
		//npl.setBackground(Color.gray);
		
		// Label & TextField instance
		JLabel lb1 = new JLabel("��  �� : ", JLabel.RIGHT);
		JLabel lb2 = new JLabel("��  å : ", JLabel.RIGHT);
		JLabel lb3 = new JLabel("���̵� : ", JLabel.RIGHT);
		JTextField jt1 = new JTextField();
		JTextField jt2 = new JTextField();
		JTextField jt3 = new JTextField();
		
		// Label & TextField ��ġ ����
		lb1.setBounds(0, 4, 60, 20);
		lb2.setBounds(0, 27, 60, 20);
		lb3.setBounds(220, 27, 60, 20);
		jt1.setBounds(60, 4, 150, 20);
		jt2.setBounds(60, 27, 150, 20);
		jt3.setBounds(280, 27, 150, 20);
		
		// Label & TextField �гο� ����
		npl.add(lb1);	npl.add(lb2);	npl.add(lb3);
		npl.add(jt1);	npl.add(jt2);	npl.add(jt3);
		
		nFrame.add(npl);	// Name �г��� Name �����ӿ� ���� 
	}
	
	void emailFrame()
	{
		JPanel ep1 = new JPanel();	// E-mail �г�1 instance
		ep1.setLayout(null);		// E-mail �г�1 ��ġ �ʱ�ȭ
		ep1.setPreferredSize(new Dimension(450, 130));
									// E-mail �г�1 ������ ������
		//ep1.setBackground(Color.yellow);
		
		// Label & TextField & TextArea & Button instance
		JLabel lbl = new JLabel("�̸��� �ּ� :", JLabel.LEFT);
		JTextField jtf = new JTextField();
		JTextArea jta = new JTextArea();
		jta.setBorder(new LineBorder(Color.gray));
		
		JButton btn1 = new JButton("Add");
		JButton btn2 = new JButton("Edit");
		JButton btn3 = new JButton("Remove");
		JButton btn4 = new JButton("Default");
		
		// Label & TextField & TextArea & Button ��ġ ����
		lbl.setBounds(15, 0, 80, 20);
		jtf.setBounds(95, 0, 250, 20);
		jta.setBounds(15, 25, 330, 100);
		
		btn1.setBounds(355, 0, 80, 25);
		btn2.setBounds(355, 33, 80, 25);
		btn3.setBounds(355, 66, 80, 25);
		btn4.setBounds(355, 99, 80, 25);
		
		// Label & TextField & TextArea & Button �гο� ����
		ep1.add(lbl);	ep1.add(jtf);	ep1.add(jta);
		ep1.add(btn1);	ep1.add(btn2);	ep1.add(btn3);	ep1.add(btn4);
		
		// ======================================================== //
		
		JPanel ep2 = new JPanel();	// e-mail �г�2 instance
		ep2.setLayout(null);		// e-mail ������2 ��ġ �ʱ�ȭ
		ep2.setPreferredSize(new Dimension(450, 40));
									// E-mail �г�2 ������ ������
		//ep2.setBackground(Color.cyan);
		
		// Label & Toggle Button instance
		JLabel jlb = new JLabel("Mail Format:");
		
		JRadioButton rbt1 = new JRadioButton("HTML", true);
		JRadioButton rbt2 = new JRadioButton("Plain Text");
		JRadioButton rbt3 = new JRadioButton("Custom");
		
		// Radio Button Grouping
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rbt1);  bgroup.add(rbt2);  bgroup.add(rbt3);
		
		// Label & Toggle Button ��ġ ����
		jlb.setBounds(15, 0, 80, 20);
		rbt1.setBounds(20, 23, 60, 20);
		rbt2.setBounds(85, 23, 90, 20);
		rbt3.setBounds(180, 23, 70, 20);
		
		// Label & Toggle Button �гο� ����
		ep2.add(jlb);
		ep2.add(rbt1);	ep2.add(rbt2);	ep2.add(rbt3);
		
		// E-mail �г�1, �г�2 �� E-mail �����ӿ� ����
		eFrame.add(ep1);	eFrame.add(ep2);
	}
		
	void contactFrame()		// �� �������� ��üâ���� ���� ����
	{
		nFrame.setBounds(10, 10, 465, 150);		// Name ������ ��ġ ����
		nFrame.setBorder(new TitledBorder("Name"));		// ������ �׵θ�
		getContentPane().add(nFrame);			// ��üâ�� ������ ����
		
		eFrame.setBounds(10, 160, 465, 220);	// E-mail ������ ��ġ ����
		eFrame.setBorder(new TitledBorder("E-mail"));	// ������ �׵θ�
		getContentPane().add(eFrame);			// ��üâ�� ������ ����
		
		okFrame.setBounds(280, 380, 200, 40);	// OK-Cancel ���� ��ġ ����
		okFrame.add(new JButton("     OK     "));
		okFrame.add(new JButton("  Cancel  "));
		//okFrame.setBackground(Color.blue);
		getContentPane().add(okFrame);		// ��üâ�� OK-Cancel ���� ����
	}
	
	public static void main(String[] args) {
		SwingSample ss = new SwingSample("E-mail Contacts");
	}
}
