package Tv_remotecomtroller;

import java.util.Scanner;

public class Tv_Channel {
Scanner sc = new Scanner(System.in);
private TvDTO t;
TvDTO Tv = new TvDTO();
int num, ch;
public void getChannel() {
	t= new TvDTO();
	while(true) {
	System.out.println("1. 현재 채널");
	System.out.println("2. 원하는 채널로 변경");
	System.out.println("3. 채널 이동");
	num = sc.nextInt();
	if(num<1 || num>3) {
		System.out.println("1~3번 입력");
	}
	else if(num==1) {
		System.out.println("현재 채널 번호 : "+t.getCh());
	}
	else if(num==2) {
		System.out.println("원하는 채널 번호 입력 : ");
		int ch = sc.nextInt();
		System.out.println("변경완료");
		t.setCh(ch);
	}
	else if(num==3) {
		while(true) {
			System.out.println("1. 채널 위로 이동");
			System.out.println("2. 채널 아래로 이동");
			System.out.println("3. 뒤로가기");
			num = sc.nextInt();
			if(num<1 || num>3) {
				System.out.println("1~3번 입력");
			}
			else if(num==1) {
				ch = (t.getCh()+1);
				t.setCh(ch);
			}
			else if(num==2) {
				ch = (t.getCh()-1);
				t.setCh(ch);
			}
			else if(num==3) {
				break;
			}
		}
		}
		
	}
}
}
