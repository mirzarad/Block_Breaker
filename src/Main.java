/**
 * Created by Mirza Radoncic on 3/22/2018.
 */

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Block Breaker");
		
		BlockBreakerPanel panel = new BlockBreakerPanel();
		
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(490,600);
		
		frame.setResizable(false);
	}
}