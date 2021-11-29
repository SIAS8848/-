package 二轮2;

import java.io.*;

public class CheckEmail {
	public static boolean checkEmail(String email) {// 验证邮箱的正则表达式
		String format = "^(\\w+((-\\w+)|(.\\w+)))+\\w+((-\\w+)|(.\\w+))@[A-Za-z0-9]+((.|-)[A-Za-z0-9]+)*.[A-Za-z0-9]+$";
		if (email.matches(format)) {
			return true;// 邮箱名合法，返回true
		} else {
			return false;// 邮箱名不合法，返回false
		}
	}

	public static void main(String[] args) throws Exception {
		String email; // 需要进行验证的邮箱
		while (true) {
			email = new BufferedReader(new InputStreamReader(System.in)).readLine();
			if (CheckEmail.checkEmail(email))// 验证邮箱
			{
				System.out.println(email + "\n是合法的邮箱名。");
			} else {
				System.out.println(email + "\n不是合法的邮箱名。");
			}
		}
	}
}