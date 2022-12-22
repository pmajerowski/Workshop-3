package pl.coderslab;

import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EditUser", value = "/edit")
public class EditUser extends HttpServlet {
    static UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String idStr = request.getParameter("edit");
        int id = Integer.parseInt(idStr);
        User user = userDao.read(id);
        request.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/users/editUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("userName");
        String email = request.getParameter("email");
        String idString = request.getParameter("id");

        int id = Integer.parseInt(idString);
        User currentUser = userDao.read(id);

        currentUser.setUserName(name);
        currentUser.setEmail(email);
        userDao.update(currentUser);

        response.sendRedirect("/userList");
    }

}
