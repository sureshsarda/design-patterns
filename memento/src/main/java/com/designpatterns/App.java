package com.designpatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TextCaretaker caretaker = new TextCaretaker();
        
        Text text = new Text();
        caretaker.setMemenot(text.createMemenot());
        
        text.add("Hello");
        text.add("World! ");
        caretaker.setMemenot(text.createMemenot());
        
        text.add("How");
        text.add("are");
        text.add("you?");
        caretaker.setMemenot(text.createMemenot());
        
        System.out.println(caretaker.getPreviousState());
        System.out.println(caretaker.getState(2));
        System.out.println(caretaker.getState(3));
        
    }
}
