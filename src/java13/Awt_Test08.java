package java13;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent08 extends Frame implements ActionListener{
	Button orangeBtn, yellowBtn;
	
	public FrameEvent08(){
		setLayout(new FlowLayout());
		
		orangeBtn = new Button("Orange");
		yellowBtn = new Button("Yellow");
		add(orangeBtn);
		add(yellowBtn);
		
		orangeBtn.addActionListener(this);
		yellowBtn.addActionListener(this);
		
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == orangeBtn) {
			setBackground(Color.orange);
		}
		else {
			setBackground(Color.yellow);
		}
	}
	
}



public class Awt_Test08 {

	public static void main(String[] args) {
		new FrameEvent08();
	}

}
