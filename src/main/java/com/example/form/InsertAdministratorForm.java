package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前が入力されていません")
	@Size(min = 1, max = 40, message = "名前が長すぎます。40文字以内で登録してください")
	private String name;
	@NotBlank(message = "メールアドレスが入力されていません")
	@Email(message = "メールアドレスが不正です")
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	@NotBlank(message = "パスワードが入力されていません")
	@Size(min = 1, max = 20, message = "パスワードは1文字〜20文字以内にしてください")
	private String password;

	@Size(min = 1, max = 20, message = "パスワードは1文字〜20文字です")
	private String checkPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getCheckPassword() {
		return checkPassword;
	}

	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", checkPassword=" + checkPassword + "]";
	}

}
