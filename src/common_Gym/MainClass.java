package common_Gym;

import java.util.Scanner;

import ControlWind.ControlWind;
import jun_package.temperControl;




public class MainClass  {	
	
	

	 
	public static void main(String[] args) {
		
		
			ControlPanelImpl dao = ControlPanelImpl.getInstance();
			
			Scanner scan=new Scanner(System.in);
			ControlWind cw=new ControlWind();
			temperControl tc=new temperControl();
			outerLoop:
			while (true) {
			
			System.out.println("조절(1:풍량,2:온도 , 0:종료):");
			int choice1=scan.nextInt();
			
				switch(choice1) {
				
				case 1:
					cw.sibal();
					break;
				case 2:
					tc.temper();
					break;
					
				case 0:
					System.out.println("종료");
					
					break outerLoop;
					
				default:
					System.out.println("잘못된 입력입니다.");
					break;
				
					}			
			}
			scan.close();
		}
	}


