package pl.coderslab;

import pl.coderslab.utils.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteUser", value = "/delete")
public class DeleteUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idString = request.getParameter("id");
        int id = Integer.parseInt(idString);

        UserDao userDao = new UserDao();
        userDao.delete(id);

        getServletContext().getRequestDispatcher("/users/deleteUserConfirmation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
