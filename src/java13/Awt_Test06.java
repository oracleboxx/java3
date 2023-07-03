package java13;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

class FrameEvent06 extends Frame{
	Button redBtn, blueBtn;
	
	public FrameEvent06() {
		setLayout(new FlowLayout());
		

		JButton redBtn = new JButton("Red Button");
		JButton blueBtn = new JButton("Blue Button");
		
		Font font = new Font("Arial", Font.BOLD, 16); // 예시로 Arial 폰트, 굵게(BOLD), 크기 14로 설정

		redBtn.setFont(font);
		blueBtn.setFont(font);
	

		redBtn.setForeground(Color.RED);

	
		
	
		blueBtn.setForeground(Color.blue);
		add(redBtn);
		add(blueBtn);
		ButtonListener handler =new ButtonListener(); // 이벤트 처리 객체 생성
		 // 각 버튼 이벤트 등록
		redBtn.addActionListener(handler); // add+이벤트 리스너 인터페이스이름(); 이 이벤트 등록 메서드
		blueBtn.addActionListener(handler);
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
}
class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 클릭되었습니다");
	}
	
}
public class Awt_Test06 {

	public static void main(String[] args) {
		new FrameEvent06();
	}

}
