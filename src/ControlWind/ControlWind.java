package ControlWind;

import java.util.Scanner;

public class ControlWind {

	 Scanner sc = new Scanner(System.in);
		public void sibal() {
			
			Scanner scan=new Scanner(System.in);
			
		
			while (true) {
			System.out.println("풍량 조절 바람의 정도는 어떻게 해드릴까요?");
			int choice1=scan.nextInt();
			if(choice1==4) break; 
				switch(choice1) {
				
				case 1:
					System.out.println("1.강풍");
					break;
				case 2:
					System.out.println("2.중풍");
					break;
					
				case 3:
					System.out.println("3.약풍");
					
					break ;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
				
					
					}			
			}
}
}
