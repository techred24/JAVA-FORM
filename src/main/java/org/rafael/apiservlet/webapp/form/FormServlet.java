package org.rafael.apiservlet.webapp.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registro")
public class FormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        try (PrintWriter out = resp.getWriter()) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<meta charset=\"UTF-8\"/>");
            out.print("<title>Resultado form</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Resultado form!</h1>");

            out.print("<ul>");
            out.print("<li> Username: " + username + "</li>");
            out.print("<li> Password: " + password + "</li>");
            out.print("<li> Email: " + email + "</li>");
            out.print("</ul>");

            out.print("</body>");
            out.print("</html>");
        }
    }
}
