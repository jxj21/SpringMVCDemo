package com.demo.bean;

public class User {
	private int id;//主键
	private String userName;//用户名
	private String password;//密码
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	   * 构造函数
	  * <p>Title: </p>
	  * <p>Description: </p>
	  * @param id
	  * @param userName
	  * bean层：数据模型。
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
