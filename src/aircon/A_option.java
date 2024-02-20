package aircon;

import java.util.Scanner;

public class A_option {
	public void option() {
		Scanner sc = new Scanner(System.in);
		A_aircon_DTO dt = new A_aircon_DTO();
		int n1;

		System.out.println("모드 설정을 시작합니다.");
		for(;;) {
			System.out.println("1.파워냉방  2.제습모드  3.송풍모드");
			n1 = sc.nextInt();
			dt.setOpt1(n1);

			if(n1==3) {
				System.out.println("송풍 모드로 전환합니다");
				break;
			}else if(n1==2) {
				System.out.println("제습 모드로 전환합니다");
				break;
			}else if(n1==1) {
				System.out.println("파워냉방 모드로 전환합니다");
				break;
			}else {
				System.out.println("잘못된 번호입니다. 메인화면으로 이동합니다");
				break;
			}
		}
	}
}