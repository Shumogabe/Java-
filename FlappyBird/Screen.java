package FlappyBird;

import javax.swing.JFrame;

public class Screen {
	int wedth=800, height=600;
	public void flappyBird() {
		JFrame jframe = new JFrame("Flappy Bird");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(wedth,height);
		jframe.setVisible(true);
	}
	public static void main(String[] arg) {
		
	}
}
  	