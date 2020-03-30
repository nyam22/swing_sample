package ch09.d0503;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListWin extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public ListWin(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setTitle(title);
		makeList();
		setVisible(true);
	}
	
	public void makeList()
	{
		String code[] = {   "Cupcake 1.5", "Donut 1.6",
							"Eclair 2.0", "Froyo 2.2",
							"Gingerbread 2.3", "Honeycomb 3.0",
							"Icecream Sandwich 4.0"
						};
		JList<String> lst = new JList<String>(code);
		JPanel pan1 = new JPanel();
			pan1.setBackground(Color.YELLOW);
		pan1.add(lst);
		
		String swing[] = {	"javax.accessibility", "javax.swing",
							"javax.swing.border", "javax.swing.event",
							"javax.swing.filechooser", "javax.swing.plaf", 
							"javax.swing.plaf.basic", "javax.swing.plaf.metal"
						 };
		JList<String> pkg = new JList<String>(swing);
		pkg.setVisibleRowCount(4);
		JScrollPane sp = new JScrollPane(pkg);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		String ph[] = {	"Galaxy S", "Galaxy S2",
						"Galaxy Note", "Galaxy S3"
					  };
		JComboBox<String> cb = new JComboBox<String>(ph);
		cb.addItem(new String("Galaxy Note2"));
		cb.setEditable(false);
		cb.setSelectedIndex(1);
		
		JPanel pan2 = new JPanel();
			pan2.setBackground(Color.GREEN);
		pan2.add(sp);
		pan2.add(cb);
		
		JPanel p = new JPanel(new GridLayout(1, 2));
		p.add(pan1);
		p.add(pan2);
		
		getContentPane().add(p);
	}
	
	public static void main(String[] args) {
		ListWin win = new ListWin("목록 선택을 위한 콘트롤");
	}

}
