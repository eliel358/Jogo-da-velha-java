import javax.swing.*;
public class app{
	
	public static void main(String[] args){
		JButton[][] buttonsArrays = new JButton[3][3];
		JFrame myWindow = newWindow("Tic Tac Toe",500,100,600,600);		
		for(int i=0;i<3;i++){
			for(int a=0;a<3;a++){
				JButton button = newButton("",150+100*i,100+100*a,100,100);
				myWindow.add(button);
				buttonsArrays[i][a] = button;
				myWindow.repaint();
			}
		}
		for(int a=0;a<3;a++){
			for(int i=0;i<3;i++){
				System.out.print((buttonsArrays[0][0]).getText()+",");
			}
			System.out.println("");
		}
		System.out.println(myWindow);
		
		
	}
	private static JFrame newWindow(String name,int x,int y,int w,int h){
		JFrame window = new JFrame(name);
		window.setBounds(x,y,w,h);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return window;
	}
	private static JButton newButton(String name,int x,int y, int w,int h){
		JButton button = new JButton(name);
		button.setBounds(x,y,w,h);
		return button;
	}
	
	// private static JPanel newPanel(int x,int y, int w,int h){
		// JPanel panel = new JPanel();
		// panel.setBounds(x,y,w,h);
		// return panel;
	// }
}