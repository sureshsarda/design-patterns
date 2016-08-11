package com.designpatterns;

import java.util.LinkedList;
import java.util.List;

public class TextCaretaker {
	
	private List<TextMemento> states = new LinkedList<TextMemento>();

	public void setMemenot(TextMemento memento) {
		states.add(memento);
	}
	
	public TextMemento getState(int previous) {
		return states.get(states.size() - previous);
	}

	public TextMemento getPreviousState() {
		return getState(1);
	}
}
