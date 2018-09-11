package com.demo.bean;

public class User {
	private int id;//����
	private String userName;//�û���
	private String password;//����
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	   * ���캯��
	  * <p>Title: </p>
	  * <p>Description: </p>
	  * @param id
	  * @param userName
	  * bean�㣺����ģ�͡�
	   */
	  public User(int id, String userName) {
	      super();
	      this.id = id;
	      this.userName = userName;
	      
	  }
	  public User(){
		  
	  }
	  
	  public User(int id, String userName, String password, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public User(String userName,int age){
		  this.userName=userName;
		  this.age = age;
	  }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
