package com.tsys.billings.previouspaymenthistory.model;

import java.util.ArrayList;
import java.util.List;

public class Errors {
	
	List<Error> list = new ArrayList<Error>() ;
	
	public List<Error> getList() {
		return list;
	}

	public void setList(List<Error> list) {
		this.list = list;
	}
}

