package java13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* 스윙으로 텍스트 입력 필드 만들기
 * 
 */


public class Awt_Test11 {

	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setTitle("윈도우 창");
		JPanel panel = new JPanel();// 스윙 패널은 컴포넌트들을 그릅화 해서 배치하는 컨테이너 즉 레이아웃
		f.add(panel);// 스윙 프레임윈도우에  스윙 패널 추가
		
		/*배치관리자 기본값)
		 * 1.스윙 프레임 윈도우인 JFrame은 기본 배치관리자로 보더 레이아웃이다
		 * 2.스윙 패널은 기본 배치관리자로 플로우 레이아웃이다.
		 */
		JLabel label01 = new JLabel("화씨 온도"); //JLabel은 설명을 덧붙일 때 사용한다.
		JLabel label02 = new JLabel("섭씨 온도");
		JTextField field01 = new JTextField(13);
		JTextField field02 = new JTextField(13);
		JButton button = new JButton("온도 변환");
		
		button.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
				    String fahrenheitText = field01.getText();
				    double fahrenheit = Double.parseDouble(fahrenheitText);
				    double celsius = (fahrenheit - 32) * 5 / 9;
				    field02.setText(Double.toString(celsius));
			 }
			
		});
	
		
		panel.add(label01);
		panel.add(field01);
		panel.add(label02);
		panel.add(field02);
		panel.add(button);
		
		f.setSize(800,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		
	}

}
