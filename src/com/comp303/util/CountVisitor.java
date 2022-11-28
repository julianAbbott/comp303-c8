package com.comp303.util;

import com.comp303.common.*;


public class CountVisitor implements NodeVisitor {
	private int aFileCount;
	private int aDircount;
	private int aSymbolicLinkCount;
	

	@Override
	public void DirectoryVisitor(Directory pDir) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FileVisitor(File pFile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SymbolicLinkVisitor(SymbolicLink pSymbol) {
		// TODO Auto-generated method stub
		
	}

	public int getFileCount() {
		return aFileCount;
	}

	public int getDircount() {
		return aDircount;
	}

	public int getSymbolicLinkCount() {
		return aSymbolicLinkCount;
	}

}
