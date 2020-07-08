package sch.ck.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class doLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username ="";
        String password ="" ;
        username = req.getParameter("username");
        password = req.getParameter("password");
        if ("admin".equals(username)&&"123".equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("user",username);

        }else{
            resp.sendRedirect("fail.jsp");
        }



    }


}
