package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that processes text. */
@WebServlet("/contact-with-me")
public final class ContactWithMe extends HttpServlet {

  @Override
  public void doPost(final HttpServletRequest request, final  HttpServletResponse response) throws IOException {
        final  String name = request.getParameter("name-input");
        final  String email = request.getParameter("email-input");
        final  String phoneNumber = request.getParameter("phoneNumber-input");
        final  String message = request.getParameter("message-input");

        if (!name.equals("") && !email.equals("") && !phoneNumber.equals("") && !message.equals("") ) {
            System.out.println("You submitted this data: ");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Message: " + message);

            response.getWriter().println("You submitted this data: ");
            response.getWriter().println("Name: " + name);
            response.getWriter().println("Email: " + email);
            response.getWriter().println("Phone Number: " + phoneNumber);
            response.getWriter().println("Message: " + message);
        }
    }
}