package com.bnuz;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengAnCheng
 * @data 2022.9.30
 */
@WebServlet("/loginServlet05")
public class LoginServlet05 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");


        ServletConfig servletConfig = this.getServletConfig();
        ServletContext servletContext = servletConfig.getServletContext();
        String username = servletContext.getInitParameter("username");

        String passwd = servletContext.getInitParameter("passwd");

        if ("֣����".equals(username) && "2001030010".equals(passwd)){
            System.out.println("��֤�ɹ�");
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("<script>alert('��¼�ɹ�');</script>");
        }else {
            System.out.println("��¼ʧ��");
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("<script>alert('�û����ƻ��������');</script>");
        }
    }
}
