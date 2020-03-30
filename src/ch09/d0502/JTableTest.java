package ch09.d0502;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame
{
	public JTableTest()
	{
		super(" JTable Example ");
		String title[] = {"Number", "Name", "Employment Date"};
		String data[][] = {
				{"1", "한성령", "2000-03-11"}
			   ,{"2", "서장웅", "2001-04-12"}
			   ,{"3", "황성원", "2002-05-13"}
			   ,{"4", "정경하", "2003-06-14"}
			   ,{"5", "이도희", "2004-07-15"}
			   ,{"6", "박세욱", "2005-08-16"}
			   ,{"7", "함영준", "2006-09-17"}
			   ,{"8", "양진호", "2007-10-18"}	
		};
		
		JTable jt = new JTable(data, title);
		JScrollPane jp = new JScrollPane(jt);
		getContentPane().add(jp, BorderLayout.CENTER);
		setSize(300, 150);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		JTableTest jTable = new JTableTest();
		jTable.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
