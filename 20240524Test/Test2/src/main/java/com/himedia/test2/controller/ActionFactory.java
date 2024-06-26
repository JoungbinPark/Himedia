package com.himedia.test2.controller;

import com.himedia.test2.controller.action.Action;
import com.himedia.test2.controller.action.AddProductAction;
import com.himedia.test2.controller.action.IndexAction;
import com.himedia.test2.controller.action.ResultAction;

public class ActionFactory {
	private ActionFactory() {}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() { return itc; }
	
	public Action getAction(String command) {
		Action ac = null;
		
		if( command.equals("index") ) ac = new IndexAction();
		else if( command.equals("addProduct") ) ac = new AddProductAction();
		else if( command.equals("result") ) ac = new ResultAction();

		
		return ac;
	}
}
