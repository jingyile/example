<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: 上午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<HEAD><TITLE>注册新用户</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312"/>
<LINK href="css/style_1_editor.css" type=text/css rel=stylesheet/>
<LINK href="css/style_1_common.css" type=text/css rel=stylesheet>
    <script type="text/javascript">
        function getXhr(){
            var xhr;
            if(window.XMLHttpRequest){
                xhr = new XMLHttpRequest();
            }else{
                xhr = new ActiveXObject("Microsoft.XMLHTTP");
            }
            return xhr;
        };
    </script>
    <script type="text/javascript">
        function checkname(){
            var name = document.getElementById("username").value;
            var xhr = getXhr();
            xhr.open("post","check.do");
            xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
            xhr.onreadystatechange=function(){
                if(xhr.readyState==4&&xhr.status==200){
                    var msg = xhr.responseText;
                    document.getElementById("username_msg").innerHTML=msg;
                }
            };
            xhr.send("name="+name);
            document.getElementById("username_msg").innerHTML="正在检测...";
        }
    </script>
</HEAD>
<BODY>
<DIV class=wrap>
<DIV id=header>
</DIV>
<DIV id=menu><SPAN class=avataonline>
</SPAN></DIV>
<DIV id=nav><a href="goIndex.action">返回首页</a></DIV>
<DIV class="mainbox viewthread" id=previewtable style="DISPLAY: none">
<TABLE cellSpacing=0 cellPadding=0 >
  <TBODY>
  <TR>
    <TD class=postauthor><s:actionmessage></s:actionmessage><TD>
    <TD class=postcontent>
      <DIV class=postmessage id=previewmessage>
      <H2></H2></DIV></TD></TR></TBODY></TABLE></DIV><BR>
<DIV class="mainbox formbox">
<s:form name="form1" method="post" action="register" validate="true">
<TABLE id=newpost cellSpacing=0 cellPadding=0 summary=post>
	<thead>
	<TR>
    <TD><s:actionmessage/></TD>
    <TD><font color="red"><s:fielderror>提醒：</s:fielderror></font></TD>
  	</TR>
  	</thead>
  <TR>
    <TH>用户名</TH>
    <TD><input type="text" id="username" name="username" value="${request.username}" onblur="checkname()">
        <span id="username_msg" style="color: blue; size: 16px"></span>
<%--	     <font color="red">*</font>用户名长度为6到15之间</TD>--%>
  </TR>
  <TR>
	<TH>密码</TH>
    <TD><input type="password" name="password">
<%--	    <font color="red">*</font>密码长度为6到15之间</TD>--%>
  </TR>
    <TR>
	<TH>确认密码</TH>
    <TD><input type="password" name="repassword">
<%--          <font color="red">*</font>确认密码长度为6到15之间</TD>--%>
  </TR>
    <TR>
	<TH>性别</TH>
    <TD><select name="sex">
            <option value="0">男</option>
            <option value="1">女</option>
          </select></TD>
  </TR>
    <TR>
	<TH>年龄</TH>
    <TD> <input name="age" type="text" size="10" value="${request.age}"></TD>
  </TR>
    <TR>
	<TH>出生日期</TH>
    <TD><input type="text" name="birthDay"></TD>
  </TR>
   <TR>
	      <TD colspan="2" align="center"><input type="submit" value="注册">
          <input type="reset"  value="重置"></TD>
  </TR>
</TABLE>
</s:form>
</DIV>
    <%@include file="foot.jsp"%>
</BODY></HTML>
