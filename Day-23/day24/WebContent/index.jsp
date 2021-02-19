<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="dbSource" driver="com.mysql.cj.jdbc.Driver"
                         url="jdbc:mysql://localhost:3306/maggiedb"
                         user="root" password="333vijaya"/>
      <sql:query dataSource="${dbSource}" var="dbResult">
         SELECT * FROM address;
      </sql:query>

      <div id="myform">
         <form action="insert.jsp" method="post">
            <h1>Address</h1>
            <p class="mystyle">Add new address details</p>
            <label>ID <span>Insert  id</span> </label>
            <input type="text" name="id"/><br><br>
            <label>First Name <span>Enter first name</span> </label>
            <input type="text" name="fname"/><br><br>
            <label>Last Name <span>Enter Last name</span> </label>
            <input type="text" name="lname"/><br><br>
            <label>
               Phone <span>Enter phone number</span>
            </label>
            <input type="text" name="phone"/><br><br>
            <label>
               Email <span>Enter email address</span>
            </label>
            <input type="text" name="email"/><br><br>
            <input type="submit" value="Add New"/>
         </form>
      </div>

      <br/>
      <font color="blue">
         <c:if test="${not empty param.msg}">
            <c:out value="${param.msg}" />
         </c:if>
      </font>
      <br/>
      <form>
         <div class="CSSTableGenerator" >
            <table>
               <tr>
                  <td>ID</td> 
                  <td>First Name</td>
                  <td>Last Name</td>
                  <td>Phone</td>
                  <td>Email</td>
                  <td colspan="2"></td>
               </tr>
               <c:forEach var="row" items="${dbResult.rows}">
                  <tr>
                     <td><c:out value="${row.id}"/></td>
                     <td><c:out value="${row.fname}"/></td>
                     <td><c:out value="${row.lname}"/></td>
                     <td><c:out value="${row.phone}"/></td>
                     <td><c:out value="${row.email}"/></td>
                     <td>
                        <a href="updateForm.jsp?id=<c:out
                           value="${row.id}"/>">Update</a>
                     </td>
                     <td><a href="delete.jsp?id=<c:out
                        value="${row.id}"/>">Delete</a></td>
                  </tr>
               </c:forEach>
            </table>
         </div>
      </form>
      <br/>
   </body>
</html>