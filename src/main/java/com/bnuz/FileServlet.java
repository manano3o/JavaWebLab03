package com.bnuz;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ZhengAnCheng
 * @data 2022.9.20
 */
@WebServlet("/file-pdf")
public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/pdf");
        ServletOutputStream out = resp.getOutputStream();
        File pdf = null;
        BufferedInputStream buf = null;
        try {
            //初始化参数
            String pdfDir = ("G:\\JavaWebLab03\\src\\main\\webapp\\WEB-INF\\");
            pdf = new File(pdfDir + "xinjishu.pdf");
            resp.setContentLength((int)pdf.length());
            System.out.println("===1====");
            FileInputStream input = new FileInputStream(pdf);
            System.out.println("===2====");
            buf = new BufferedInputStream(input);
            System.out.println("===3====");
            int readBytes = 0;
            System.out.println("===4====");
            while ((readBytes = buf.read()) != -1){
                System.out.println("===5====");
                out.write(readBytes);
                System.out.println("===6====");
            }
            System.out.println("===7====");
        }catch (IOException e){
            System.out.println("file not found");
        }finally {
            if (out != null){
                out.close();
            }
            if(buf != null){
                buf.close();
            }

        }

    }
}
