package model;

import java.io.Serializable;

public class NUser extends User implements Serializable{

	public NUser(String UserName, String PassWord) {
		super(UserName, PassWord);
		setTipo(1);
	}
}
