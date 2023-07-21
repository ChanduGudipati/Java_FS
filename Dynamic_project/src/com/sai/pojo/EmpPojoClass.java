package com.sai.pojo;

public class EmpPojoClass {
	public int sno;
	public String userName;
	public String email;
	public long mobile;
	public String address;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmpPojoClass [sno=" + sno + ", userName=" + userName + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

}
