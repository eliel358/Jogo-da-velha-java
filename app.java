import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class app{
	static int turn = 1;
	public static void main(String[] args){
		JFrame myWindow = newWindow("Tic Tac Toe",500,100,600,600);		
		JButton[][] buttonsArrays = new JButton[3][3];
		myWindow.setLayout(new GridLayout(3, 3));
		myWindow.setResizable(false);
		for(int i=0;i<3;i++){
			for(int a=0;a<3;a++){
				JButton button = newButton("",150+100*i,100+100*a,100,100);
				myWindow.add(button);
				btlistener(myWindow,button,buttonsArrays);
				buttonsArrays[i][a] = button;
			}
		}
		for(int a=0;a<3;a++){
			for(int i=0;i<3;i++){
				System.out.print((buttonsArrays[0][0]).getText()+",");
			}
			System.out.println("");
		}
		System.out.println(myWindow);
		myWindow.setVisible(true);
	}
	private static void checkWinner(JButton[][] arrayButtons){
		if(arrayButtons[0][0].getText() == arrayButtons[0][1].getText() && arrayButtons[0][1].getText() == arrayButtons[0][2].getText() && arrayButtons[0][2].getText() != ""||
		   arrayButtons[1][0].getText() == arrayButtons[1][1].getText() && arrayButtons[1][1].getText() == arrayButtons[1][2].getText() && arrayButtons[1][2].getText() != ""||
		   arrayButtons[2][0].getText() == arrayButtons[2][1].getText() && arrayButtons[2][1].getText() == arrayButtons[2][2].getText() && arrayButtons[2][2].getText() != ""||
		   arrayButtons[0][0].getText() == arrayButtons[1][0].getText() && arrayButtons[1][0].getText() == arrayButtons[2][0].getText() && arrayButtons[2][0].getText() != ""||
		   arrayButtons[0][1].getText() == arrayButtons[1][1].getText() && arrayButtons[1][1].getText() == arrayButtons[2][1].getText() && arrayButtons[2][1].getText() != ""||
		   arrayButtons[0][2].getText() == arrayButtons[1][2].getText() && arrayButtons[1][2].getText() == arrayButtons[2][2].getText() && arrayButtons[2][2].getText() != ""	){
			   System.out.println("Game over");
		   }
	}
	private static JFrame newWindow(String name,int x,int y,int w,int h){
		JFrame window = new JFrame(name);
		window.setBounds(x,y,w,h);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return window;
	}
	private static JButton newButton(String name,int x,int y, int w,int h){
		JButton button = new JButton(name);
		button.setBounds(x,y,w,h);
		return button;
	}
	public static void btlistener(JFrame window,JButton target,JButton[][] buttonArray){
		ActionListener listener = new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent ae){
			var button = ae.getSource();
			
			for(int i = 0;i<3;i++){
				for(int a = 0;a<3;a++){
					if(buttonArray[i][a] == button){
							System.out.println(buttonArray[i][a]);
							if(turn == 1 && buttonArray[i][a].getText() == ""){
								buttonArray[i][a].setText("x");
								turn = 2;
							}else if(turn == 2 && buttonArray[i][a].getText() == ""){
								buttonArray[i][a].setText("o");	
								turn = 1;
							}
							checkWinner(buttonArray);
						
					}
				}
			}
			System.out.println("");
		}
	};
		target.addActionListener(listener);
	}
}