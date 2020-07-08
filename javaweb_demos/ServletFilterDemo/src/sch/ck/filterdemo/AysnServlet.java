package sch.ck.filterdemo;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "AysnServlet",value = "aysnservlet",asyncSupported = true)
public class AysnServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Servlet开始时间:"+new Date());
        System.out.println("Servlet完成时间:"+new Date());
        //获得异步对象
      AsyncContext context = req.startAsync();
        new Thread(new Excutor(context)).start();

    }
    public class Excutor implements Runnable{

        private AsyncContext context;
        public Excutor(AsyncContext context){
            this.context=context;
        }
        @Override
        public void run() {
            //处理业务
            try {
                Thread.sleep(3000);
                //执行业务完成时间
                System.out.println("执行业务完成时间:"+new Date());
                //通过context对象可以获得request，response对象

                /**
                 * context.getRequest();
                 context.getResponse();
                 */

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
