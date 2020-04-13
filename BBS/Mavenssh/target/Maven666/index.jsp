<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: 上午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>烟大BBS论坛</title>

	<link rel="stylesheet" type="text/css" href="css/style_1_common.css">
<body>
<DIV class=wrap>
<%@include file="head.jsp"%>
		<DIV class=ad_text id=ad_text></DIV>
		<s:iterator value="map" var="oneItem">
		<!--
			Filter统计网页访问数
			数据分页显示
			Ajax实现用户名重复检测 局部刷新页面
			异步实现上传文件进度条
			-->
		<div class="mainbox forumlist">
			<span class="headactions">
								<img src="image/collapsed_no.gif" alt="收起/展开" name="category_1_img" width="8" height="9" id="category_1_img" title="收起/展开" onclick="toggle_collapse('category_1');"/>			</span>
			<h3 align="left"><s:property value="#attr.oneItem.key.itemName"/></h3><!--栏目标题-->
				<table border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td width="10%">&nbsp;</td>
					<td width="79%"><s:property value="#attr.oneItem.key.itemDescription"/></td><!--栏目--><!--栏目介绍-->
					<td width="11%"><span class="moderators">栏目版主: <s:property value="#attr.oneItem.key.manager.username"/></span></td><!--栏目版主-->
				  </tr>
				</table>

			<table id="category_1" summary="category1" style="" cellpadding="0" cellspacing="0">
				<thead class="category">
					<tr>
						<th>子栏目</th>
						<td class="nums">帖子数目</td>
						</tr>
				</thead>
				
				<s:iterator value="#attr.oneItem.value" var="ontItems">
				<!--子栏目-->
				<tbody id="forum38">
						<tr>
							<th class="new">
							<h2><a href="showAllTopic.action?subItemID=<s:property value='#attr.ontItems.subItemID'/>&currentPage=1"><s:property value="#attr.ontItems.subItemName"/></a></h2><!--子栏目标题-->
							<p><s:property value="#attr.ontItems.itemDescription"/></p><!--子栏目介绍-->
							<p class="moderators">版主: <s:property value="#attr.ontItems.manager.username"/></p>	<!--子栏目版主-->	
							</th>
							<td class="nums"><s:property value="#attr.ontItems.topics.size()"/></td>
						</tr>
				</tbody>
				</s:iterator>
		  </table>
 		</div>
 		</s:iterator>
  		<!--栏目-->
</div>
<%@include file="foot.jsp"%>
</body></html>