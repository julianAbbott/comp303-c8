package com.comp303.common;


import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.comp303.util.NodeVisitor;

public interface Node
{
	String name();
	
	void accept(NodeVisitor pVisitor);
}
	







