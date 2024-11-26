package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * ログイン時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class LoginForm {
	@NotBlank(message = "メールアドレスが入力されていません")
	@Email(message = "メールアドレスが不正です")
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	@NotBlank(message = "パスワードが入力されていません")
	@Size(min = 1, max = 20, message = "パスワードは1文字〜20文字です")
	private String password;

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + "]";
	}

}
