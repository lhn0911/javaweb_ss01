package com.rikkei.ss01;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Bai3", value = "/Bai3")
public class Bai3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "Nguyễn Văn A";
        int age = 25;
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.getRequestDispatcher("/userInfo.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}