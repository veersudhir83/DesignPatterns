package io.sudheer.designpatterns.creational.prototype;

import java.util.List;

public class PrototypeExample implements Cloneable {
	
	private String sql;

	private List<String> parameters;

	private Record record;

	public PrototypeExample (String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}
	
	public PrototypeExample clone() {
		try {
			return (PrototypeExample) super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<String> getParameters() {
		return parameters;
	}
	
	public Record getRecord() {
		return record;
	}

	public String getSql() {
		return sql;
	}

}
