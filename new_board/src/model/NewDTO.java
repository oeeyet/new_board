package model;

import java.sql.Date;

public class NewDTO {

	int bdID;
	int abc;
	String bdTitle;
	Date bdCdate;
	Date bdEdate;
	int bdViews;
	
	
	
	public int getAbc() {
		return abc;
	}
	public NewDTO setAbc(int abc) {
		this.abc = abc;
		return this;
	}
	public int getBdID() {
		return bdID;
	}
	public NewDTO setBdID(int bdID) {
		this.bdID = bdID;
		return this;
	}
	public String getBdTitle() {
		return bdTitle;
	}
	public NewDTO setBdTitle(String bdTitle) {
		this.bdTitle = bdTitle;
		return this;
	}
	public Date getBdCdate() {
		return bdCdate;
	}
	public NewDTO setBdCdate(Date bdCdate) {
		this.bdCdate = bdCdate;
		return this;
	}
	public Date getBdEdate() {
		return bdEdate;
	}
	public NewDTO setBdEdate(Date bdEdate) {
		this.bdEdate = bdEdate;
		return this;
	}
	public int getBdViews() {
		return bdViews;
	}
	public NewDTO setBdViews(int bdViews) {
		this.bdViews = bdViews;
		return this;
	}
	
	
}
