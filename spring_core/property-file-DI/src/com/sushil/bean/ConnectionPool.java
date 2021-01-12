package com.sushil.bean;

public class ConnectionPool {
	private String driver, url, username, password;

	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "ConnectionPool [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}
	
}
