package com.sdh.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PostMethod")
public class PostMethod extends HttpServlet {
    private  static final long serialVersionUID=1L;

    public PostMethod(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");

        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>post 방식입니다.</h1>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }
}

//Context Path : WAS에서 웹어플리케이션을 구분하기 위한 path.
//해당웹어플리케이션의 이름으로 생각