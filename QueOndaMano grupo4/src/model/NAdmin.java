package model;

import java.io.Serializable;

public class NAdmin extends User implements Serializable{

	public NAdmin(String UserName, String PassWord) {
		super(UserName, PassWord);
		setTipo(0);
	}

}
