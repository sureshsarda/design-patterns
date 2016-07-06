package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileComponent {

	List<FileComponent> children = new ArrayList<FileComponent>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public void add(FileComponent fileComponent) {
		children.add(fileComponent);
	}

	@Override
	public void remove(FileComponent fileComponent) {
		children.remove(fileComponent);
	}

	@Override
	public void someTaskToPerform() {
		System.out.println("Contents of directory: " + this.toString());
		for (FileComponent fileComponent : children) {
			System.out.println(fileComponent);
		}
	}

}
