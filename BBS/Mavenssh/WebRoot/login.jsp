<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: 上午10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=x-gbk">
<META http-equiv=Content-Type content="text/html; charset=gbk"/>
<LINK href="css/style_1_editor.css" type=text/css rel=stylesheet/>
<LINK href="css/style_1_common.css" type=text/css rel=stylesheet>
</HEAD>
<BODY>
<DIV class=wrap>
<DIV id=header>
</DIV>
<DIV id=menu><SPAN class=avataonline>
</SPAN></DIV>
<DIV id=nav><a href="goIndex.action">返回首页</a>&nbsp&nbsp<a href="register.jsp">前往注册</a></DIV>

<LINK href="bbs4_files/style_1_viewthread.css" type=text/css rel=stylesheet>
<DIV class="mainbox viewthread" id=previewtable style="DISPLAY: none">
<TABLE cellSpacing=0 cellPadding=0 >
  <TBODY>
  <TR>
    <TD class=postauthor><s:actionmessage></s:actionmessage><TD>
    <TD class=postcontent>
      <DIV class=postmessage id=previewmessage>
      <H2></H2></DIV></TD></TR></TBODY></TABLE></DIV><BR>
<DIV class="mainbox formbox">
<form name="form1" method="post" action="login.action">
<TABLE id=newpost cellSpacing=0 cellPadding=0 summary=post>
	<thead>
	<TR>
    <TD colspan="2"><font color="red" size="4"><s:actionmessage/></font></TD>
  	</TR>
  	</thead>
  <TR>
    <TH>用户名</TH>
    <TD><input type="text" name="username" value="${request.username}"></TD>
  </TR>
  <TR>
	<TH>密码</TH>
    <TD><input type="password" name="password"></TD>
  </TR>
    <TH>验证码：</TH>
    　<TD><input type="text" name="checkCode"></TD>　　
    　　　　　<!--若要点击图片刷新，重新得到一个验证码，要在后面加上个随机数，这样保证每次提交过去的都是不一样的path，防止因为缓存而使图片不刷新-->
    <img src="createImageAction.action" width="100px" style="margin-left: 100px" onclick="this.src='createImageAction.action?'+ Math.random()" title="点击图片刷新验证码"/><br>
    <s:actionerror cssStyle="color:red"/>
     <TR>
	      <TD colspan="2" align="center"><input type="submit" value="登录">
          <input type="reset"  value="重置"></TD>
  </TR>
</TABLE>
</form>
</DIV>
    <%@include file="foot.jsp"%>
</BODY></HTML>
