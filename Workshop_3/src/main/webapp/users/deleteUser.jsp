<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

  <%@ include file="/theme/header.jsp" %>
  <!-- Begin Page Content -->
        <div class="container-fluid">
          <!-- Page Heading -->
          <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">Delete user</h1>
            <a href="/userList" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Go back to list</a>
          </div>
          <!-- Content Row -->
          <div class="row">
            <div align="center">
            <p>Are you sure you want to delete this user of id ${param.id}?</p>
              <form action="/delete">
                <button type="submit" name="id" value="${param.id}">Confirm</button>
              </form>
              <form action="/userList">
                <button type="submit" value="cancel">Cancel</button>
              </form>

            </div>


        </div>
          <%@ include file="/theme/footer.jsp" %>