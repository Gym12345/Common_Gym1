package jun_package;
import java.util.Scanner;

public class temperControl {


	
		Scanner input=new Scanner(System.in);
		
		
		public void temperControl(){
			
			
			System.out.println("어떤 온도에 맞춰드릴까요??");
		
			int select=input.nextInt();
			
			int temper=20;
			
			
			
			while(true) {
				System.out.println("현재 온도는 :"+temper+"도입니다.");
				System.out.println("온도를 올리시려면 1번을 내리시려면 2번을 눌러주세요.");
				int selectTem=input.nextInt();
				if(select==1) {
					temper+=1;
				}else if(select==2) {
					temper-=1;
				}else {
					System.out.println("잘못입력하였습니다.");
				}
			}
			
		}
	}

