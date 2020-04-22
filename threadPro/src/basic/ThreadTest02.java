package basic;
class AlphaThread1 extends Thread{
	public AlphaThread1(String name) {
		super(name);
	}
	public void run() {
		//1���� 20���� ����ϴ� �ڵ�
		for (char c = 'A'; c <='Z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(500);//�����帧�� �����.
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
		//1���� 100���� ����ϴ� �ڵ�
		for (int i = 1; i <=100; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);//�����帧�� �����.
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
		System.out.println("main����");
		AlphaThread1 t1 = new AlphaThread1("alpha");
		DigitThread1 t2 = new DigitThread1("digit");
		t1.start();
		t2.start();
		System.out.println("main����");
	}
}










