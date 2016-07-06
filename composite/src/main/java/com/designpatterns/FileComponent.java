package com.designpatterns;

/*
 * This the class which all components will extend. In our example, File and Directory.
 * 
 */
public abstract class FileComponent {

	protected String name;

	public void add(FileComponent fileComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(FileComponent fileComponent) {
		throw new UnsupportedOperationException();
	}

	public void printName() {
		System.out.println("Name: " + name);
	}

	public void someTaskToPerform() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FileComponent) {
			FileComponent objectToCompare = (FileComponent) obj;
			return this.name.equals(objectToCompare.name);
		}
		return false;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
