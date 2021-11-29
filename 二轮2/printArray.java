package 二轮2;

import java.util.concurrent.locks.LockSupport;

class printArray {
	static Thread t1;
	static Thread t2;

	public static void main(String[] args) throws InterruptedException {
		int[] a1 = { 1, 3, 5, 7, 9 };
		int[] a2 = { 2, 4, 6, 8, 10 };
		t1 = new Thread() {
			@Override
			public void run() {
				for (int c : a1) {
					System.out.println(c); // t1进先打印
					LockSupport.unpark(t2); // 唤醒t2
					LockSupport.park(); // t1阻塞
				}
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				for (int c : a2) {
					LockSupport.park();
					// 要先打印数字， 所以这直接阻塞 唤醒t1后来到这里又阻塞， 等打印数字后再唤醒它
					System.out.println(c); // 被唤醒后打印数字
					// 唤醒t1
					LockSupport.unpark(t1);
					
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
