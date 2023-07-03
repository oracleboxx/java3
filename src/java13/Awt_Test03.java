package java13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent03 extends Frame{
	public FrameEvent03() {
		setLayout(new BorderLayout());
		//BorderLayout은 컨테이너의 5개 영역(동, 서, 남, 북, 가운데)에 
		//컴포넌트를 배치하는 레이아웃 매니저입니다. 
		//BorderLayout은 기본적으로 컴포넌트를 중앙에 배치하고, 동, 서, 남, 북에는 
		//컴포넌트를 배치하지만 필요에 따라 영역에 컴포넌트를 배치하지 않을 수도 있습니다.
		
		add(new Button("Button 01"),"North");
		add(new Button("Button 02"),"West");
		add(new Button("Button 03"),"Center");
		add(new Button("Button 04"),"East");
		add(new Button("Button 04"),"South");
		
		
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




public class Awt_Test03 {

	public static void main(String[] args) {
		
 new FrameEvent03();
	}

}
