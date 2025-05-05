package com.rikkei.ss01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Bai2", value = "/Bai2")
public class Bai2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Cấu trúc thư mục & vai trò</title></head>");
        out.println("<body>");
        out.println("<h1>Cấu trúc thư mục & vai trò</h1>");

        out.println("<h2>1. src/main/java</h2>");
        out.println("<p><strong>Vai trò:</strong><br>Chứa toàn bộ mã nguồn Java của ứng dụng như servlet, controller, service, DAO, entity...</p>");
        out.println("<p><strong>Ví dụ:</strong><br>com.rikkei.web.HelloServlet.java</p>");

        out.println("<h2>2. src/main/resources</h2>");
        out.println("<p><strong>Vai trò:</strong><br>Chứa các tài nguyên không phải mã nguồn nhưng cần thiết trong quá trình chạy, ví dụ như:</p>");
        out.println("<ul>");
        out.println("<li>File cấu hình (application.properties, log4j.xml)</li>");
        out.println("<li>File ngôn ngữ (i18n), tệp tin template...</li>");
        out.println("</ul>");
        out.println("<p><strong>Đặc điểm:</strong><br>Các file trong đây sẽ được tự động đóng gói vào thư mục classes khi build.</p>");

        out.println("<h2>3. src/main/webapp</h2>");
        out.println("<p><strong>Vai trò:</strong><br>Chứa các tài nguyên tĩnh và các tệp web dùng cho phía client như:</p>");
        out.println("<ul>");
        out.println("<li>index.jsp, HTML, CSS, JS, images, WEB-INF, web.xml...</li>");
        out.println("</ul>");
        out.println("<p><strong>Đặc điểm:</strong><br>Khi ứng dụng chạy trên server như Tomcat, các file ở đây sẽ là nội dung trực tiếp phản hồi về trình duyệt.</p>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}