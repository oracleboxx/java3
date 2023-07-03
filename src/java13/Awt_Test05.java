package java13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class FrameEvent05 extends Frame{
	Panel pan01,pan02,pan03;
	
	public FrameEvent05() {
		super("Hellow Frame ");

		pan01 = new Panel();
		pan02 = new Panel();
		pan03 = new Panel();
		pan01.setBackground(Color.orange);// 첫번째 패널을 프레임 윈도우 북쪽에 배치=>보더 레이아웃
		pan02.setBackground(Color.blue);
		pan03.setBackground(Color.red);
		
		add(BorderLayout.NORTH,pan01);
		add(BorderLayout.CENTER,pan02);
		add(BorderLayout.SOUTH,pan03);
		
		pan01.add(new Button("선택 01"));
		pan01.add(new Button("선택 02"));
		pan02.add(new Button("선택 03"));
		pan03.add(new Button("선택 04"));
		pan03.add(new Button("선택 05"));
		
		setSize(400,300);
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
public class Awt_Test05 {

	
	
	public static void main(String[] args) {
		new FrameEvent05();
	}

}
