package com.linkedlist.doublylinkedlist.texteditor;

public class TestLinkedList {
	 public static void main(String[] args) {
	        TextEditorUndoRedo editor = new TextEditorUndoRedo();

	        editor.addState("Good");
	        editor.displayCurrentState();

	        editor.addState("Good Morning");
	        editor.displayCurrentState();

	        editor.addState("Good Morning!");
	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();

	        editor.redo();
	        editor.displayCurrentState();

	        editor.addState("Hello Java");
	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();
	    }
}
