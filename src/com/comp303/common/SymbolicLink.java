package com.comp303.common;

import com.comp303.util.NodeVisitor;

public class SymbolicLink extends AbstractNode
{
	private final Node aNode;
	
	public SymbolicLink(String pName, Node pNode)
	{
		super(pName);
		aNode = pNode;
	}
	
	public String name()
	{
		return "Link to " + aNode.name();
	}

	@Override
	public void accept(NodeVisitor pVisitor) {
		// TODO Auto-generated method stub
		
	}

	protected void execute(NodeVisitor pVisitor) {
		pVisitor.SymbolicLinkVisitor(this);
		
	}

}