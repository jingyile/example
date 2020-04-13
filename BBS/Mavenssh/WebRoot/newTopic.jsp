<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: 上午10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<HEAD><TITLE>发表新帖</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gbk">
<LINK href="css/style_1_editor.css" type=text/css rel=stylesheet>
<LINK href="css/style_1_common.css" type=text/css rel=stylesheet>
</HEAD>
<BODY>
<DIV class=wrap>
<DIV id=header>
</DIV>
<DIV id=menu><SPAN class=avataonline>
</SPAN></DIV>
<DIV id=nav><a href="showAllTopic.action?subItemID=${param.subItemID}">返回帖子列表页面</a></DIV>
<LINK href="bbs4_files/style_1_viewthread.css" type=text/css rel=stylesheet>
<DIV class="mainbox viewthread" id=previewtable style="DISPLAY: none">
<TABLE cellSpacing=0 cellPadding=0 >
  <TBODY>
  <TR>
    <TD class=postauthor><s:actionmessage></s:actionmessage><TD>
    <TD class=postcontent>
      <DIV class=postmessage id=previewmessage>
      <H2></H2></DIV></TD></TR></TBODY></TABLE></DIV><BR>
<FORM id=postform action="topicAdd.action" method="post">
  <DIV class="mainbox formbox">
<TABLE id=newpost cellSpacing=0 cellPadding=0 summary=post>
  <THEAD>
  <TR>
    <TH>用户名</TH>
    <TD>${username}</TD>
    <input type="hidden" name="username" value="${username}"/>
    <input type="hidden" name="subItemID" value="${param.subItemID}"/>
  </TR></THEAD>
  <TR>
    <TH style="BORDER-BOTTOM-WIDTH: 0px"><LABEL for=subject>标题</LABEL></TH>
    <TD style="BORDER-BOTTOM-WIDTH: 0px">
    <INPUT id=subject tabIndex=3 size=45 name="title"> </TD></TR>
  <TBODY id=threadtypes></TBODY>
  <TBODY>
  <TR>
    <TH vAlign=top>
      <%--@declare id="posteditor_textarea"--%><LABEL for=posteditor_textarea>内容 </LABEL></TH>
    <TD vAlign=top><TABLE class=editor_text style="TABLE-LAYOUT: fixed" cellSpacing=0 
      cellPadding=0 summary="Message Textarea">
        <TBODY>
        <TR>
          <TD>
            <INPUT id=subject tabIndex=3 size=45 name="content">
<%--          <FCK:editor instanceName="content" basePath="/fckeditor" toolbarSet="myToolbar" height="840"></FCK:editor>--%>
          </TD></TR></TBODY></TABLE>
</TD></TR>
  <THEAD>
  <TR>
    <TH>&nbsp;</TH>
    <TD><LABEL></LABEL></TD></TR></THEAD>
  <TBODY id=adv style="DISPLAY: none"></TBODY>
  <TBODY>
  <TR class=btns>
    <TH>&nbsp;</TH>
    <TD><BUTTON 
      id=postsubmit tabIndex=300 name=topicsubmit type=submit 
      value="true">发表新帖</BUTTON> </TD></TR></TBODY></TABLE>
  </DIV><BR></FORM>
  <%@include file="foot.jsp"%>
</BODY></HTML>
