<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/13
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/register.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/login.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/layui/layui.js" charset="utf-8"></script>
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
            $("#other_way").click(function() {
                parent.layer.style(index,{height: '500px'});//改变弹出层的大小,配合下面的改变路径的话其实可以做到弹出层上点击弹出另一个弹出层的
                parent.layer.iframeSrc(index, '${pageContext.request.contextPath}/user/register_tel');//记得要加parent

            })
            $("#tologin").click(function(){
                parent.layer.style(index,{width:'565px',height: '500px'});
                parent.layer.iframeSrc(index, '${pageContext.request.contextPath}/user/login');//记得要加parent
            })

            form.verify({
                username: function(value, item) { //value：表单的值、item：表单的DOM对象
                    if (!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)) {
                        return '用户名不能有特殊字符';
                    }
                    if (/(^\_)|(\__)|(\_+$)/.test(value)) {
                        return '用户名首尾不能出现下划线\'_\'';
                    }
                    if (/^\d+\d+\d$/.test(value)) {
                        return '用户名不能全为数字';
                    }
                    if (value.length < 3) {
                        return '至少3个字符';
                    }
                }

                //我们既支持上述函数式的方式，也支持下述数组的形式
                //数组的两个值分别代表：[正则匹配、匹配不符时的提示文字]
                ,
                repas: function(value) {
                    if ($('#pas').val() != value) {

                        return '两次输入密码不相符';
                    } else {

                        alert('没反应');
                    }
                },
                pass: [
                    /^[\S]{6,12}$/, '密码必须6到12位，且不能出现空格'
                ]

            });

            //监听提交
            form.on('submit(formDemo)', function(data) {
                //layer.msg(JSON.stringify(data.field));
                var info1=$("#isSameEmail").html();
                $.ajax({
                    url:"${pageContext.request.contextPath}/user/submit",
                    type:"post",
                    data: JSON.stringify(data.field),
                    contentType: 'application/json',
                    success:function (data) {
                        if(data==1&&info1==""){
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                            parent.location.href="${pageContext.request.contextPath}/index";
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
        <span>邮箱注册</span>
        <span>已有账号？<label id="tologin">登录</label></span>
    </div>
    <form class="layui-form">
        <input type="email" id="email" name="userEmail"  lay-verify="required|email" placeholder="邮箱地址" />
        <p id="isSameEmail"></p>
        <input type="password" name="userPassword" lay-verify=" required|pass placeholder="设置密码" />
        <input type="submit" lay-submit lay-filter="formDemo" id="sub" style="display:none;" />
    </form>
    <div class="tel_register"  id="submit"><img src="${pageContext.request.contextPath}/statics/image/email.png" />注册</div>
    <div class="other_way" id="other_way">使用手机号注册</div>
</div>
<script>
    $("#email").keyup(function () {
        var email=this.value;
        $.ajax({
            url:"${pageContext.request.contextPath}/user/isSameEmail",
            type:"get",
            data: {
                email:email
            },
            success:function (data) {
                if(data==0){
                    $("#isSameEmail").html("");
                }else{
                    $("#isSameEmail").html("该邮箱已被注册");
                }
            }
        })
    })
</script>
</body>
</html>
