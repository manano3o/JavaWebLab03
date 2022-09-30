package com.bnuz;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengAnCheng
 * @data 2022.9.19
 */

@WebServlet("/hello")
public class HttpServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String userName = req.getParameter("username");
        System.out.println("username:" + userName);

         String name = req.getQueryString();
        System.out.println("�����ѯ�ַ���:" + name);

         String protocol = req.getProtocol();
        System.out.println("Э��:" + protocol);

        String localAddr = req.getLocalAddr();
        System.out.println("LocalAddr:" + localAddr);

        String localName = req.getLocalName();
        System.out.println("Localname:" + localName);

        int localPort = req.getLocalPort();
        System.out.println("LocalPort:" + localPort);

        String remoteAddr = req.getRemoteAddr();
        System.out.println("�ͻ��˵�ַ:" + remoteAddr);

        int remotePort = req.getRemotePort();
        System.out.println("�ͻ��˶˿�:" + remotePort);

        String remoteHost = req.getRemoteHost();
        System.out.println("�ͻ�������:" + remoteHost);

        String method = req.getMethod();
        System.out.println("����ʽ:" + method);

        String uri = req.getRequestURI();
        System.out.println("URI:" + uri);

        String contextPath = req.getContextPath();
        System.out.println("ContextPath:" + contextPath);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
