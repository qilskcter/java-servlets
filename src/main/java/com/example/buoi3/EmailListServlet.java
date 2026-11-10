package com.example.buoi3;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        String url = "/index.html";

        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.html";
        } else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dob = request.getParameter("dob");
            String whereuHear = request.getParameter("whereuHear");
            String[] agreement = request.getParameterValues("agreement");
            String choose = request.getParameter("choose");

            User user = new User(firstName, lastName, email, dob, whereuHear);
            UserDB.insert(user);
            request.setAttribute("user", user);
            request.setAttribute("agreements", agreement);

            String agreementText = (agreement != null) ? String.join(", ", agreement) : "None";
            request.setAttribute("agreementText", agreementText);
            url = "/thanks.jsp";

            request.setAttribute("choose", choose);
            String chooseValue = "email-or-postal".equals(choose) ? "Email or postal mail"
                    : "email".equals(choose) ? "Email only"
                    : "Postal Only";
            request.setAttribute("chooseValue", chooseValue);
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {
        doPost(request, response);
    }
}
