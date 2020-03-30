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
		
		tab.addTab("인사관리(기본)", one);
		tab.addTab("인사관리(세부)", two);
		
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
		String title[] = {"번호", "이름", "입사일"};
		String data[][] = {
				{"1", "한성령", "2000-03-11"}
			   ,{"2", "서장웅", "2001-04-12"}
			   ,{"3", "황성원", "2002-05-13"}
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
		String title[] = {"번호", "부서", "직급"};
		String data[][] = {
				{"1", "기획부", "과장"}
			   ,{"2", "홍보부", "대리"}
			   ,{"3", "개발부", "대리"}
		};	   
		
		JTable jt = new JTable(data, title);
		JScrollPane jp = new JScrollPane(jt);
		add(jp);
	}
}