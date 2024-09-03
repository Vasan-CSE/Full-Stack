package com.tnsif.day5;
import java.util.Date;
public class LevelOneEmployee extends Employee2 {
	private int id;
    private String Authority;
    
    public LevelOneEmployee(String name, long conatctNo, Date dateOfBirth,float salary, String dept,int id, String Authority) {
    	super(name,conatctNo,dateOfBirth,salary,dept);
    	this.id=id;
    	this.Authority=Authority;
    	
    }
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the authority
	 */
	public String getAuthority() {
		return Authority;
	}
	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(String authority) {
		Authority = authority;
	}
	@Override
	public String toString() {
		return "LevelOneEmployee [id=" + id + ", Authority=" + Authority + ", getDept()=" + getDept() + ", getSalary()="
				+ getSalary() + ", toString()=" + super.toString() + ", getName()=" + getName() + ", getConatctNo()="
				+ getConatctNo() + ", getDateOfBirth()=" + getDateOfBirth() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
