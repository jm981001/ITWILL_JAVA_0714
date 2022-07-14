package break_continue;

public class Ex1 {

	public static void main(String[] args) {

		//
		//
		//
		int i = 1;
		
		for(;;) {//for문의 무한 반복
			System.out.println(i);
			
			if(i == 5) {
				break;
			}
			
			i++; //빠져나갈때는 i는 증가하지 않음
			
		}
		
		System.out.println("======================");
		int j = 1;
		while(true) {
			System.out.println(j);
			
			if(j == 5) {
				break;
			}
			
			j++; //빠져나갈때는 i는 증가하지 않음
		}
		
		System.out.println("======================");
		
		for( i =0; i<11; i++) {
			if(i % 2 == 1) { //홀수일경우
				continue;//출력안하고 건너뛰기
			}
			System.out.println(i);
		}
		
		System.out.println("======================");

		i = 0;
		
		while(i <= 10) {
			i++; //여기 작성되어야함
			if(i % 2 == 1) { //홀수일경우
				continue;//출력안하고 건너뛰기
			}
			System.out.println(i);
			//여기 i++을 하면 continue만나면 증가 안하니까 여기가 아니라
			
		}
		
		
		
	}

}
