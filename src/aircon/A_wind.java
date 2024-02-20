package aircon;

import java.util.Scanner;

//풍력선택 1-10 
public class A_wind {
	public void windPower( ) {
		Scanner sc = new Scanner(System.in);
		A_aircon_DTO dt = new A_aircon_DTO();
		int n1, n2;

		System.out.println("풍력 조절을 시작합니다.");
		for(;;) {
			System.out.println("1-10까지 원하는 세기를 입력해주세요");
			n1 = sc.nextInt();
			dt.setWin1(n1);

			System.out.println("풍력이 "+n1+"로 설정되었습니다.");
			System.out.println("풍력 조절을 계속하시겠습니까?\n1.예  2.아니오");
			n2 = sc.nextInt();
			dt.setWin2(n2);
			
			if(n2==2) {
				System.out.println("풍력 조절을 마칩니다");
				break;
			}else if(n2==1) {
				continue;
			}else {
				System.out.println("잘못된 번호입니다. 메인화면으로 이동합니다");
				break;
			}
		}


	}

}
