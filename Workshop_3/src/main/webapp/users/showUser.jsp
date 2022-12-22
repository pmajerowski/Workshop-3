<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/theme/header.jsp" %>
<!-- Begin Page Content -->
<div class="container-fluid">
    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800"></h1>
        <a href="/userList" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Go back to list</a>
    </div>
    <!-- Content Row -->
    <div class="row">
        <h4>User details</h4><br>
    </div>
    <div class="row">
        <table border="solid">
            <colgroup>
                <col style="width: 35px">
                <col style="width: 350px">
                <col style="width: 350px">
                <col style="width: 114px">
            </colgroup>
            <thead>
            <tr>
                <td><b>ID</b></td>
                <td><b>name</b></td>
                <td><b>e-mail</b></td>
                <td><b></b></td>
            </tr>
            </thead>
            <tbody>

            <tr>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.email}</td>
                <td>
                  <span>
                            <form class="formWithButtons" action="/edit" method="get">
                                <button type="submit" name="edit" value="${user.id}">edit</button>
                            </form>
                        </span>
                    <span>
                            <form class="formWithButtons" action="/users/deleteUser.jsp?id=${user.id}" method="post">
                                <button type="submit" name="delete" value="${user.id}">delete</button>
                            </form>
                        </span>
                </td>
            </tr>

            </tbody>
        </table>
    </div>
    <c:forEach var="user" items="${users}">
        <div class="row">
                ${user.id}
                ${user.userName}
                ${user.email}
        </div>
    </c:forEach>

</div>
<%@ include file="/theme/footer.jsp" %>