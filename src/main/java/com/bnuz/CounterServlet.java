package com.bnuz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengAnCheng
 * @data 2022.9.20
 */
@WebServlet("/counterServlet")
public class CounterServlet extends HttpServlet {
    private int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        count++;

        resp.getWriter().write("" +
                "<p> CounterServlet</p>" +
                "<h2>欢迎光临本站 + 您是第" + count + "访问者" +
                "");

    }
}
