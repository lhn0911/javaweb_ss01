package com.rikkei.ss01;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Bai1", value = "/Bai1")
public class Bai1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Sơ đồ kiến trúc ứng dụng Web Java</h2>");
        out.println("<img src='images/Bai1.png' alt='Architecture Diagram' width='600'/><br><br>");
        out.println("<ul>");
        out.println("<li><strong>Client (Browser)</strong><br>" +
                "Là nơi người dùng tương tác với ứng dụng (Chrome, Firefox...)<br>" +
                "Gửi yêu cầu HTTP đến server và nhận phản hồi (HTML, ảnh, dữ liệu...)</li>");
        out.println("<li><strong>Web Server (Tomcat)</strong><br>" +
                "Nhận và xử lý các yêu cầu HTTP từ client<br>" +
                "Điều phối các yêu cầu đến các servlet hoặc JSP</li>");
        out.println("<li><strong>Application Server (Java Servlets/JSP)</strong><br>" +
                "Xử lý nghiệp vụ chính (business logic)<br>" +
                "Giao tiếp với cơ sở dữ liệu, xử lý dữ liệu, kiểm tra logic, sau đó gửi kết quả về web server</li>");
        out.println("<li><strong>Database (MySQL, PostgreSQL...)</strong><br>" +
                "Lưu trữ dữ liệu như người dùng, sản phẩm, hóa đơn...<br>" +
                "Các thao tác CRUD (Create, Read, Update, Delete) được thực hiện từ Application Server</li>");
        out.println("</ul>");

        out.println("<p>Người dùng sử dụng trình duyệt (Client) để gửi yêu cầu HTTP đến Web Server. " +
                "Web Server tiếp nhận yêu cầu này và định tuyến đến các servlet hoặc JSP trong Application Server để xử lý nghiệp vụ. " +
                "Tại đây, servlet có thể tương tác với cơ sở dữ liệu (Database) thông qua JDBC để lấy hoặc lưu dữ liệu. " +
                "Sau khi xử lý xong, Application Server trả về dữ liệu (HTML, JSON hoặc file...) cho Web Server. " +
                "Web Server gửi phản hồi này về trình duyệt của người dùng để hiển thị.</p>");
        out.println("</body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}