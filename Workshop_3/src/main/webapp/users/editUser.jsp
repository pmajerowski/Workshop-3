<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

  <%@ include file="/theme/header.jsp" %>
  <!-- Begin Page Content -->
        <div class="container-fluid">
          <!-- Page Heading -->
          <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">Edit user</h1>
            <a href="/userList" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Go back to list</a>
          </div>
          <!-- Content Row -->

          <form action="/edit"  method="post">
            <table>
              <colgroup>
                <col style="width: 135px">
                <col style="width: 550px">
              </colgroup>
              <input type="hidden" name="id" value="${user.id}">
              <tr>
                <td>Name:</td>
                <td><input type="text" style="width: 350px" name="userName" value="${user.userName}"></td>
              </tr>
              <tr>
                <td>E-mail:</td>
                <td><input type="text" style="width: 350px" name="email" value="${user.email}"></td>
              </tr>
              <tr><td> </td>
                <td> </td></tr>
              <tr><td> </td>
                <td> </td></tr>
              <tr>
                <td></td>
              </tr>
              <tr>
                <td> </td>
                <td><button type="submit" value="submit">Confirm</button></td>
              </tr>
            </table>
          </form>
          <p> </p>
          <p> </p>
          <p>
          <form action="/userList">
            <button type="submit" value="cancel">Cancel</button>
          </form>
          </p>

          </div>
        </div>
          <%@ include file="/theme/footer.jsp" %>