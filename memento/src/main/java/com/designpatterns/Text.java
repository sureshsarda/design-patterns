package com.designpatterns;

import java.util.Observable;

public class Text extends Observable{

	public StringBuilder stringBuilder;
	
	public Text() {
		stringBuilder = new StringBuilder();
	}
	
	public void add(String str) {
		stringBuilder.append(str);
	}
	
	public String getContent() {
		return stringBuilder.toString();
	}
	
	public void setMemento(TextMemento memento) {
		stringBuilder = new StringBuilder(memento.getState());
	}
	
	public TextMemento createMemenot() {
		return new TextMemento(getContent());
	}

}
