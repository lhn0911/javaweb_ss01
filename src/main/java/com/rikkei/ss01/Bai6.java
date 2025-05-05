package com.rikkei.ss01;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Bai6", value = "/Bai6")
public class Bai6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.sendRedirect("registerForm.jsp");
    }

    private void handleRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String className = request.getParameter("className");
        String vehicleType = request.getParameter("vehicleType");
        String licensePlate = request.getParameter("licensePlate");

        boolean isValid = fullName != null && className != null
                && vehicleType != null && licensePlate != null
                && !fullName.trim().isEmpty()
                && !className.trim().isEmpty()
                && !vehicleType.trim().isEmpty()
                && !licensePlate.trim().isEmpty();

        if (isValid) {
            request.setAttribute("message", "Đăng ký vé xe thành công!");
            request.setAttribute("fullName", fullName);
            request.setAttribute("className", className);
            request.setAttribute("vehicleType", vehicleType);
            request.setAttribute("licensePlate", licensePlate);
        } else {
            request.setAttribute("message", "Đăng ký thất bại! Vui lòng nhập đầy đủ thông tin.");
        }

        request.getRequestDispatcher("resultRegister.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        handleRegister(request, response);
    }
}