package pl.coderslab;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateUser", value = "/create")
public class CreateUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("userName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(name, email, password);
        UserDao userDao = new UserDao();
        userDao.create(user);

        if (user.getUserName().equals(name)) {
            getServletContext().getRequestDispatcher("/users/createUserConfirmation.jsp").forward(request, response);
        } else {
            response.getWriter().println(name);
        }
    }
}
