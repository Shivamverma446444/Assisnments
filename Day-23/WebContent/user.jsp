<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
<table border=1>
        <thead>
            <tr>
                <th>User Name</th>
                <th>Email</th>
                <th>Registration Date</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td><c:out value="${user.uname}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><fmt:formatDate pattern="dd MMM,yyyy" value="${user.registeredon}" /></td>
                    <td><a href="UserController?action=edit&userId=<c:out value="${user.uname}"/>">Update</a></td>
                    <td><a href="UserController?action=delete&userId=<c:out value="${user.uname}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="UserController?action=insert">Add User</a></p>
</body>
</html>