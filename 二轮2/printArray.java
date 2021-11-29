package ����2;

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
					System.out.println(c); // t1���ȴ�ӡ
					LockSupport.unpark(t2); // ����t2
					LockSupport.park(); // t1����
				}
			}
		};
		t2 = new Thread() {
			@Override
			public void run() {
				for (int c : a2) {
					LockSupport.park();
					// Ҫ�ȴ�ӡ���֣� ������ֱ������ ����t1������������������ �ȴ�ӡ���ֺ��ٻ�����
					System.out.println(c); // �����Ѻ��ӡ����
					// ����t1
					LockSupport.unpark(t1);
					
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
