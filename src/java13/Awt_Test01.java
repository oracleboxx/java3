package java13;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*생성자
Component ( )
메서드
public void add(PopupMenu pop) 컴포넌트에 팝업 메뉴를 추가합니다.
public Color getBackground() 컴포넌트 바탕색을 반환합니다.
public Color getForeground() 컴포넌트 전경색을 반환합니다.
public Graphics getGraphics() 컴포넌트 Graphic 객체를 반환합니다.
public String getName() 컴포넌트 이름을 반환합니다.
public Container getParent() 부모 컨테이너를 반환합니다.
public Dimension getSize() 컴포넌트 크기를 반환합니다
*/

class FrameEvent01 extends Frame{
	public  FrameEvent01(){
		super("Frame Window"); // 조상 클래스 오버로딩 된 생성자 호출
		setSize(300,200);//프레임 폭을 300, 높이를 200으로 지정
		setVisible(true);// 프레임 윈도우 보이기
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); // 자원 해제하면서 닫기
				System.exit(0);// 프레임 윈도우 종료
			}
		        // Perform actions when the window is closing
		}); // 익명 클래스 문법으로 이벤트 처리 => 외부 클래스 $번호.class로 컴파일된다.(FrameEvent01$1.class)
		//add+이벤트리스너 인터페이스 
		
	}
}

public class Awt_Test01 {

	public static void main(String[] args) {
		new FrameEvent01();
	}

}
