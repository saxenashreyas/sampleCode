package com.webnarad.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webnarad.dao.UsersDao;
import com.webnarad.dao.impl.UsersDaoImpl;
import com.webnarad.domain.User;

/**
 * Servlet implementation class ListOfUsers
 */

public class GetUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UsersDao userDao = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUser() {
        super();
        userDao = new UsersDaoImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("uid");
		User user = userDao.readUser(userId);
		response.getWriter().append("<H1> User Info </H1>");
		response.getWriter().append("<BR> User Name = " + user.getUserName());
		response.getWriter().append("<BR> Role = " + user.getRole());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
