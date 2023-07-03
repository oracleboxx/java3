package java13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/* 그리드 레이아웃 배치관리자 
 * 
 * 
 * 
 * 
 */
class FrameEvent04 extends Frame{
	public FrameEvent04() {
		
		super("Hello Frame Window !!");
		setLayout(new GridLayout(3,2));// 3행 *2열의 그리드 레이아웃 배치관리자 설정
		
		
		add(new Button("Button01"));
		add(new Button("Button02"));
		add(new Button("Button03"));
		add(new Button("Button04"));
		add(new Button("Button05"));
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				
				System.exit(0); // 종료하는 코드 
			}
			
		});
	}
	 
}
public class Awt_Test04 {

	public static void main(String[] args) {
 new FrameEvent04();
	}

}
