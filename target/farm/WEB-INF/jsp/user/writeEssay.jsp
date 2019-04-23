<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/23
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/index.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/essay_write.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/complete_head.css" />
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/toggle.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/index.js"></script>
</head>
<script>
    //Demo
    layui.use(['form','upload'], function(){
        var form = layui.form;
        var upload=layui.upload;
        //监听提交
        form.on('submit(formDemo)', function(data){
            $.ajax({
                url:'${pageContext.request.contextPath}/user/essay',
                type:'post',
                contentType:'application/json',
                data:JSON.stringify(data.field),
                success:function (data) {
                    if(data==1){
                        layer.msg("发布成功！",{icon:6});
                    }else {
                        layer.msg("发布失败！",{icon:5});
                    }
                }
            })
            return false;
        });
        var i=0,flag=0;
        //多图片上传
        upload.render({
            elem: '#upload'
            ,url: '${pageContext.request.contextPath}/file/upload'
            ,multiple: true
            ,before: function(obj){
                //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    if(flag==0)
                    $('#show_pre').append('<div class=add_img_box style=background-image:url('+result+')></div>');
                });
            }
            ,done: function(res){
                if(i==0){$("[id=img1]").val(res.data);i++;}
                else if(i==1){$("[id=img2]").val(res.data);i++;}
                else if(i==2){$("[id=img3]").val(res.data);i=0;flag=1}
                //如果上传失败
                if(res.code > 0){
                    return layer.msg('上传失败');
                }
            }
        });
    });
</script>
<body>
<!------------------------------------- 头部 ------------------------------------------------------->
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
                <form>
                    <label><i class="layui-icon layui-icon-search search_to"></i><input class="place" type="text" placeholder="搜“樱桃树”试试" /></label>
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
                    <label class="tx" style="background-image: url(/file/${user.userImg})"></label>
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
        </div>
    </div>
</div>
<!-------------------------------------- 中部 -------------------------------------------------------->
<div class="layui-container write_width">
    <div class="layui-row">
        <div class="img_box layui-col-xs12">
            <label>最多上传3张图片！</label>
            <div id="show_pre" style="width: 200%;">
                <div id="upload" class="add_img_box">

                </div>
            </div>
        </div>
        <div class="write layui-col-xs12">
            <form id="form" action="" class="layui-form">
                <input type="hidden" id="img1" name="essayImg1">
                <input type="hidden" id="img2" name="essayImg2">
                <input type="hidden" id="img3" name="essayImg3">
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <input type="text" name="essayTitle" lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <div class="layui-input-block">
                        <textarea name="essayContent" lay-verify="required" placeholder="请输入内容" class="layui-textarea"></textarea>
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<!------------------------------------- 尾部 ------------------------------------------------------->
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
</body>
</html>
