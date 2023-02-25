import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JavaBasic13_3 extends JFrame{
	JavaBasic13_3(){
		setTitle("swing 연습");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* 1)버튼을 컨텍트 팬을 통해 추가하는 코드
		   Container ContentPane = getContentPane();
		   ContentPane.setLayout(null);
		   JButton button = new JButton("test");
		   button.setSize(70,20);
		   button.setLocation(50,10);
		   ContentPane.add(button); */
		 // 2)JFrame을 통해 버튼을 추가하는 코드 JDK 1.5
		this.setLayout(null);
		JButton button = new JButton("test");
		button.setSize(100,20);
		button.setLocation(50,10);
		this.add(button);
	}
	public static void main(String[] args) {
		JavaBasic13_3 MainFrame = new JavaBasic13_3();
	}
}
