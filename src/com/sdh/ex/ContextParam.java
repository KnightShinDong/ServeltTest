package com.sdh.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ContextParam extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String id =getServletContext().getInitParameter("id");
            String pw =getServletContext().getInitParameter("pw");
            String path = getServletContext().getInitParameter("path");

            resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html><head></head><body>");
        writer.println("아이디:" +id +"<br/>");
        writer.println("비밀번호:"+pw+"<br/>");
        writer.println("path"+path);
        writer.println("</body></html>");

        writer.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
