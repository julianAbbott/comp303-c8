package com.comp303.common;

import com.comp303.util.NodeVisitor;

public class File extends AbstractNode
{
	public File(String pName)
	{
		super(pName);
	}




	@Override
	public void accept(NodeVisitor pVisitor) {
		// TODO Auto-generated method stub
		super.accept(pVisitor);
	}




	protected void execute(NodeVisitor pVisitor ) {
		pVisitor.FileVisitor(this);
	}
}