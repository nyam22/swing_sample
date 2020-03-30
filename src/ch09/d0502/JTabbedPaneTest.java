package ch09.d0502;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class JTabbedPaneTest extends JFrame
{
	JTabbedPane tab;
	JTableOne jt1;
	JTableTwo jt2;
	
	public JTabbedPaneTest()
	{
		super(" JTabbedPaneTest Example ");
		
//		tab = new JTabbedPane(JTabbedPane.TOP);
//		tab = new JTabbedPane(JTabbedPane.BOTTOM);
		tab = new JTabbedPane(JTabbedPane.LEFT);
//		tab = new JTabbedPane(JTabbedPane.RIGHT);
		
		JPanel one = new JPanel();
		jt1 = new JTableOne();
		JPanel two = new JPanel();
		jt2 = new JTableTwo();
		
		one.add(jt1);
		two.add(jt2);
		
		tab.addTab("�λ����(�⺻)", one);
		tab.addTab("�λ����(����)", two);
		
		getContentPane().add(tab, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTabbedPaneTest();
	}

}

class JTableOne extends JPanel
{
	public JTableOne()
	{
		String title[] = {"��ȣ", "�̸�", "�Ի���"};
		String data[][] = {
				{"1", "�Ѽ���", "2000-03-11"}
			   ,{"2", "�����", "2001-04-12"}
			   ,{"3", "Ȳ����", "2002-05-13"}
		};	  
		
		JTable jt = new JTable(data, title);
		JScrollPane jp = new JScrollPane(jt);
		add(jp);
	}
}

class JTableTwo extends JPanel
{
	public JTableTwo()
	{		
		String title[] = {"��ȣ", "�μ�", "����"};
		String data[][] = {
				{"1", "��ȹ��", "����"}
			   ,{"2", "ȫ����", "�븮"}
			   ,{"3", "���ߺ�", "�븮"}
		};	   
		
		JTable jt = new JTable(data, title);
		JScrollPane jp = new JScrollPane(jt);
		add(jp);
	}
}