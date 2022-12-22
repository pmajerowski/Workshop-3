package pl.coderslab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Actions", value = "/actions")
public class Actions extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("name");
        String userId = request.getParameter("value");

        response.getWriter().println("action: " + action + ", id: " + userId);

//        switch (action) {
//            case "show" : {getServletContext().getRequestDispatcher("/showUser.jsp").forward(request, response);}
//            case "edit" : {getServletContext().getRequestDispatcher("/editUser.jsp").forward(request, response);}
//            case "delete" : {getServletContext().getRequestDispatcher("/deleteUser.jsp").forward(request, response);}
//        }
    }
}
