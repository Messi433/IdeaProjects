package com.faultquery.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.faultquery.dao.FaultQueryDAO;
import com.faultquery.dao.impl.FaultQueryDAOImpl;
import com.faultquery.po.Message;
import com.faultquery.po.QueryMessage;
//import com.faultquery.po.Question;

@WebServlet("/faultquery.servlet")
public class FaultQueryServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	FaultQueryDAO faultQueryDAO = new FaultQueryDAOImpl();

	public FaultQueryServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String servletPath = request.getServletPath();
		String answer = request.getParameter("method");
		if (answer != null) {
			answer(request, response);
		} else {
			String methodName = servletPath.substring(1);
			methodName = methodName.substring(0, methodName.length() - 3);

			try {
				Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,
						HttpServletResponse.class);
				method.invoke(this, request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@SuppressWarnings("unused")
	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String type = request.getParameter("type");
		String code = request.getParameter("code");
		String description = request.getParameter("description");

		QueryMessage queryMessage = new QueryMessage(type, code, description);

		List<Message> questions = faultQueryDAO.getAll(queryMessage);
		
		questions = sort(questions);

		HttpSession session = request.getSession();
		session.setAttribute("questions", questions);
		session.setAttribute("type", type);
		session.setAttribute("description", description);
		session.setAttribute("queryMessage", queryMessage);
		response.sendRedirect("views/query_1.jsp");

	}

	@SuppressWarnings("unused")
	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		Message question = faultQueryDAO.getById(Integer.parseInt(id));
		int count = question.getCount();
		count++;
		faultQueryDAO.addCount(Integer.parseInt(id), count);
		Message newQuestion = faultQueryDAO.getById(Integer.parseInt(id));

		request.setAttribute("newQuestion", newQuestion);
		request.getRequestDispatcher("/views/query_2.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void answer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		Message question = faultQueryDAO.getById(Integer.parseInt(id));

		request.setAttribute("question", question);

		request.getRequestDispatcher("/views/query_2.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void reBack(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// HttpSession session = request.getSession();
		// QueryMessage queryMessage =
		// (QueryMessage)session.getAttribute("queryMessage");
		// List<Question> questions = faultQueryDAO.getAll(queryMessage);

		response.sendRedirect("views/query_1.jsp");

	}

	public static List<Message> sort(List<Message> messages) {

		Collections.sort(messages, new Comparator<Message>() {
			public int compare(Message o1, Message o2) {
				// 排序属性
				if (o1.getCount() < o2.getCount()) {
					return 1;
				}
				if (o1.getCount() == o2.getCount()) {
					return 0;
				}
				return -1;
			}
		});

		return messages;
	}

}
