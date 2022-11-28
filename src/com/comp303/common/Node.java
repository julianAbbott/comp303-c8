package com.comp303.common;


import com.comp303.util.NodeVisitor;

public interface Node
{
	String name();
	
	void accept(NodeVisitor pVisitor);
}
	







