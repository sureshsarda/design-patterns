package com.designpatterns;

/*
 * This is going to be a snapshot of the the Text class.
 * 
 */
public class TextMemento {

	private String snapshot;
	
	public TextMemento(String state) {
		this.snapshot = state;
	}
	
	public void setState(String s) {
		this.snapshot = s;
	}
	
	public String getState() {
		return this.snapshot;
	}
	
	@Override
	public String toString() {
		return "Snapshot: '" + snapshot + "'";
	}
	
}
