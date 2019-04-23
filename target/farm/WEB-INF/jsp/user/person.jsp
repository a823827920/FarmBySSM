<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/18
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/index.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/personSet.css" />
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/toggle.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/index.js"></script>
    <script>
        layui.use('element', function() {
            var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
            //监听导航点击
            element.on('nav(demo)', function(elem) {
                //console.log(elem)
                layer.msg(elem.text());
            });
        });
    </script>
</head>
<body>
<div class="to_space">
    <div class="hover_menu">
        <label>首页</label>
        <hr>
        <label>个人资料</label>
        <hr>
        <label>商店</label>
        <label>植物日志</label>
        <label>游记</label>
        <hr>
        <label>商务云种田</label>
    </div>
    <div class="layui-fluid pad0">
        <div class="layui-row">
            <div class="down_menu layui-hide-md layui-hide-sm"><i id="cl" class="layui-icon layui-icon-down"></i></div>
            <div class="hover_back"></div>
            <div class="search_box">
                <form action="${pageContext.request.contextPath}/user/search">
                    <label><i class="layui-icon layui-icon-search search_to"></i><input class="place" name="plantName" type="text" placeholder="搜“樱桃树”试试" /></label>
                </form>
            </div>

            <div class="layui-row layui-col-space30 head_menu layui-hide-xs">
                <label>首页</label>
                <label>商店</label>
                <label>植物日志</label>
                <label>游记</label>
                <c:if test="${user==null}">
                    <label id="login">登录</label>
                    <label id="register">注册</label>
                </c:if>
                <c:if test="${user!=null}">
                    <label class="tx" style="display: inline-block;background-image: url(/file/${user.userImg})"></label>
                </c:if>
            </div>
            <div class="tx_downmenu layui-hide-xs">
                <label><a href="${pageContext.request.contextPath}/user/person">个人资料</a></label>
                <hr>
                <label><a href="javascript:;">植物日志</a></label>
                <hr>
                <label><a href="javascript:;">我的仓库</a></label>
                <hr>
                <label><a href="${pageContext.request.contextPath}/user/logOut">退出</a></label>

            </div>
            <div class="tx_downmenu layui-hide-xs">
                <label><a href="${pageContext.request.contextPath}/user/person">个人资料</a></label>
                <hr>
                <label><a href="javascript:;">植物日志</a></label>
                <hr>
                <label><a href="javascript:;">我的仓库</a></label>
                <hr>
                <label><a href="${pageContext.request.contextPath}/user/logOut">退出</a></label>

            </div>
        </div>
    </div>
</div>



<div class="layui-container">
    <div class="rightDiv">
        <div class="layui-tab layui-tab-brief" lay-fier="doltcDemoTabBrief">
            <ul class="layui-tab-title">
                <li class="layui-this">我的资料</li>
                <li>头像</li>
                <li>密码</li>
            </ul>
            <div class="layui-tab-content">
                <!-- 我的资料 -->
                <div class="layui-tab-item layui-show">
                    <form class="layui-form" action="">
                        <input type="hidden" value="${user.userId}" name="userId">
                        <div class="layui-form-item layui-inline">
                            <label class="layui-form-label">昵称</label>
                            <div class="layui-input-block">
                                <input type="text" value="${user.userName}" name="userName" required lay-verify="username" placeholder="请输入标题" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <div class="layui-form-item">
                                <label class="layui-form-label">绑定手机号</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="userTel" value="${user.userTel}" lay-verify="required|phone" autocomplete="off" disabled="disabled"  class="layui-input">
                                </div>
                                <div class="layui-form-mid layui-word-aux">不可修改</div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">验证邮箱</label>
                                <div class="layui-input-inline">
                                    <input type="text"   name="userEmail" value="${user.userEmail}" lay-verify="email" disabled="disabled"  autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid layui-word-aux">不可修改</div>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">性别</label>
                            <div class="layui-input-block">
                                <c:if test="${user.userSex=='男'}">
                                    <input type="radio" name="userSex" value="男" title="男" checked>
                                    <input type="radio" name="userSex" value="女" title="女">
                                </c:if>
                                <c:if test="${user.userSex=='女'}">
                                    <input type="radio" name="userSex" value="男" title="男" >
                                    <input type="radio" name="userSex" value="女" title="女" checked>
                                </c:if>
                            </div>
                        </div>
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">个性签名</label>
                            <div class="layui-input-block">
                                <textarea name="userDes" placeholder="请输入内容" class="layui-textarea">${user.userDes}</textarea>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" lay-submit lay-filter="formDemo">确认修改</button>
                            </div>
                        </div>
                    </form>
                </div>
                <!-- end -->
                <!-- 头像 -->
                <div class="layui-tab-item">
                    <div class="upload_img">
                        <button type="button" class="layui-btn" id="test2">
                            <i class="layui-icon">&#xe67c;</i>上传图片
                        </button>
                        <p>建议尺寸168*168，支持jpg、png、gif，最大不能超过50KB</p>
                        <span><img src="/file/${user.userImg}" id="demo1" /></span>
                        <form class="layui-form" action="">
                            <input type="hidden" value="${user.userId}" name="userId">
                            <input type="hidden" name="userImg">
                            <button class="layui-btn" lay-submit="" lay-filter="formDemo1" style="margin-top:10px;">保存头像</button>
                        </form>
                    </div>
                </div>
                <!-- end -->
                <!-- 密码 -->
                <div class="layui-tab-item">
                    <form class="layui-form" action="">
                        <input type="hidden" value="${user.userId}" name="userId">
                        <div class="layui-form-item">
                            <label class="layui-form-label">请输入密码</label>
                            <div class="layui-input-inline">
                                <input type="password" name="userPassword" id='pas' required lay-verify="pass" placeholder="请输入密码" autocomplete="off"
                                       class="layui-input">
                            </div>
                            <div class="layui-form-mid layui-word-aux">请填写6-16个字符</div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">确认密码</label>
                            <div class="layui-input-inline">
                                <input type="password" name="userPassword" id='repas' required lay-verify="repas" placeholder="请输入密码"
                                       autocomplete="off" class="layui-input">
                            </div>
                            <div class="layui-form-mid layui-word-aux">请填写6-16个字符</div>
                        </div>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" lay-submit lay-filter="formDemo2">确认修改</button>
                            </div>
                        </div>
                    </form>
                </div>
                <!-- end -->
            </div>
        </div>
    </div>
</div>
<hr class="hr" />
<div class="layui-container space">
    <div class="foot layui-row layui-hide-xs">
        <div class="layui-col-md3">
            <label>云种田</label>
            <ul>
                <li>工作机会</li>
                <li>线下组织</li>
                <li>经济联动</li>
                <li>政策</li>
            </ul>
        </div>
        <div class="layui-col-md3">
            <label>发现</label>
            <ul>
                <li>信任与安全</li>
                <li>种植基金</li>
                <li>种植指南<label class="new">New</label></li>
                <li>云种田助手</li>
            </ul>
        </div>
        <div class="layui-col-md3">
            <label>租赁</label>
            <ul>
                <li>劳动力<label class="new">New</label></li>
                <li>小时工</li>
                <li>承包土地</li>

            </ul>
        </div>
        <div class="layui-col-md3">
            <label><img src="${pageContext.request.contextPath}/statics/image/wb.png" /><img src="${pageContext.request.contextPath}/statics/image/wechat.png" /></label>
            <ul>
                <li>分享<label class="new">New</label></li>
                <li>收获</li>

            </ul>
        </div>
    </div>
</div>
<hr class="hr" />
<div class="Copyright">Copyright ©2019 author-佚名</div>
<script>
    layui.use('upload', function() {
        var upload = layui.upload;
        //执行实例
        var uploadInst = upload.render({
            elem: '#test2', //绑定元素,
            url: '${pageContext.request.contextPath}/file/upload', //上传接口
            before: function(obj){
            //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            },
            done: function(res) {
                //上传完毕回调
                $("[name=userImg]").val(res.data);
                //如果上传失败
                if(res.code > 0){
                    return layer.msg('上传失败');
                }
            },
            error: function() {
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function(){
                    uploadInst.upload();
                });
            }
        });
    });
</script>
<script>
    //Demo
    layui.use('form', function() {
        var form = layui.form;
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
                }
            },
            pass: [
                /^[\S]{6,12}$/, '密码必须6到12位，且不能出现空格'
            ]
        });
        //监听提交
        form.on('submit(formDemo)', function(data) {
            //layer.msg(JSON.stringify(data.field));
            $.ajax({
                url:'${pageContext.request.contextPath}/user/',
                type:'post',
                contentType:'application/json',
                data:JSON.stringify(data.field),
                success:function (data) {
                    if(data==1){
                        layer.msg('修改成功',{icon:6});
                    }else {
                        layer.msg('修改失败',{icon:5});
                    }
                }
            })
            return false;
        });
        form.on('submit(formDemo1)', function(data) {
            //layer.msg(JSON.stringify(data.field));
            $.ajax({
                url:'${pageContext.request.contextPath}/user/',
                type:'post',
                contentType:'application/json',
                data:JSON.stringify(data.field),
                success:function (data) {
                    if(data==1){
                        layer.msg('修改成功',{icon:6});
                        window.location.reload();
                    }else {
                        layer.msg('修改失败',{icon:5});
                    }
                }
            })
            return false;
        });
        form.on('submit(formDemo2)', function(data) {
            $.ajax({
                url:'${pageContext.request.contextPath}/user/',
                type:'post',
                contentType:'application/json',
                data:JSON.stringify(data.field),
                success:function (data) {
                    if(data==1){
                        layer.msg('修改成功',{icon:6});
                    }else {
                        layer.msg('修改失败',{icon:5});
                    }
                }
            })
            return false;
        });
    });
</script>
<script>
    //注意：选项卡 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function() {
        var element = layui.element;
        //…
    });
</script>
</div>
</div>
</body>
</html>
