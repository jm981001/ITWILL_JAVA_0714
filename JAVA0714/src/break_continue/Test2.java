package break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
//
		//
		//
		//
		
		Random r = new Random();
		int target = r.nextInt(9) + 1;
		int count = 0;
		int levelNum =0;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("UP & DOWN GAME!!");
		System.out.println("난이도를 선택해주세요");
		int mode = sc.nextInt();
		WHILE:
		while(true) {
		switch (mode){
			case 1:
				levelNum = 8;
				break WHILE;
			case 2:
				levelNum = 12;
				break WHILE;
			case 3:
				levelNum = 20;
				break WHILE;
			default:
				System.out.println("입력오류: 상(2)/중(1)/하(0) 중 입력!");
				System.out.print("난이도를 선택해주세요");
				
		}
		}
		System.out.println("난이도가 " +mode+" 로 설정되었습니다 기회는 " + levelNum+" 입니다");
		
	
		 
		System.out.print("1~1000 숫자를 입력하시오 -> ");
		for(int i = 0; i <levelNum; i++ ) {
			int n = sc.nextInt();
			count++;
			if(target>n) {
				System.out.println("UP");
				System.out.println();
				
			}else if(target<n) {
				System.out.println("DOWN");
				System.out.println();
			}else {
				System.out.println("정답 : " + target + " 시도한 횟수: " + count);
				break;
			}
			
		}
		
		System.out.println(count);
		System.out.println("시도횟수: " + count +" ->실패");
		
	

	}

}
