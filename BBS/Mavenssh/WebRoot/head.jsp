<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: 上午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style_1_common.css">
    <script>
		var flag=true;
        function kill()
        {
            alert("请重新登录!");
			window.location="login.jsp";
		}
		function admin() {
			alert("目前未备份数据,请您谨慎操作");
			window.location="admin.jsp";
		}
		function admin0() {
			alert("欢迎尊贵的管理员用户！");
		}
    </script>
</head>
<body>
<DIV id=menu><SPAN class=avataonline>
			欢迎光临烟大BBS论坛!<br>
		<s:if test="#session.username != null">您是本站的第【
			<%=application.getAttribute("count") %>
			】位访客！
			<br>
            当前登录账户名：${username}
			<button onclick="kill()">切换用户</button>
			<s:if test="#session.username=='admin'">
				<script>
					if(flag==true)//只在首次登录时提示即可
					{
						alert("欢迎您,尊贵的管理员用户！");
						flag=false;
					}
				</script>
				<button onclick="admin()">管理员专属，谨慎进入！</button>
			</s:if>
        </s:if>
		<s:else>
			<A href="register.jsp">注册</A>
			<A href="login.jsp">登录</A>
			<a href="goIndex">以游客身份访问</a><br>
			<a href="file.jsp">文件上传演示</a>
		</s:else>

		</SPAN>
</DIV>
</body>
</html>
