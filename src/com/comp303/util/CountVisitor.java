package com.comp303.util;

import com.comp303.common.*;


public class CountVisitor implements NodeVisitor {

	private int aCount;
	

	@Override
	public void DirectoryVisitor(Directory pDir) {
		aCount = getCount() + 1;
	}

	@Override
	public void FileVisitor(File pFile) {
		aCount = getCount() + 1;
	}

	@Override
	public void SymbolicLinkVisitor(SymbolicLink pSymbol) {
		aCount = getCount() + 1;
	}

	public int getCount() {
		return aCount;
	}


}
