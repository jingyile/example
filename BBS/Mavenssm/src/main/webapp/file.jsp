<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-6-16
  Time: 下午1:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<body>
<form action="gotoAction" enctype="multipart/form-data" method="post">
    <table>
        <tr>
            <td>请选择文件：</td>
            <td><input type="file" name="file"></td>
        </tr>
        <tr>
            <td>开始上传</td>
            <td><input type="submit" value="上传"></td>
        </tr>
    </table>
</form>
</body>
</html>