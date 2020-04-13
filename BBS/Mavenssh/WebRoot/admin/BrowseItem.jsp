<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<link rel="stylesheet" href="inc/css.css" type="text/css" />
</head>
<body>
<form name="form1" method="post" action="">
  <table width="600" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=18 style="height: 23px">浏览栏目</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="18" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td align="center" class="txlHeaderBackgroundAlternate">栏目ID</td>
        <td align="center" class="txlHeaderBackgroundAlternate">栏目名称</td>
        <td align="center" class="txlHeaderBackgroundAlternate">栏目介绍</td>
        <td align="center" class="txlHeaderBackgroundAlternate">栏目版主</td>
        <td align="center" class="txlHeaderBackgroundAlternate">删除栏目</td>
      </tr>
   <s:if test="items.isEmpty()">
		<tr bgcolor="#DEE5FA"><td colspan="5">暂无任何用户记录!</td></tr>
	</s:if>
	<s:else>      
	<s:iterator value="items" var="item">
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow">${item.itemID}</td>
        <td align="center" class="txlrow">${item.itemName}</td>
        <td align="center" class="txlrow">${item.itemDescription}</td>
        <td align="center" class="txlrow">
        
        	<s:if test="null == #attr.item.manager">暂时没有版主</s:if>
        	<s:else>
        		${item.manager.username}
        	</s:else>
        	</td>
        <td align="center" class="txlrow"><a href="itemDelete?itemID=${item.itemID}">删除</td>
      </tr>
    </s:iterator>
    </s:else>
      <tr bgcolor="#DEE5FA">
        <td colspan="18" align=center bgcolor="#DEE5FA" class=txlrow>&nbsp;</td>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan=18 align=center class=txlrow></td>
      </tr>
	</tbody></table>
</FORM>
</BODY>
  </HTML>