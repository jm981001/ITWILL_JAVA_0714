package break_continue;

public class Ex2 {

	public static void main(String[] args) {

		for(int dan = 2; dan <10; dan++) {
			System.out.println("< " + dan +"단" + " >");
			
			for(int i=1; i<10; i++) {
				if(dan==6) {
//					break;  //안쪽 for문만 종료 
					continue; //아래쪽 실행문을 건너뜀
				}
				
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			System.out.println();
		}
		
		OUTER:  //레이블 1
		for(int dan = 2; dan <10; dan++) {
			System.out.println("< " + dan +"단" + " >");
			INNER: //레이블 2
			for(int i=1; i<10; i++) {
				if(dan==6) {
//					break;  //안쪽 for문만 종료 
//					continue; //아래쪽 실행문을 건너뜀
					
//					break INNER;
//					continue INNER;
					
//					break OUTER; //바깥쪽 for문 종료하고 "프로그램 종료"
					continue OUTER;//바깥쪽 for문 의 증감식 (dan++)으로 이동
					//dan이 6일때, i가 1일 경우 continue문을 만나 안쪽 for문을 포함하여 바깥쪽 for문의 continue문 보다 
					//아래쪽 문장을 생략 후 다음 바깥 for문 반복을 위해 증감식 (dan++)으로 이동
				}
				
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
