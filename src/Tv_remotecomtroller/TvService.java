package Tv_remotecomtroller;

import java.util.Scanner;

public class TvService {
private TvDTO t;
Scanner sc = new Scanner(System.in);
int vol,num,ch;

public void display(){
	Tv_Channel ch = new Tv_Channel();
	Tv_volume vo = new Tv_volume();
	while(true) {
		System.out.println("원하는 기능을 고르시오");
		System.out.println("1. 음량 조절 ");
		System.out.println("2. 채널 조정 ");
		System.out.println("3. 종료");
		System.out.println(">> : ");
		num = sc.nextInt();
		if(num<1 || num>3) {
			System.out.println("1~3번 입력");
		}
		else if(num==1) {
			vo.getSound();
		}
		else if(num==2) {
			ch.getChannel();
		}
		else if(num==3) {
			break;
		}
	}
	
	
	
}





}
