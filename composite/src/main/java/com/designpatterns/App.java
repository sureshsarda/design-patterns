package com.designpatterns;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		FileComponent homeDir = new Directory("home");

		FileComponent moviesDir = new Directory("movies");
		homeDir.add(moviesDir);

		FileComponent movie1 = new File("Godfather 1.mp4");
		FileComponent movie2 = new File("Godfather 2.mp4");
		FileComponent movie3 = new File("Godfather 3.mp4");

		moviesDir.add(movie1);
		moviesDir.add(movie2);
		moviesDir.add(movie3);

		FileComponent documentsDir = new Directory("documents");
		homeDir.add(documentsDir);

		FileComponent testFile = new File("Test File");
		documentsDir.add(testFile);

		FileComponent designPatterns = new Directory("design-patterns");
		documentsDir.add(designPatterns);

		FileComponent composite = new File("composite");
		FileComponent prototype = new File("prototype");
		FileComponent factory = new File("factory");

		designPatterns.add(composite);
		designPatterns.add(prototype);
		designPatterns.add(factory);

		homeDir.someTaskToPerform();

		moviesDir.someTaskToPerform();
		documentsDir.someTaskToPerform();
		designPatterns.someTaskToPerform();

	}
}
