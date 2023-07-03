package java13;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;

class FrameEvent09 extends Frame {
	
	Button greenBtn , blackBtn;
	public FrameEvent09() {
		super("프로그램 창");
		setLayout(new FlowLayout());
		greenBtn = new Button("Green");
		blackBtn = new Button("Black");
		add(greenBtn);
		add(blackBtn);

		setSize(600,400);
		setVisible(true);
		addWindowListener(new EventHandler());
	}
		class EventHandler extends WindowAdapter{

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		}
//		greenBtn.addActionListener(this);
//		blackBtn.addActionListener(this);
		
		
//		addWindowListener(new WindowAdapter() {
//		 public void WindowClosing(WindowEvent e) {
//			 dispose();
//			 System.exit(0);
//		 }
//		});
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource().equals("Green")) {
//			setBackground(Color.green);
//			
//		}
//		else {
//			setBackground(Color.black);
//			
//		}
//	}
	

public class Awt_Test09 {

	public static void main(String[] args) {
		new FrameEvent09();
		/* 현재 프레임 윈도우 닫기 메서드를 오버라이딩해서 닫혀지게 만들어보자
		 * 
		 */
	}

}
