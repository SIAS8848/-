package ����2;

import java.io.*;

public class CheckEmail {
	public static boolean checkEmail(String email) {// ��֤�����������ʽ
		String format = "^(\\w+((-\\w+)|(.\\w+)))+\\w+((-\\w+)|(.\\w+))@[A-Za-z0-9]+((.|-)[A-Za-z0-9]+)*.[A-Za-z0-9]+$";
		if (email.matches(format)) {
			return true;// �������Ϸ�������true
		} else {
			return false;// ���������Ϸ�������false
		}
	}

	public static void main(String[] args) throws Exception {
		String email; // ��Ҫ������֤������
		while (true) {
			email = new BufferedReader(new InputStreamReader(System.in)).readLine();
			if (CheckEmail.checkEmail(email))// ��֤����
			{
				System.out.println(email + "\n�ǺϷ�����������");
			} else {
				System.out.println(email + "\n���ǺϷ�����������");
			}
		}
	}
}