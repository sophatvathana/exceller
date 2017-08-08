package com.nanita.exceller;

import java.util.ArrayList;
import java.util.List;

public class InvalidRowException extends  ParserException {
	List<InvalidRow> invalidRows;
	public InvalidRowException(String message) {
		super(message);
		invalidRows = new ArrayList<InvalidRow>();
	}
	
	public InvalidRowException(String message, Exception exception) {
		super(message, exception);
		invalidRows = new ArrayList<InvalidRow>();
	}
	
	public List<InvalidRow> getInvalidCells() {
		return invalidRows;
	}
	
	public void setInvalidCells(List<InvalidRow> invalidCells) {
		this.invalidRows = invalidCells;
	}
	
	public void addInvalidCell(InvalidRow excelInvalidCell)
	{
		invalidRows.add(excelInvalidCell);
	}
}