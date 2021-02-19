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
<sql:setDataSource var="dbSource"
                         driver="com.mysql.cj.jdbc.Driver"
                         url="jdbc:mysql://localhost:3306/shivamdb"
                         user="root" password="Verma"/>


      <sql:update dataSource="${dbSource}" var="dbResult">
         INSERT INTO address(id, fname, lname, phone, email)
            VALUES (?,?,?,?,?);
         <sql:param value="${param.id}" />
         <sql:param value="${param.fname}" />
         <sql:param value="${param.lname}" />
         <sql:param value="${param.phone}" />
         <sql:param value="${param.email}" />
      </sql:update>
      <c:if test="${dbResult>=1}">
         <c:redirect url="index.jsp" >
            <c:param name="msg" value="1 record inserted" />
         </c:redirect>
      </c:if>
</body>
</html>