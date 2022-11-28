package com.comp303.util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.comp303.common.Directory;
import com.comp303.common.File;
import com.comp303.common.SymbolicLink;

public  class TestPrettyPrintVisitor {
	static File myFile = new File("my-diary.txt");
	static File myFile2 = new File("my-budget.csv"); 
	static File myFile3= new File("virus.sh");
	static SymbolicLink myLink = new SymbolicLink("link to very bad virus", myFile3); 
	static Directory myDir = new Directory("julian_stuff", myFile, myFile2, myLink);
	static NodeVisitor v = new PrettyPrintVisitor();

	
	
	public static void TestFileVisitor() {
		myFile.accept(v);
	}
	
	public static void TestSymboloicLinkVisitor() {
		myLink.accept(v);
	}
	
	@Test
	public static void TestDirectoryVisitor() {
		myDir.accept(v);
	}
	
	public static void main (String[] args) {
//		TestFileVisitor();
//		TestSymboloicLinkVisitor();
		TestDirectoryVisitor();
	}
	

}
