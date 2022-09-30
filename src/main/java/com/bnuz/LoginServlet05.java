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

        if ("郑安成".equals(username) && "2001030010".equals(passwd)){
            System.out.println("验证成功");
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("<script>alert('登录成功');</script>");
        }else {
            System.out.println("登录失败");
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("<script>alert('用户名称或密码错误');</script>");
        }
    }
}
