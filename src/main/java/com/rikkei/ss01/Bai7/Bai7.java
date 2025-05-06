package com.rikkei.ss01.Bai7;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "Bai7", value = "/Bai7")

public class Bai7 extends HttpServlet {
    private static final List<StudentTicket> studentList = new ArrayList<>();
    static {
        studentList.add(new StudentTicket("Nguyễn Văn A", "12A1", "Xe đạp", "75-A1 12345"));
        studentList.add(new StudentTicket("Trần Thị B", "11B2", "Xe máy", "75-B1 54321"));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", studentList);
        request.getRequestDispatcher("listStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}