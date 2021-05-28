package co.yedam.stern;

public class BreakTest {

	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random() * 6+1); //1부터 6까지 난수를 구하는 주사위번호/ 곱하고 나서 인트로 변환
			System.out.println(num);
			if (num == 6) {
				break;
			}
			
		}
	}

}
