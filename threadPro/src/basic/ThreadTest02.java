package basic;
class AlphaThread1 extends Thread{
	public AlphaThread1(String name) {
		super(name);
	}
	public void run() {
		//1부터 20까지 출력하는 코드
		for (char c = 'A'; c <='Z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(500);//실행흐름을 멈춘다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class DigitThread1 extends Thread{
	public DigitThread1(String name) {
		super(name);
	}
	public void run() {
		//1부터 100까지 출력하는 코드
		for (int i = 1; i <=100; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);//실행흐름을 멈춘다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}
public class ThreadTest02 {
	public static void main(String[] args) {
		System.out.println("main시작");
		AlphaThread1 t1 = new AlphaThread1("alpha");
		DigitThread1 t2 = new DigitThread1("digit");
		t1.start();
		t2.start();
		System.out.println("main종료");
	}
}










