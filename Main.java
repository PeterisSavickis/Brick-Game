package BrickBraker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GamePlay gamePlay = new GamePlay();
		frame.setBounds(600, 200, 700, 600);
		frame.setTitle("Ball Game");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gamePlay);

	}

}
