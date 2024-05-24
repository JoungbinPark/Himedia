package com.himedia.test1.controller;

import com.himedia.test1.controller.action.Action;
import com.himedia.test1.controller.action.IndexAction;
import com.himedia.test1.controller.action.MainAction;
import com.himedia.test1.controller.action.UserloginAction;

public class ActionFactory {
	private ActionFactory() {}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() { return itc; }
	
	public Action getAction(String command) {
		Action ac = null;
		
		if( command.equals("index") ) ac = new IndexAction();
		if( command.equals("userlogin") ) ac = new UserloginAction();
		if( command.equals("main") ) ac = new MainAction();


		return ac;
	}
}
