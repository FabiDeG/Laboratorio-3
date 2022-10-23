package model;

import java.io.Serializable;

public class NUser extends User implements Serializable{

	public NUser(String UserName, String PassWord) {
		super(UserName, PassWord);
		setTipo(1);
	}

	@Override
	public String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
