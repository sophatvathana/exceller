package com.github.sophatvathana.exceller.test;

import com.github.sophatvathana.exceller.MapField;
import com.github.sophatvathana.exceller.MapObject;
import com.github.sophatvathana.exceller.Type;

import java.util.Date;

@MapObject(type = Type.ROW, start = 6)
public class MeterUsageExcel {
	
	@MapField(position = 1)
	private Long no;
	
	@MapField(position = 2)
	private Long id;
	
	@MapField(position = 3)
	private String name;
	
	@MapField(position = 4)
	private String transformer;
	
	@MapField(position = 5)
	private String box;
	
	@MapField(position = 6)
	private String meterSerial;
	
	@MapField(position = 7)
	private String oldUsage;
	
	@MapField(position = 8)
	private String newUsage;
	
	@MapField(position = 9)
	private Date recordedDate;
	
	public long getNo() {
		return no;
	}
	
	public void setNo(long no) {
		this.no = no;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTransformer() {
		return transformer;
	}
	
	public void setTransformer(String transformer) {
		this.transformer = transformer;
	}
	
	public String getBox() {
		return box;
	}
	
	public void setBox(String box) {
		this.box = box;
	}
	
	public String getMeterSerial() {
		return meterSerial;
	}
	
	public void setMeterSerial(String meterSerial) {
		this.meterSerial = meterSerial;
	}
	
	public String getOldUsage() {
		return oldUsage;
	}
	
	public void setOldUsage(String oldUsage) {
		this.oldUsage = oldUsage;
	}
	
	public String getNewUsage() {
		return newUsage;
	}
	
	public void setNewUsage(String newUsage) {
		this.newUsage = newUsage;
	}
	
	public Date getRecordedDate() {
		return recordedDate;
	}
	
	public void setRecordedDate(Date recordedDate) {
		this.recordedDate = recordedDate;
	}
	
	@Override
	public String toString() {
		return "MeterUsageExcel{" +
				"no=" + no +
				", id=" + id +
				", name='" + name + '\'' +
				", transformer='" + transformer + '\'' +
				", box='" + box + '\'' +
				", meterSerial='" + meterSerial + '\'' +
				", oldUsage='" + oldUsage + '\'' +
				", newUsage='" + newUsage + '\'' +
				", recordedDate=" + recordedDate +
				'}';
	}
}
