package com.github.sophatvathana.exceller.test;

import com.github.sophatvathana.exceller.MapObject;
import com.github.sophatvathana.exceller.MapField;
import com.github.sophatvathana.exceller.Type;

import java.util.Date;

@MapObject(type = Type.COLUMN, start = 4, end = 4)
public class DateHeader {
	@MapField(position = 2)
	private Date fromDate;
	
	@MapField(position = 3)
	private Date toDate;
	
	public Date getFromDate() {
		return fromDate;
	}
	
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
	public Date getToDate() {
		return toDate;
	}
	
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	@Override
	public String toString() {
		return "DateHeader{" +
				"fromDate=" + fromDate +
				", toDate=" + toDate +
				'}';
	}
}
