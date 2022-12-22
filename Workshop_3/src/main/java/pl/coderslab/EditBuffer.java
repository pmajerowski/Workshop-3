package pl.coderslab;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EditBuffer", value = "/editBuffer")
public class EditBuffer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("edit");
        int idInt = Integer.parseInt(id);
        UserDao userDao = new UserDao();
        User user = userDao.read(idInt);
        String name = user.getUserName();
        String email = user.getEmail();
        Cookie idCookie = new Cookie("id", id);
        idCookie.setMaxAge(600);
        response.addCookie(idCookie);
        getServletContext().getRequestDispatcher("/users/editUser.jsp?name=" + name + "&email=" + email).forward(request, response);
    }
}
