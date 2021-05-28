package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적처리 프로그램
 * 국어,영어,수학 입력
 * 총점, 평균,등급 계산
 */
public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade; // 한글자만 가능
	Scanner scanner = new Scanner(System.in);

	// 성적입력

	void input() { // void는 반환값이 없다.
		System.out.print("국어 성적을 입력하시오.:");
		kor = scanner.nextInt();
		System.out.print("영어 성적을 입력하시오.:");
		eng = scanner.nextInt();
		System.out.print("수학 성적을 입력하시오.:");
		mat = scanner.nextInt();

		return; // 만약에 return 5; 면 반환값은 int가 되어야된다.
	}

	// 합계 계산
	int getSum() {
		
		sum = kor + eng + mat;
		return sum;

	}

	// 평균 계산
	double getAvg() {
	
		avg = (kor + eng + mat) / 3;

		return avg;
	}

	char getgrade() {

		switch ((int) avg / 10) { // 10으로 나눴을때 87.5, 89 ->8 //80 상 60 중 40하
		case 10:
		case 9:
		case 8:
			grade = '상';
			break; // '상'에서 빠져나감
		case 7:
		case 6:
			grade = '중';
			break; // '중'에서 빠져나감
		default:
			grade = '중';
			break;
			
		}
		return grade;
	}		
	boolean isPass() {
			//평균이 60점 이상이면 true(패스)
			//아니면 false;(과락)
		if ((kor +eng +mat)/ 3 >60) {
			return true;
		} else {
			return false;
		}
		
	}

}