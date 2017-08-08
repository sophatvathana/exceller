package com.nanita.exceller.test;

import com.nanita.exceller.MapField;
import com.nanita.exceller.MapObject;
import com.nanita.exceller.Type;

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
