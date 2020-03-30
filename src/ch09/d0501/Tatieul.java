package ch09.d0501;

import java.awt.Color;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Tatieul extends JPanel implements KeyListener
{
	private Point shipPos = new Point(320, 400);
	
	public Tatieul()
	{
		setPreferredSize(new Dimension(640, 480));
		setFocusable(true);
		addKeyListener(this);
	} // EOCst
	
	public void keyPressed(KeyEvent e)
	{
		switch (e.getKeyCode())
		{
		case KeyEvent.VK_UP		: shipPos.y -= 10; break;
		case KeyEvent.VK_DOWN	: shipPos.y += 10; break;
		case KeyEvent.VK_LEFT	: shipPos.x -= 10; break;
		case KeyEvent.VK_RIGHT	: shipPos.x += 10; break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 640, 480);
		g.setColor(Color.red);
		g.fillOval(shipPos.x - 8, shipPos.y - 16, 16, 32);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Tatieul - New Generation Shooting Game");
        frame.setContentPane(new Tatieul());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}
