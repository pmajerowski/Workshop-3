package pl.coderslab;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowUser", value = "/show")
public class ShowUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idString = request.getParameter("show");
        int id = Integer.parseInt(idString);

        try {
            UserDao userDao = new UserDao();
            User user = userDao.read(id);
            request.setAttribute("user", user);
        } catch (Exception e) {
            System.out.println("SOMETHING'S WRONG ! ! !");
        }
        getServletContext().getRequestDispatcher("/users/showUser.jsp").forward(request, response);

    }
}
