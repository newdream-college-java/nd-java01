package entity;
//用户实体
public class User {
	private int userId;
	private String userName;
	private String userPassword;
	private int userSex;
	private String userBirthday;
	private String userIdCard;
	private String userEmail;
	private int userPhone;
	private String userAddress;
	private String userAccount;
	
	public User() {

	}
	public User(int userId, String userName, String userPassword, int userSex,
			String userBirthday, String userIdCard, String userEmail, 
			int userPhone, String userAddress , String userAccount) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userBirthday = userBirthday;
		this.userIdCard = userIdCard;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userAccount=userAccount;
	}
	
	public String toString() {
		return "User [userAddress=" + userAddress + ", userBirthday="
				+ userBirthday + ", userEmail=" + userEmail + ", userId="
				+ userId + ", userIdCard=" + userIdCard + ", userName="
				+ userName + ", userPassword=" + userPassword + ", userPhone="
				+ userPhone + ", userSex=" + userSex + ", userAccount" + userAccount+"]\n";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	public String getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserIdCard() {
		return userIdCard;
	}
	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	
}
