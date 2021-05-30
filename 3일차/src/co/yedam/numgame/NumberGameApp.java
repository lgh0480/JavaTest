package co.yedam.numgame;
/*
 * #####
 */
public class NumberGameApp {
											//필드
	//컴 임의의수 생성
	int com;     //컴퓨터 만든수
	int	user;    //사용자가 입력한 값
	void init() {
		// 난수(1~10)
	}
	//사용자 수를 입력하면
	void input() {
		//scanner 를 이용해서 정수값 입력
	}
	
	//높다 낮다 (판단) //정답이면 => true
	boolean confirm() {
		//com과 user를 비교해서 같으면 true 라고 넘겨주고
		//다르면 높다 or 낮다 라고 출력하고 fasle 리턴 해줍니다.
		
	}
	void start() { 
		init(); 
		while(true) {
			input(); // 사용자 값 입력
			if(confirm()) {  //맞을때 까지 
				break; // 빠져나온다.
			}
		}
	}
	


}
