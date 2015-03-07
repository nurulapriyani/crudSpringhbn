<%-- 
    Document   : editmhs
    Created on : Mar 7, 2015, 9:07:44 PM
    Author     : nurul apriyani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/resources/bootstrap.css" rel="stylesheet" >
        <title>Add Mahasiswa</title>
    </head>
    <body>
        
        <div align="center" width="500px">
        <form:form method="post" action="${pageContext.request.contextPath}/editmhs" commandName="mahasiswa">
            <h2>Edit Data</h2>
            <a href="${pageContext.request.contextPath}/"  class="btn">List Mahasiswa</a><br/></br/>
            <% if(request.getAttribute("msg")!=null)out.print("<div class='alert alert-success' role='alert'>"+(String)request.getAttribute("msg")+"</div>");%>
            <form:input path="id" type="hidden" read-only="true"/>
            <table>
                <tr>
                    <td>NPM</td>
                    <td><form:input path="npm" /></td>
                </tr>
                <tr>
                    <td>Nama</td>
                    <td><form:input path="nama" /></td>
                </tr>
                 <tr>
                    <td>Tanggal Lahir</td>
                    <td><form:input path="tgl_lahir" type="date"/></td>
                </tr>
                 <tr>
                    <td>Jenis Kelamin</td>
                    <td><form:radiobutton path="jk" value="L"/>L <form:radiobutton path="jk" value="P"/>P</td>
                </tr>
                 <tr>
                    <td>Alamat</td>
                    <td><form:textarea path="alamat" /></td>
                </tr>
                 <tr>
                     <td><form:button type="submit" value="Edit Record" name="action" class="btn">Edit Record</form:button></td>
                    <td></td>
                </tr>
            </table>
        </form:form>
        </div>
    </body>
</html>
