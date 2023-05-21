package com.sdh.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/initP"}, initParams = {@WebInitParam(name = "id",value = "aaaaa"), @WebInitParam(name = "pw",value = "12345")})
public class ServeltInitParam extends HttpServlet {
    private static final long serialVersionUID = 1L;

   public ServeltInitParam(){
       super();
   }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = getInitParameter("id");
        String pw = getInitParameter("pw");
        String path = getInitParameter("path");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
