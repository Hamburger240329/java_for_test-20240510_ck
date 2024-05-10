
public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++) { // i=0 1 2 3 4 -> 5번 반복 for문 
			for(int j=0;j<2;j++) { // j=0 1 -> 2번 반복 for문
				System.out.println("안녕!");
			}
		}
	// 구구단 2~9단을 출력하는 이중 for 문을 작성하시오.
	// ex) 5 * 1= 5
	// ex) 5 * 2 = 10
	// ex) 5 * 3 = 15
	// ex) 5 * 4 = 20
	// .....
	// ex) 5 * 9 = 45
		
		for(int i=2;i<10;i++) {
			System.out.println("---"+i+"단---");
			for(int j=1;j<10;j++) {
				System.out.println(i +"x"+ j +"="+ (i*j));
			}
			System.out.println("---------");
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		}
		
	}

