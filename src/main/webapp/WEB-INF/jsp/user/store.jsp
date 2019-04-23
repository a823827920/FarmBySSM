<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/19
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/index.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/complete_head.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/up_tab.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/store.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/up_laypage.css" />
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/toggle.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/index.js"></script>
</head>
<script>
    var plantName='${requestScope.plantName}';
    if(plantName!=''){
        $.ajax({
            url:'${pageContext.request.contextPath}/user/search',
            type:'post',
            async:false,
            data:{
                plantName:plantName
            },
            success:function (data) {
                plants=data;
                queryPlants();
            }
        })
    }
    $.ajax({
        url:'${pageContext.request.contextPath}/user/cates',
        type:'get',
        async:true,
        success:function (data) {
            for(var i=0;i<data.length;i++)
            {
                if(data[i].parentId==1){
                    $("#pid1").append("<li><input id='"+ data[i].cateId+ "' type=\"radio\" name=\"toselect\"  /><label id='"+ data[i].cateId+ "'for='"+ data[i].cateId+"'>"+data[i].cateName+"</label></li>")
                }else if(data[i].parentId==2){
                    $("#pid2").append("<li><input id='"+ data[i].cateId+ "' type=\"radio\" name=\"toselect\"  /><label id='"+data[i].cateId+ "' for='"+ data[i].cateId+"'>"+data[i].cateName+"</label></li>")
                }
            }
        }
    })
    $(document).ready(function(){
        layui.use(['layer','laypage','element'], function(){
            var element=layui.element;
            var laypage=layui.laypage;
            var layer=layui.layer;
            $(".layui-tab-item label").click(function(){
                //alert(222);
                $.ajax({
                    url:'${pageContext.request.contextPath}/user/plantsCate',
                    type:'get',
                    async:true,
                    data:{
                        cateId:this.id
                    },
                    success:function (data) {
                        plants=data;
                        queryPlants();

                    }
                })
            });
        });
        if(plantName==''){
            $.ajax({
                url:'${pageContext.request.contextPath}/user/plants/',
                type:'get',
                async: false,
                success:function (data) {
                    plants=data;
                    queryPlants();
                }
            })
        }
    });
    var plants;
    function queryPlants(){
        layui.use(['layer','laypage','element'], function(){
            var element=layui.element;
            var laypage=layui.laypage;
            var layer=layui.layer;
            laypage.render({
                elem: 'laypage' //注意，这里的 test1 是 ID，不用加 # 号
                ,count: plants.length //数据总数，从服务端得到
                ,limit:8
                ,jump:function (obj) {
                    //模拟渲染
                    document.getElementById('list').innerHTML = function(){
                        var arr = []
                            ,thisData = plants.concat().splice(obj.curr*obj.limit - obj.limit, obj.limit);
                        layui.each(thisData, function(index, item){
                            arr.push(`
                            <div class='layui-col-xs12 layui-col-sm4 layui-col-md3'>
                                <div class=img style=background-image:url(/file/${"${item.plantImg}"})></div>
                                <label style='font-size: 13px !important;
	color: #008489 !important;'>${"${item.plantName}"}&nbsp;&nbsp;&nbsp;&nbsp;编号${"${item.plantId}"}</label>
                                <span>
                                ${"${item.plantDes}"}
                            </span>
                            <label>￥${"${item.plantSaleprice}"}/单位<i><s>￥每株${"${item.plantSaleprice*1.2}"}</s></i></label>
                            </div>
                            `);
                        });
                        return arr.join('');
                    }();
                }
            });
        });
    }
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
<div class="layui-fluid">
    <div class="layui-tab">
        <ul class="layui-tab-title">
            <li>水果</li>
            <li>蔬菜</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item">
                <ul id="pid1">

                </ul>
            </div>
            <div class="layui-tab-item">
                <ul id="pid2">

                </ul>
            </div>
        </div>
    </div>
    <div class="layui-row  layui-col-space30 show_tab" id="list">

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
