package co.yedam.numgame;

import java.util.Random;
/*
 * #####
 */
import java.util.Scanner;

public class NumberGameApp {
	// 필드
	// 컴 임의의수 생성
	int com; // 컴퓨터 만든수
	int user; // 사용자가 입력한 값

	void init() {
		// 난수(1~10)
		Random random = new Random();
		com = random.nextInt(10) + 1;
		System.out.println("개발자 확인용:" + com);
	}

	// 사용자 수를 입력하면
	void input() {
		// scanner 를 이용해서 정수값 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10까지의 수를 입력하시오:");
		user = sc.nextInt();

		while (user >= 11 || user <= 0) {
			System.out.println("error 1~10까지 수를 입력하시오:");
			user = sc.nextInt();
		}
	}

	// 높다 낮다(판단) // 정답이면 -> true
	boolean confirm() {
		if (com < user) {
			System.out.println("깔깔 더 작은 숫자임 ㅋ");
		} 
		else if (com > user) {
			System.out.println("깔깔 더 큰 숫자임 ㅋ");
		}
	
		if (com == user) {
			System.out.println("정답을 맞췄습니다.게임을 종요합니다.");
			return true;
		} 
		else {
			System.out.println("틀렸습니다 다시 숫자를 입력하세요");
			return false;
		}
	}	

	

	// com과 user를 비교해서 같으면 true라고 넘겨주고
	// 다르면 높다 or 낮다 라고 출력하고 false 리턴해준다.

	void start() {
		init();
		while (true) {
			input(); // 사용자 값 입력
			if (confirm()) { // 맞을때 까지
				break; // 빠져 나온다
			}
		}
	}

}
