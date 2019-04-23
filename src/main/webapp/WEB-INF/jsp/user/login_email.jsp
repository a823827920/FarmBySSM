<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/15
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/register.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/login.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/layui/layui.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
</head>
<script>
    $(document).ready(function() {
        $("#submit").click(function(){
            $("#sub").click();
        });
        layui.use(['layer','form'], function() {
            var layer = layui.layer;
            var form=layui.form;
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            //parent.layer.iframeAuto(index) ;//高度自适应,经测试并他么没什么用
            $("#other_login1").click(function() {
                parent.layer.iframeSrc(index, '${pageContext.request.contextPath}/user/login');//记得要加parent

            })
            $("#toregister").click(function() {
                parent.layer.style(index,{width:'570px',height: '300px'});
                parent.layer.iframeSrc(index, '${pageContext.request.contextPath}/user/register');//记得要加parent

            })
            form.verify({
                pass: [
                    /^[\S]{6,12}$/, '密码必须6到12位，且不能出现空格'
                ]
            })
            form.on('submit(formDemo)', function(data) {
                $.ajax({
                    url:"${pageContext.request.contextPath}/user/loginEmail",
                    type:"post",
                    data: JSON.stringify(data.field),
                    contentType: 'application/json',
                    success:function (data) {
                        if(data>=1){
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                            parent.location.href="${pageContext.request.contextPath}/index";
                        }else{
                            $("#checkCode").html("密码错误！");
                        }
                    }
                })
                return false;
            });

        });
    });

</script>
<body>
<div class="container">
    <div class="title">
        <span>登录云种田</span>
        <span>还没有账号？<label id="toregister">注册</label></span>
    </div>
    <div class="tel_register" id="other_login1"><img src="${pageContext.request.contextPath}/statics/image/tel.png" />手机号登录</div>
    <br>
    <hr>
    <br>
    <form id="form" action="" class="layui-form">
        <input lay-verify="required|email" type="email"  name="userEmail"  placeholder="电子邮箱地址" />
        <input type="password" lay-verify="required|pass" name="userPassword" placeholder="密码" />
        <p id="checkCode" style="top:314px;left: 424px"></p>
        <input type="submit" id="sub" style="display:none;" lay-submit lay-filter="formDemo" />
    </form>
    <div class="email_register" id="submit"><img src="${pageContext.request.contextPath}/statics/image/email.png" />登录</div>
</div>
</body>
</html>
