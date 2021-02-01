package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));

        float amount = price * (percent / 100);
        float  discountPrice = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>" + "Amount " + "</h1>");
        writer.println("<h1>" + amount + "</h1>");
        writer.println("<h1>" + "Price" + "</h1>");
        writer.println("<h1>" + discountPrice + "</h1>");
        writer.println("</html>");
    }
}
