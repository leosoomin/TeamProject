package aircon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_start {
	public static void remocon() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ac = new ArrayList<String>
		(Arrays.asList("1.온도 설정", "2.풍력 설정", "3.모드 설정"));

		A_temperture tem = new A_temperture();
		A_wind win = new A_wind();
		A_option opt = new A_option();

		
		int ch1=0;
		System.out.println("에어컨 기능을 실행합니다");

		while(true) {
			System.out.println("설정하실 기능의 번호를 입력해주세요");
			System.out.println(ac.get(0)+"\n"+ac.get(1)+"\n"+ac.get(2));
			ch1 = sc.nextInt();

			switch(ch1) {
			case 1 : tem.tempertureContral();break;
			case 2 : win.windPower();break;
			case 3 : opt.option();break;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요"); continue;
			}
			break;
		}
	}

}

