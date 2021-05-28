package co.yedam.app.baseball;

/*
 * 임의의 수 3개
 * 사용자 수 입력
 * 스트라이크, 볼 ,카운터
 */
public class BaseBallApp {

	int s; //스트라이크
	int b; //볼
	int c1,c2,c3; // 컴퓨터
	int u1,u2,u3; // 유저
	void makeRnd() {
		//c1 =___; 난수 발생 만들기
	}
	void input() {
		//u1
	}
	void count() {
		// s ,b 카운터 
	}
	void start() {
		makeRnd();
		while(s<3) { //스트라이크가 3이 될때까지 나감
			s = b = 0;
			input();
			count();
		}
}
}
