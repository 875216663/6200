package model;

import java.util.ArrayList;

// The class for users
public abstract class User {
	// These fields are included:
	// userId
	// userName
	// password
	// userType
	// loginStatus
	// userorderIds[] (could be multiple)
	// userBalance
	/******************************user id, setter and getter******************************/
	private int userId;
	
	public void setUserId(int userId) {
		this.userId=userId;
	}
	
	public int getUserId() {
		return userId;
	}
	/******************************user name, setter and getter******************************/
	private String userName;
	
	// set user name
	public void setUsername(String userName) {
		this.userName = userName;
	}
	// get user name
	public String getUsername() {
		return userName;
	}
	
	/******************************user password, setter and getter******************************/
	// user password
	private String password;

	// get password
	public String getPassword() {
		return password;
	}
	// set password
	public void setPassword(String password) {
		this.password = password;
	}
	/******************************user Type, setter and getter******************************/
	private int userType;  
	/* userType = 0: owner, manager and cook, Mr. Ping
	 * userType = 1: waiters: Po or the Furious Five, who do not cook, but are fast to serve, good as waiters
	 * userType = 2: regular customers: The bunnies, Tailung, Lord Shen and Kai 
	 * userType = 3: VIP customers: Master Oogway, Master Shifu
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getUserType() {
		return this.userType;
	}
	
	/******************************user userOrderIds[], adder and remover******************************/
	private ArrayList<String> userOrderIds; 
	public ArrayList<String> addOrder(String oderId) {
		ArrayList<String> result = this.userOrderIds;
		result.add(oderId);
		return result;
	}
	public ArrayList<String> removeOrder(String oderId) {
		ArrayList<String> result = this.userOrderIds;
		result.remove(oderId);
		return result;
	}
	/******************************user loginStatus, setter and getter******************************/
	private boolean loginStatus;
	public abstract boolean login(); 
	/* override note: 
	 * login() should update : 
	 * 		loginStatus
	 * 		userName
	 * 		userID
	 * 		userType
	 * 		userOrderIds[] (could be multiple)
	 *		userBalance
	 * login() should check :
	 * 		userPassWord
	 * login() should activate :
	 * 		userPage
	 * 		 
	 * login() should return :
	 * 		loginStatus
	 */
	public boolean logout() {
		this.loginStatus=false;
		return this.loginStatus;
	}
}


