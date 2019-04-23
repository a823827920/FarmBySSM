<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/13
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/register.css" />
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/layui/layui.js" charset="utf-8"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <title></title>
</head>
<script>
    $(document).ready(function() {

        layui.use('layer', function() {
            var layer = layui.layer;
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            $("#tel_register").click(function() {
                parent.layer.open({
                    type: 2,
                    title: false,
                    skin: 'layui-layer-molv',
                    area: ['565px', '500px'],
                    offset: 'auto',
                    closeBtn: 2,
                    id: 'layerDemo1',
                    anim: 5,
                    content: '${pageContext.request.contextPath}/user/register_tel'
                });
                parent.layer.close(index); //再执行关闭
            })
            $("#email_register").click(function(){
                parent.layer.open({
                    type: 2,
                    title: false,
                    skin: 'layui-layer-molv',
                    area: ['570px', '380px'],
                    offset: 'auto',
                    closeBtn: 2,
                    id: 'layerDemo1',
                    anim: 5,
                    content: '${pageContext.request.contextPath}/user/register_email'
                });
                parent.layer.close(index); //再执行关闭
            })
            $("#tologin").click(function(){
                parent.layer.style(index,{width:'565px',height: '500px'});
                parent.layer.iframeSrc(index, '${pageContext.request.contextPath}/user/login');//记得要加parent
            })
        });
    });
</script>
<body>
<div class="conta">
    <div class="title">
        <span>注册云种田账号</span>
        <span>已有账号？<label id="tologin">登录</label></span>
    </div>
    <div class="tel_register" id="tel_register"><img src="${pageContext.request.contextPath}/statics/image/tel.png" />手机号注册</div>
    <div class="email_register" id="email_register"><img src="${pageContext.request.contextPath}/statics/image/email.png" />邮箱注册</div>
</div>
</body>
</html>
