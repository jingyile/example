<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="Content-Type"  content="text/html;charset=utf-8">
    <meta name="keywords" content="Genesis,论坛,社区,程序员">
    <title>YTUBBS - 烟大BBS论坛  </title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="/js/jquery-3.2.1.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/style_1_common.css">
    <style>
        li {list-style-type:none;}
        html, body {
            height: 100%;
            font-size: 14px;
            color: #525252;
            font-family: NotoSansHans-Regular,AvenirNext-Regular,arial,Hiragino Sans GB,"Microsoft Yahei","Hiragino Sans GB","WenQuanYi Micro Hei",sans-serif;
            background: #f0f2f5;
        }
        .footer {
            background-color: #fff;
            margin-top: 22px;
            margin-bottom: 22px;
            width: 100%;
            padding-top: 22px;
            color: #8A8A8A;
            display: block;
            height: 200px;
            border: 1px ;
            clear:both
        }

        .container {
            margin-right: 5%;
            margin-left: 5%;
            padding-left: 15px;
            padding-right: 15px;
            width: 40%;
            float: left;
        }
        .info {
            margin-right: 5%;
            width: 10%;
            float: left;
        }
        a{
            color: #8A8A8A;
            cursor: pointer;
        }
    </style>
</head>
<body>
<!-- 引入header文件 -->
<%@ include file="header.jsp"%>
<div class="mainbox forumlist">
			<span class="headactions">
				<SPAN class=postbtn id=newspecialtmp >
<a href="new"><IMG src="/img/newtopic0.gif" alt=发表新帖 width="84" height="29"></a></SPAN>
		</span>
    <h3 align="left">计算机与控制工程学院</h3><!--栏目标题-->
    <table border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td width="10%">&nbsp;</td>
            <td width="79%">计控英才,编译未来！</td><!--栏目--><!--栏目介绍-->
            <td width="11%"><span class="moderators">栏目版主: 景怡乐</span></td><!--栏目版主-->
        </tr>
    </table>

    <table id="category_1" summary="category1" style="" cellpadding="0" cellspacing="0">
        <thead class="category">
        <tr>
            <th>帖子主题</th>
            <td class="nums">帖子回复</td>
        </tr>
        </thead>
                <c:forEach items="${topics}" var="topic">
                    <!--子栏目-->
                    <tbody id="forum38">
                    <tr>
                        <th class="new">
                            <div style="height: 50px">
                                <div style="width: 89%;float: left">
                                    <a href="/t/${topic.id}">${topic.title}</a><br/>
                                    <div>
                                        <a><span class="label label-default" >${topic.tab.tabName}</span></a>&nbsp;&nbsp;&nbsp;
                                        <a href="/member/${topic.user.username}"><span ><strong>${topic.user.username}</strong></span></a>&nbsp;&nbsp;&nbsp;
                                        <small class="text-muted">${topic.localCreateTime}</small>
                                    </div>
                                </div>
                            </div>
                        </th>
                        <td class="nums"> <span class="badge">${topic.countReplies}</span></td>
                    </tr>
                    </tbody>
                    </c:forEach>
            </table>
        </div>


</ul>

</div>
<%@ include file="footer.jsp"%>
</body>
</html>