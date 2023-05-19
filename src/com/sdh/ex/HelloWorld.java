package com.sdh.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("HWorld")
public class HelloWorld extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public HelloWorld(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
     System.out.println("HelloWord");
     response.setContentType("text/html; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Hello World!!</h1>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();

        //servelt 인터페이스가 있고 추상클래스로 GenericServlt이 있고 HttpServelt이 상속받는다"

    }
}