<%-- 
    Document   : listmhs
    Created on : Feb 22, 2015, 3:51:15 PM
    Author     : nurul apriyani
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/resources/bootstrap.css" rel="stylesheet" >
        <title>List Mahasiswa</title>
    </head>
    <body>
        <br/><br/>
        <div class="container">
            <a href="${pageContext.request.contextPath}/addmhs" class="btn btn-primary">Add Record</a><br/><br/>

            <table class="table table-striped table-bordered">
                <tr> 
                    <th>No.</th>
                    <th>NPM</th>
                    <th>Nama</th>
                    <th>Tgl Lahir</th>
                    <th>Jenis Kelamin</th>
                    <th>Alamat</th>
                    <th>Action</th>
                </tr>
                <% int i=1;%>
            <c:forEach items="${mahasiswa}" var="row">
                <tr>
                    <td><% out.print(""+i++); %></td>
                    <td> <c:out value="${row.npm}"/> </td>
                    <td> <c:out value="${row.nama}"/> </td>
                    <td> <c:out value="${row.tgl_lahir}"/>
                    <td> <c:out value="${row.jk}"/>
                    <td> <c:out value="${row.alamat}"/>
                    <td> <a href="${pageContext.request.contextPath}/editmhs?id=<c:out value="${row.id}"/>"> Edit</a>
                         <a href="${pageContext.request.contextPath}/deletemhs?id=<c:out value="${row.id}"/>" onclick="return confirm('do you really want to delete this record?')" style="color:red"> Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </table>
        </div>
    </body>
</html>
