package com.github.sophatvathana.exceller.test;

import com.github.sophatvathana.exceller.MapField;
import com.github.sophatvathana.exceller.MapObject;
import com.github.sophatvathana.exceller.MappedObject;
import com.github.sophatvathana.exceller.Type;

import java.util.List;

@MapObject(type = Type.COLUMN, start = 2, end = 2)
public class Header {
	
	@MapField(position = 2)
	private String month;
	
	@MapField(position = 3)
	private String year;
	
	@MappedObject
	private DateHeader dateHeader;
	
	@MappedObject
	private List<MeterUsageExcel> meterUsageExcels;
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public DateHeader getDateHeader() {
		return dateHeader;
	}
	
	public void setDateHeader(DateHeader dateHeader) {
		this.dateHeader = dateHeader;
	}
	
	public List<MeterUsageExcel> getMeterUsageExcels() {
		return meterUsageExcels;
	}
	
	public void setMeterUsageExcels(List<MeterUsageExcel> meterUsageExcels) {
		this.meterUsageExcels = meterUsageExcels;
	}
	
	@Override
	public String toString() {
		return "Header{" +
				"month='" + month + '\'' +
				", year='" + year + '\'' +
				", dateHeader=" + dateHeader +
				", meterUsageExcels=" + meterUsageExcels +
				'}';
	}
}