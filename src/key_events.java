import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class key_events implements KeyListener{

	
	public key_events() {
		
	}
	
	
	public static void main(String[] args){
		
		//JFrame frame= new JFrame("Jframe");
		//frame.add(new jframe());
		//frame.setTitle("FrameRNeat");
		//frame.setLocation(0, 0);
		//frame.getContentPane().setBackground( Color.red );
		//frame.setSize(1920,1080 );		
		//frame.setResizable(false);
		//frame.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		
		if(keycode == KeyEvent.VK_W || keycode == KeyEvent.VK_UP){
			System.out.println("Nice");
	}else if(keycode == KeyEvent.VK_S || keycode == KeyEvent.VK_DOWN){
		System.out.println("Nice");	
	}else if(keycode == KeyEvent.VK_D || keycode == KeyEvent.VK_RIGHT){
		System.out.println("Nice");
	}else if(keycode == KeyEvent.VK_A || keycode == KeyEvent.VK_LEFT){
		System.out.println("Nice");
	}
}
		

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void main() {
		// TODO Auto-generated method stub
		
	}
}