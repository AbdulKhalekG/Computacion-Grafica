package graficos;
import javax.swing.*;
//ADNAN ABDUL KHALEK 27750460
public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Comp Graf");
	}

}

class miMarco extends JFrame{
	
	public miMarco () {
		
		/*setSize(500, 300);
		setLocation(500, 300);
		*/
		setBounds(500,300,500,300);
		//setResizable(false);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setTitle("Instagram");
		}
}

//ADNAN ABDUL KHALEK 27750460
