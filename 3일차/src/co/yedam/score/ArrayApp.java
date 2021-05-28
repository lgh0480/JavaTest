package co.yedam.score;
//클래스 선언
public class ArrayApp {

	int[] arr = new int[10]; // 배열값을 담을수 있게 공간을 확보한것임
	// int[] arr2 = {1,2,3};

	void init() {
		// 배열에 초기값 지정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			// +1을 하면 0~9까지가 아닌 1~10까지로 설정된다.
		}
	}

	void print() {
		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void total() {
		// 합계
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println("합계: " + result);
	}

	void max() {
		// 최댓값
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값:" + max);
	}

	void min() {
		//최소값
		int min = arr[0];
		for (int i =0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값:" + min);
	}
	public static void main(String[] args) {
		ArrayApp app = new ArrayApp();
			app.init();
			app.total();
			app.max();
			app.min();
			app.print();
			
	}
}
