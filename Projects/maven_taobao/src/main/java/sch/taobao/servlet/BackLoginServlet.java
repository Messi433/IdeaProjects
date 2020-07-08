package sch.taobao.servlet;

import org.springframework.web.util.HtmlUtils;
import sch.taobao.bean.Administer;
import sch.taobao.util.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//后台登录
@WebServlet("/backLoginServlet")
public class BackLoginServlet extends BaseBackServlet{
    public  String loginIndex(HttpServletRequest request,HttpServletResponse response,Page page){

        return  "admin/backLogin.jsp";
    }
    public String login(HttpServletRequest request, HttpServletResponse response, Page page) throws ServletException, IOException {

        String name=request.getParameter("name");
        name = HtmlUtils.htmlEscape(name);
        String password =request.getParameter("password");
        Administer administer = administerDAO.get(name,password);//如果数据库中有对应的账号密码会取出对应administer对象
        if (administer==null){
            request.setAttribute("msg","账号密码错误");
            return "admin/backLogin.jsp";
        }else{

        }
        request.getSession().setAttribute("administer",administer);


        return "@admin_category_list";
    }

    @Override
    public String add(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }

    @Override
    public String delete(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }

    @Override
    public String edit(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }

    @Override
    public String update(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }

    @Override
    public String list(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }
}
