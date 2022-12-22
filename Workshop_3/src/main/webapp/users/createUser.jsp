<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/theme/header.jsp" %>
<div class="container-fluid">
    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Create a new User</h1>
        <a href="/userList" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Go back to list</a>
    </div>
<form action="/create"  method="post">
    <table>
        <colgroup>
            <col style="width: 135px">
            <col style="width: 550px">
        </colgroup>
        <tr>
            <td>Name:</td>
            <td><input type="text" style="width: 350px" name="userName"></td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td><input type="text" style="width: 350px" name="email"></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="password" style="width: 350px" name="password"></td>
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
            <td><button type="submit" value="submit">Create</button></td>
        </tr>
    </table>
</form>

</div>
</div>
<%@ include file="/theme/footer.jsp" %>