package java13;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/* javax.swing패키지의 스윙으로 스윙api로 ui그리기)
 * 스윙 프레임 윈도우에 스윙 버튼을 배치
 * 
 */
class FrameEvent10 extends JFrame{ // AWT Frame에 영문 대문자 j가 붙어서 JFrame이 되면 스윙 프레임윈도우가 된다
	public FrameEvent10() {
		
		super("스윙 프레임 윈도우 그리기"); // 스윙 프레임 윈도우 제목설정
		setSize(300,300);
		setLayout(new FlowLayout());
		JButton btn =new JButton("버튼");
	    add(btn); // 프레임 윈도우 버튼추가 this.생략가능
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//스윙 프레임 윈도우 닫기
		
//		addWindowListener(new WindowAdapter() {		기존 프레임 윈도우 닫기
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
		
	}
}
public class Awt_Test10 {

	public static void main(String[] args) {
		new FrameEvent10();
	}

}
