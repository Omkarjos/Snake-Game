package game;
import javax.swing.JFrame;

public class Gamefr extends JFrame {
	
 Gamefr(){
	 
	 
	 this.add(new GamePanel());
	 this.setTitle("snake");
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setResizable(false);
	 this.pack();
	 this.setVisible(true);
	 this.setLocationRelativeTo(null);
	 
 }
	

}
