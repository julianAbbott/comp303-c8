package com.comp303.common;


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
}