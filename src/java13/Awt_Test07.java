package java13;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent07 extends Frame{
	Button redBtn, blueBtn;
	public FrameEvent07() {
		super("프로그램 창");
		setLayout(new FlowLayout());
		redBtn= new Button("Red");
		blueBtn = new Button("Blue");
		add(redBtn);
		add(blueBtn);
		ButtonListener07 handler = new ButtonListener07(this); // this 프레임 윈도우 내자신
		redBtn.addActionListener(handler);
		blueBtn.addActionListener(handler);
		setSize(600,600); 
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
}
class ButtonListener07 implements ActionListener{
	Frame frm;
public ButtonListener07() {
	
}
	public ButtonListener07(Frame frm) {
		this.frm=frm;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Red")) {
			frm.setBackground(Color.red);
		}
			else {
				frm.setBackground(Color.blue);
			}
		}
}
	

public class Awt_Test07 {

	public static void main(String[] args) {
		new FrameEvent07();
	}

}
