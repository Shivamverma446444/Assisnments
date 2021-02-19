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
                         url="jdbc:mysql://localhost:3306/shivamdb"
                         user="root" password="Verma"/>

      <sql:query dataSource="${dbSource}" var="dbResult">
         SELECT * from address where id=?;
         <sql:param value="${param.id}" />
      </sql:query>


      <div id="myform">
         <form action="update.jsp" method="post">
            <h1>Update Address</h1>
            <p class="mystyle">
               Update Address ID <c:out value="${param.id}"/>
            </p>
            <c:forEach var="row" items="${dbResult.rows}">
               <input type="hidden" value="${row.id}" name="id"/><br>
               <label
                  >First Name <span>Enter first name </span>
               </label>
               <input type="text" value="${row.fname}" name="fname"/><br>
               <label>
                  Last Name <span>Enter Last name </span>
               </label>
               <input type="text" value="${row.lname}" name="lname"/><br>
               <label>Phone <span>Enter phone number</span> </label>
               <input type="text" value="${row.phone}" name="phone"/><br>
               <label>Email <span>Enter email address</span> </label>
               <input type="text" value="${row.email}" name="email"/><br>
               <input type="submit" value="Update"/>
            </c:forEach>
         </form>
      </div>
</body>
</html>