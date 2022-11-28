package com.comp303.util;

import com.comp303.common.Directory;
import com.comp303.common.File;
import com.comp303.common.SymbolicLink;

public interface NodeVisitor {
	
	void DirectoryVisitor(Directory pDir);
	
	void FileVisitor(File pFile);
	
	void SymbolicLinkVisitor(SymbolicLink pSymbo );

}
