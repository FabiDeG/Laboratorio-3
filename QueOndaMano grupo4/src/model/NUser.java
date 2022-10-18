package model;

public class NUser extends User {

	public NUser(String UserName, String PassWord) {
		super(UserName, PassWord);
		setTipo(1);
	}
}
