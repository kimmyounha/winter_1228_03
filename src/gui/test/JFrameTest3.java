package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Inner(내부) 클래스로 ActionListener 구현

@SuppressWarnings("serial")
public class JFrameTest3 extends JFrame {
	ImageIcon icon = new ImageIcon("images/sjk.jpg");
	JLabel lbl = new JLabel(icon, JLabel.CENTER);
	JButton btn1 = new JButton("Ive");
	JButton btn2 = new JButton("Black Pink");
	JButton btn3 = new JButton("New Jeans");
	
	public JFrameTest3() {
		JPanel pan = new JPanel();
		BtnListener btnListener = new BtnListener();

		btn1.addActionListener(btnListener);
		btn2.addActionListener(btnListener);
		btn3.addActionListener(btnListener);
		pan.add(btn1); pan.add(btn2); pan.add(btn3);
		add(pan, "North");

		add(lbl, "Center");
		setTitle("JFrame 상속 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameTest3();

	}

	public class BtnListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object btnSource = e.getSource();	
			if(btnSource == btn1) {
				icon = new ImageIcon("images/ive.jpg");
			}else if(btnSource == btn2) {
				icon = new ImageIcon("images/bp.jpg");
			}else {
				icon = new ImageIcon("images/newjeans.jpg");
			}
			
			lbl.setIcon(icon);
		}	
	}



}
