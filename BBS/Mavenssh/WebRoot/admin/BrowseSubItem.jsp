<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<link rel="stylesheet" href="inc/css.css" type="text/css" />
	<script type="text/javascript">
		function submitForm(){
			var frm=document.subItemForm;
			frm.submit();
		}
	</script>
</head>
<body>
  <table width="600" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
      <tr>
        <th align=center colspan=18 style="height: 23px">浏览子栏目</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="18" align="center" class=txlrow><div align="right">
         <form name="subItemForm" action="findAllSubItem.action" method="post">  
          请选择栏目：
          <select name="titemID" onchange="submitForm()">
          	<option value="0">
          		请选择版块!
          	</option>
          	<s:iterator value="items" var="item">
            	<option value="${item.itemID}"
            	<s:if test="#attr.item.itemID == titemID">selected</s:if>
            	>${item.itemName}</option>
             </s:iterator>
          </select>
        </form>  
          </div></td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td align="center" class="txlHeaderBackgroundAlternate">子栏目ID</td>
        <td align="center" class="txlHeaderBackgroundAlternate">子栏目名称</td>
        <td align="center" class="txlHeaderBackgroundAlternate">子栏目介绍</td>
        <td align="center" class="txlHeaderBackgroundAlternate">子栏目版主</td>
        <td align="center" class="txlHeaderBackgroundAlternate">删除子栏目</td>
      </tr>
   
   	<s:if test="subItems.isEmpty()">
		<tr bgcolor="#DEE5FA"><td colspan="5">暂无任何子版块记录!</td></tr>
	</s:if>
	<s:else>      
	<s:iterator value="subItems" var="subItem">
      <tr bgcolor="#DEE5FA">
        <td align="center" class="txlrow">${subItem.subItemID}</td>
        <td align="center" class="txlrow">${subItem.subItemName}</td>
        <td align="center" class="txlrow">${subItem.itemDescription}</td>
        <td align="center" class="txlrow">
        	<s:if test="null == #attr.subItem.manager">暂时没有版主</s:if>
        	<s:else>
        		${subItem.manager.username}
        	</s:else>
        </td>
        <td align="center" class="txlrow">
        	<a href="subItemDelete.action?subItemID=${subItem.subItemID}">删除</a>
        </td>
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
</BODY>
  </HTML>