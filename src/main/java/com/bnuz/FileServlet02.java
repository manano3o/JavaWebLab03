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
@WebServlet("/file-doc")
public class FileServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/msword");
        ServletOutputStream out = resp.getOutputStream();
        File pdf = null;
        BufferedInputStream buf = null;
        try {
            //初始化参数
            String pdfDir = ("G:\\JavaWebLab03\\src\\main\\webapp\\WEB-INF\\");
            pdf = new File(pdfDir + "2001030010.doc");
            resp.setContentLength((int)pdf.length());
            FileInputStream input = new FileInputStream(pdf);
            buf = new BufferedInputStream(input);
            int readBytes = 0;
            while ((readBytes = buf.read()) != -1){
                out.write(readBytes);
            }
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
