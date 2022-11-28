package com.comp303.util;

import com.comp303.common.Directory;
import com.comp303.common.File;
import com.comp303.common.SymbolicLink;

public class PrettyPrintVisitor implements NodeVisitor {

	@Override
	public void DirectoryVisitor(Directory pDir) {
		System.out.println(pDir.name());
		
	}

	@Override
	public void FileVisitor(File pFile) {
		System.out.println("\t"+pFile.name());

	}

	@Override
	public void SymbolicLinkVisitor(SymbolicLink pSymbol) {
		System.out.println("\t"+pSymbol.name());
		
	}

}
