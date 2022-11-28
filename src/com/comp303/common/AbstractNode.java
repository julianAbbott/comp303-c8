package com.comp303.common;

import com.comp303.util.NodeVisitor;

abstract class AbstractNode implements Node
{
	private String aName;
	
	protected AbstractNode(String pName)
	{
		aName = pName;
	}
	
	public String name()
	{
		return aName;
	}
	
	@Override
	public void accept(NodeVisitor pVisitor) {
		execute(pVisitor);	

	}

	protected abstract void execute(NodeVisitor pVisitor);

	

}