package java13;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/* 그리드 레이아웃 배치관리자에서 3개의 열과 필요한 만큼의 행을 가지는 경우
 * 
 */

class FrameEvent12 extends JFrame{
	public FrameEvent12() {
		super("프로그램 창");
		setLayout(new GridLayout(0,3));
	
		
		add(new JButton("Button 01"));
		add(new JButton("Button 02"));
		add(new JButton("Button 03"));
		add(new JButton("Button 04"));
		add(new JButton("Button 05"));
		add(new JButton("Button 06"));
		add(new JButton("Button 07"));
		
		
		pack(); // 프레임에 소속된 각 컴포넌트들의 크기를 맞게 조정
		setSize(300,200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class Awt_Test12 {
	public static void main(String[] args) {
		new FrameEvent12();
		
		
	}
}
