<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: 上午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style_1_common.css">
    <style>

        #menu { height: 100px; border: 1px solid #CAD9EA; background: #FFF url("../WEB-INF/qq.png"); background-repeat: repeat-x; font-size: 14px}
        #menu ul { float: right; padding: 4px 10px 0; border-right: 1px solid #FFF; }
        #menu li { float: left; }
        #menu li a { text-decoration: none; display: block; color: #333; padding: 4px 8px 3px; background: url(../../images/default/menu_itemline.gif) no-repeat 0 6px; }
        #menu li.hover, #menu li.current { background-color: #FFF; border: 1px solid; border-color: #CAD9EA #CAD9EA #FFF; }
        #menu li.current { font-weight: bold; }
        #menu li.hover a { padding: 3px 7px; background-image: none; }
        #menu li.current a { padding: 4px 7px 3px; background-image: none; }
        #menu cite a { font-weight: bold; background-image: none; }
        .frameswitch { float: left; height: 30px; line-height: 30px; padding-left: 10px; }
        #menu a.frameoff, #menu a.frameon { float: left; border: none; padding-left: 16px; margin-left: 0; background: no-repeat 0 50%; }
        #menu a.frameoff { background-image: url(../WEB-INF/qq.png); }
        #menu a.frameon { background-image: url(../WEB-INF/qq.png); }
        .avataonline { float: left; height: 30px; line-height: 30px; border-left: 1px solid #FFF; padding-left: 28px; background: url(/WEB-INF/qq.png) no-repeat 10px 40%; }

        * { word-wrap: break-word; }
        body { background: #FFF; text-align: center; }
        body, td, input, textarea, select, button { color: #000; font: 12px/1.6em Helvetica, Arial, sans-serif; }
        body, ul, dl, dd, p, h1, h2, h3, h4, h5, h6, form, fieldset { margin: 0; padding: 0; }
        h1, h2, h3, h4, h5, h6 { font-size: 1em; }
        #menu li, .popupmenu_popup li, #announcement li, .portalbox li, .tabs li, .postmessage fieldset li, .side li, .formbox li, .notice li { list-style: none; }
        a { color: #000; text-decoration: none; }
        a:hover { text-decoration: underline; }
        a img { border: none; }
    </style>
    <script>
        var flag=true;
        function kill()
        {
            var r=confirm("确定退出?")
            if (r==true)
            {
                window.location.href="/signout";
            }
            //alert("请重新登录!");
            //window.location="/signin";
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
		<c:if test="${!empty userId}">您是本站的第【<%=application.getAttribute("count") %>】位访客！
            <br>
            当前登录账户名：<a href="/settings">${username}</a>
            <button onclick="kill()">退出登录</button>
            <c:if test="${username=='admin'}">
				<script>
					if(flag==true)//只在首次登录时提示即可
                    {
                        alert("欢迎您,尊贵的管理员用户！");
                        flag=false;
                    }
				</script>
                <button onclick="admin()">管理员专属，谨慎进入！</button>
            </c:if>
        </c:if>
	<c:if test="${username==NULL}">
        <A href="/signup">注册</A>
        <A href="/signin">登录</A>
        <a href="/main">以游客身份访问</a><br>
        <a href="../../file.jsp">文件上传演示</a>
    </c:if>
		</SPAN>
</DIV>
</body>
</html>
