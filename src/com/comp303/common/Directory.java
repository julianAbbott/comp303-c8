package com.comp303.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.comp303.util.NodeVisitor;

public class Directory extends AbstractNode implements Iterable<Node>
{
	private final List<Node> aNodes;
	
	public Directory(String pName, Node... pNodes)
	{
		super(pName);
		aNodes = Arrays.asList(pNodes);
	}
	
	public Iterator<Node> iterator()
	{
		return Collections.unmodifiableList(aNodes).iterator();
	}



	@Override
	public void accept(NodeVisitor pVisitor) {
		// TODO Auto-generated method stub
		super.accept(pVisitor);
	}

	protected void execute(NodeVisitor pVisitor) { 
		pVisitor.DirectoryVisitor(this);
		for (Node n : aNodes) {
			n.accept(pVisitor);
		}		
	}
}