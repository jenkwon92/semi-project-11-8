package org.kosta.sharecipe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.sharecipe.model.MemberDAO;

public class RegisterIdCheckController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("joinId");
		boolean result=MemberDAO.getInstance().checkId(id);
		if(result)
			return "idcheck-fail.jsp";
		else
			return "idcheck-ok.jsp";
	}

}
