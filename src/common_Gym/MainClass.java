package common_Gym;

import java.util.Scanner;




public class MainClass  {	
	
	

	 
	public static void main(String[] args) {
		
		
			ControlPanelImpl dao = ControlPanelImpl.getInstance();
			
			Scanner scan=new Scanner(System.in);
			
			outerLoop:
			while (true) {
			
			System.out.println("조절(1:풍량,2:온도 , 0:종료):");
			int choice1=scan.nextInt();
			
				switch(choice1) {
				
				case 1:
					dao.ControlWind();
					break;
				case 2:
					
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


