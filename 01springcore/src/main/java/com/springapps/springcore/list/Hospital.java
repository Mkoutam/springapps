package com.springapps.springcore.list;

import java.util.List;

public class Hospital {

	private String name;
	private List<String> departments;

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", departments=" + departments + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
