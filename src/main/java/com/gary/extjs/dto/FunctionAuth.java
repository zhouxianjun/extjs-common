package com.gary.extjs.dto;

import java.util.ArrayList;
import java.util.List;

public class FunctionAuth extends BaseFunction {
	private List<FunctionAuth> children = new ArrayList<FunctionAuth>();

	public List<FunctionAuth> getChildren() {
		return children;
	}

	public void setChildren(List<FunctionAuth> children) {
		this.children = children;
	}
	
	public boolean isLeaf() {
		return getChildren().size() < 1;
	}
}
