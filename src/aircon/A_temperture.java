package aircon;

import java.util.Scanner;

public class A_temperture {
	public void tempertureContral() {
		Scanner sc = new Scanner(System.in);
		A_aircon_DTO dt = new A_aircon_DTO();
		int ch1, ch2, ch3;

		System.out.println("온도 설정을 시작합니다");
		System.out.println("어떤 방법으로 온도를 설정하시겠습니까?");
		for(;;) {
			System.out.println("1.숫자 직접 입력\n2.한단계씩 올리고 내리기\n3.자동 모드\n4.나가기");
			ch1 = sc.nextInt();
			dt.setTem1(ch1);

			if(ch1==1) {
				for(;;) {
					System.out.println("숫자를 입력해주세요");
					ch2 = sc.nextInt();
					if(ch2 > 40) {
						System.out.println("최고 온도는 40도 입니다. 다시 입력해주세요");
						continue;
					}else if(ch2 < 18) {
						System.out.println("최저 온도는 18도 입니다. 다시 입력해주세요");
						continue;
					}else {
						dt.setTem2(ch2);
						System.out.println("온도를 "+dt.getTem2()+"로 설정합니다");break;
					}
				}
			}else if(ch1==2) {
				for(int i=25;;) {
					System.out.println("온도를 한단계 올리시려면 2번, 한단계 내리시려면 1번을 입력해주세요\n설정 종료는 0번을 입력해주세요");
					ch3 = sc.nextInt();
					dt.setTem3(ch3);
					if(ch3==0) {
						break;
					}else if(ch3==2) {
						i++;
						if(i>40) {
							i--;
							System.out.println("현재 최고 온도입니다");
						}else {
							System.out.println("현재 온도는 "+i+"입니다");
						}
					}else if(dt.getTem3()==1) {
						i--;
						if(i<18) {
							i++;
							System.out.println("현재 최저 온도입니다");
						}else {
							System.out.println("현재 온도는 "+i+"입니다");
						}
					}else {
						System.out.println("잘못된 번호입니다. 다시 입력해주세요");
						continue;
					}
				}break;
			}else if(ch1==3) {
				System.out.println("자동 모드로 온도를 설정합니다");
				System.out.println("현재 설정 온도는 25도 입니다");
				break;
			}else if(ch1==4) {
				break;
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
				continue;
			}
			break;
		}
	}
}
