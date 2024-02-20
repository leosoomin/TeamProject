package Tv_remotecomtroller;

import java.util.Scanner;

public class Tv_volume {
	Scanner sc = new Scanner(System.in);
	private TvDTO t;
	int num, vol;
	public void getSound() {
		t = new TvDTO();
		while(true) {
			
			System.out.println("1. 원하는 볼륨 입력");
			System.out.println("2. 볼륨 조절");
			System.out.println("3. 현재 볼륨 ");
			System.out.println("4. 뒤로가기");
			num = sc.nextInt();
			if(num<1 || num>4) {
				System.out.println("1~4번 입력");
			}
			else if(num ==1) {
				System.out.println("원하는 볼륨 입력 : ");
				num =  sc.nextInt();
				System.out.println("입력 완료");
				t.setVol(num);
				}
			else if(num==2) {
				while(true) {
				System.out.println("1. 볼륨 키우기");
				System.out.println("2. 뷸륨 줄이기");
				System.out.println("3. 뒤로가기");
				int num = sc.nextInt();
				if(num<1 || num>3) {
					System.out.println("1~3번 입력");
				}
				else if(num ==1) {
					vol = (t.getVol()+2);
					System.out.println("볼룸 + 2");
					t.setVol(vol);
					
				}
				else if(num ==2) {
					vol = (t.getVol()-2);
					t.setVol(vol);
					System.out.println("볼륜 - 2");
				}
				else if(num==3) {
					break;
				}
				}
			}
			else if(num==3) {
				System.out.println("현재 볼륨 : "+t.getVol());
			}
			else if(num==4) {
				break;
			}
		}
		
	}

}
