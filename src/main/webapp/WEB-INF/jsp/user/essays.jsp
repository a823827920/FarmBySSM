<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/22
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/index.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/complete_head.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/store.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/up_laypage.css" />
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/toggle.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/index.js"></script>
</head>
<script>
    $(document).ready(function(){
        var essays;
        $.ajax({
            url:'${pageContext.request.contextPath}/user/queryEssays',
            type:'get',
            async:false,
            success:function (data) {
                essays=data;
            }
        })
        layui.use(['layer','laypage','element'], function(){
            var element=layui.element;
            var laypage=layui.laypage;
            var layer=layui.layer;
            laypage.render({
                elem: 'laypage' //注意，这里的 test1 是 ID，不用加 # 号
                ,count: essays.length //数据总数，从服务端得到
                ,limit:8
                ,jump:function (obj) {
                    //模拟渲染
                    document.getElementById('essays').innerHTML = function(){
                        var arr = []
                            ,thisData = essays.concat().splice(obj.curr*obj.limit - obj.limit, obj.limit);
                        layui.each(thisData, function(index, item){
                            arr.push(`
                            <div class="layui-col-xs12 layui-col-sm4 layui-col-md3">
                                <div class="img" style=background-image:url(/file/${"${item.essayImg1}"})></div>
                                <label style='font-size: 13px !important;color: #008489 !important;'>作者：${"${item.userName}"}</label>
                                <span>
                                            [${"${item.essayTitle}"}]&nbsp;&nbsp;&nbsp;&nbsp;${"${item.essayContent}"}
                                        </span>
                                <label>获赞数：${"${item.praiseNum}"}</label>
                            </div>
                            `);
                        });
                        return arr.join('');
                    }();
                }
            });
            $(".layui-tab-item label").click(function(){
                layer.msg($(this).text());
            })

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
                <label id="login">登录</label>
                <label id="register">注册</label>
                <label class="tx" style="display: inline-block;"></label>
            </div>
            <div class="tx_downmenu layui-hide-xs">
                <label><a href="javascript:;">个人资料</a></label>
                <hr>
                <label><a href="javascript:;">植物日志</a></label>
                <hr>
                <label><a href="javascript:;">我的仓库</a></label>
                <hr>
                <label><a href="javascript:;">退出</a></label>
            </div>
        </div>
    </div>
</div>
<!-------------------------------------- 中部 -------------------------------------------------------->
<div class="layui-fluid">

    <div class="layui-row  layui-col-space30 show_tab" id="essays">

    </div>
    <hr class="hr" />
    <div id="laypage"></div>
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