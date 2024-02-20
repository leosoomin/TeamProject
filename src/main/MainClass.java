package main;

import java.util.Scanner;

import Tv_remotecomtroller.TvService;
import aircon.A_start;
import tvRemoteController.B_start;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		A_start ac = new A_start();
		B_start tv = new B_start();
		TvService Tv = new TvService();
		System.out.println("조작할 기능을 선택해 주세요");
		for(;;) {
			System.out.println("1.에어컨 2. 3.TV리모콘");
			int key = sc.nextInt();

			switch (key) {
			case 1:ac.remocon();break;
			case 2:tv.remocon();break;
			case 3:Tv.display();break;
			default:System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			continue;
			}
			break;
		}
		System.out.println("설정이 완료되어 종료합니다");
		System.out.println("다시 설정하시려면 재실행해주세요");
	}

}