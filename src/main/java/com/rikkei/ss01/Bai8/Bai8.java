package com.rikkei.ss01.Bai8;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Bai8", value = "/Bai8")
public class Bai8 extends HttpServlet {
    private ArrayList<Task> taskList = new ArrayList<>();
    private int idCounter = 1;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if (idStr != null) {
            int id = Integer.parseInt(idStr);
            for (Task task : taskList) {
                if (task.getId() == id) {
                    task.setStatus("Completed");
                    break;
                }
            }
        }
        request.setAttribute("taskList", taskList);
        request.getRequestDispatcher("Bai8.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jobName = request.getParameter("jobName");
        if (jobName != null && !jobName.trim().isEmpty()) {
            taskList.add(new Task(idCounter++, jobName, "Doing"));
        }
        request.setAttribute("taskList", taskList);
        request.getRequestDispatcher("Bai8.jsp").forward(request, response);
    }
}