package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "auth")
public class AuthEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	int role;
	String handler;
	String email;
	String passeord;
	
	/**
	 * デフォルトコンストラクタ
	 */
	public AuthEntity() {}

	/**
	 * コンストラクタ
	 * @param role     権限コード
	 * @param handler  ハンドルネーム
	 * @param email    電子メールアドレス
	 * @param passeord パスワード
	 */
	public AuthEntity(int role, String handler, String email, String passeord) {
		this.role = role;
		this.handler = handler;
		this.email = email;
		this.passeord = passeord;
	}

	/**
	 * コンストラクタ
	 * @param id       認証ID
	 * @param role     権限コード
	 * @param handler  ハンドルネーム
	 * @param email    電子メールアドレス
	 * @param passeord パスワード
	 */
	public AuthEntity(int id, int role, String handler, String email, String passeord) {
		this(role, handler, email, passeord);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasseord() {
		return passeord;
	}

	public void setPasseord(String passeord) {
		this.passeord = passeord;
	}
	
}
