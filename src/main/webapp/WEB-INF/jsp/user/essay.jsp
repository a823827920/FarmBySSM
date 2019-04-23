<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/21
  Time: 9:41
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/complete_head.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/essay.css" />
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/toggle.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/statics/layui/layui.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/index.js"></script>
</head>
<script>
    var authorId;
    function addComments(data){
        if(data.targetId==authorId){
            $("#comments").append(`
                     <hr/><div class=one_comment>
                    <span><img src=/file/${'${data.userImg}'} /></span>
                    <span>
								<label id=${'${data.userId}'} value=${'${data.userName}'}  targetId=${'${data.userId}'}>${'${data.userName}'}</label><label>${'${data.commentDate}'}</label>
                    </span>
                    <div class=operate_comment>
                        <label>举报·</label><label toid=${'${data.userId}'} >回复·</label><label><img praiseNum=${'${data.praiseNum}'} commentId=${'${data.commentId}'} src=${pageContext.request.contextPath}/statics/image/praise3.png/></label><i id=${'${data.commentId}'}>${'${data.praiseNum}'}</i>
                    </div>
                    <div class=comment_content>
                        ${'${data.commentContent}'}
                    </div>
                    </div>
                    <br />`
            )
        }else{
            $("#comments").append(`
                            <br />
                            <hr/><div class="one_comment">
                            <span><img src=/file/${'${data.userImg}'} /></span>
                            <span>
                               <label id=${'${data.userId}'} value=${'${data.userName}'} targetId=${'${data.userId}'}>${'${data.userName}'}<label>回复<label>${'${data.targetName}'}</label></label></label><label>${'${data.commentDate}'}</label>
                                        </span>
                            <div class="operate_comment">
                                <label>举报·</label><label toid=${'${data.userId}'}>回复·</label><label><img praiseNum=${'${data.praiseNum}'} commentId=${'${data.commentId}'} src="${pageContext.request.contextPath}/statics/image/praise3.png"/></label><i id=${'${data.commentId}'}>${'${data.praiseNum}'}</i>
                            </div>
                            <div class="comment_content">
                                ${'${data.commentContent}'}
                            </div>
                            </div>
                        `)
        }
    }
    $(function () {
        $.ajax({
            url:'${pageContext.request.contextPath}/user/comments',
            type:'get',
            async:false,
            data:{
                essayId:'${essay.essayId}'
            },
            success:function (data) {
                authorId='${essay.userId}';
                $("#total").html(" "+data.length+" ");
                for(var i=0;i<data.length;i++)
                {
                    addComments(data[i]);
                }
            }
        })
    })
    function praise(flag){
        var praiseNum='${essay.praiseNum}',
            essayId='${essay.essayId}';
        praiseNum=praiseNum*1+1;
        var res;
        $.ajax({
            url:'${pageContext.request.contextPath}/user/essayPraise',
            type:'post',
            data:{
                praiseNum:praiseNum,
                essayId:essayId
            },
            success:function (data) {
                   res=data;
            }
        })
        return res;
    }
    $(document).ready(function(){
        $(".show_praise span").toggle(function(){
                $(".show_praise span img").attr("src","${pageContext.request.contextPath}/statics/image/praise3.png");
                $(".show_praise i").html($(".show_praise i").html()*1+1);
                praise(1);
            },
            function(){
                $(".show_praise span img").attr("src","${pageContext.request.contextPath}/statics/image/praise1.png");
                $(".show_praise i").html($(".show_praise i").html()*1-1);
                praise(-1);
            });
        $(".to_comment textarea").click(function(){
            $(this).css("height","150px");
            $(".dbtn").css("display","inline-block");
        });
        $(".to_comment textarea").keyup(function(){
            console.log($(this).val());
            if($(this).val()!=""){
                $("#btn2").attr("disabled",false);
                $("#btn2").css("opacity","1");
            }
            else{
                $("#btn2").attr("disabled",true);
                $("#btn2").css("opacity","0.6");
            }

        });
        $("#btn1").click(function(){
            $(".to_comment textarea").text("");
            $(".to_comment textarea").css("height","21px");
            $(".to_comment textarea").attr("placeholder","说点什么...");
            $(".dbtn").hide();

        })
        var targetId;
        $("#btn2").click(function(){
            var commentContent=$("#commentContent").val();
            if(targetId==null){
                targetId='${essay.userId}';
            }
            $.ajax({
                url:'${pageContext.request.contextPath}/user/comment',
                type: 'post',
                data: {
                    targetId:targetId,
                    commentContent:commentContent,
                    essayId:'${essay.essayId}'
                },
                success:function (data) {
                    if(data!=""){
                        addComments(data);
                        $(".to_comment textarea").val("");
                        $(".dbtn").hide();
                        $(".to_comment textarea").css("height","21px");
                        var x=parseInt($("#total").html());
                        $("#total").html(x+1);
                    }else{
                        $("#login").click();
                    }
                }
            })
        })
        $(".operate_comment label:nth-of-type(2)").click(function(){
            var name=$('#'+$(this).attr("toid")).attr("value");
            targetId=$('#'+$(this).attr("toid")).attr("targetId");
            $("textarea").attr("placeholder","回复给"+name);
            $("textarea").click();
            $("textarea").focus();

        })
        function addPraiseForComment(commentId,praiseNum){
            $.ajax({
                url:'${pageContext.request.contextPath}/user/comment',
                type:'post',
                data:{
                    _method:'PUT',
                    commentId:commentId,
                    praiseNum:praiseNum
                },
                success:function (data) {

                }
            });
        }
        $(".operate_comment img").toggle(function(){
                $(this).attr("src","${pageContext.request.contextPath}/statics/image/praise2.png");
                var commentId=$(this).attr("commentId"),
                    praiseNum=$(this).attr("praiseNum");
                praiseNum=praiseNum*1+1;
                $(this).attr("praiseNum",praiseNum);
                addPraiseForComment(commentId,praiseNum);
                $("#"+commentId).html(praiseNum);
            },
            function(){
                $(this).attr("src","${pageContext.request.contextPath}/statics/image/praise3.png");
                var commentId=$(this).attr("commentId"),
                    praiseNum=$(this).attr("praiseNum");
                praiseNum=praiseNum*1-1;
                $(this).attr("praiseNum",praiseNum);
                addPraiseForComment(commentId,praiseNum);
                $("#"+commentId).html(praiseNum);
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
<div class="layui-container essay_width">
    <div class="layui-row">
        <div class="essay_artist  layui-col-xs12 layui-col-sm12 layui-col-md12">
            <label class="tx" style="background-image: url(/file/${essay.userImg})"></label>
                    <label>${essay.userName}</label>
        </div>
        <div class="show_img layui-col-xs12 layui-col-sm12 layui-col-md12">
            <img src="/file/${essay.essayImg1}" />
            <img src="/file/${essay.essayImg2}" />
            <img src="/file/${essay.essayImg3}" />
        </div>
        <div class="show_content  layui-col-xs12 layui-col-sm12 layui-col-md12">
            <label>${essay.essayTitle}</label>
            <div class="  layui-col-xs12 layui-col-sm12 layui-col-md12">
                <p>
                    ${essay.essayContent}
                </p>
            </div>

        </div>
        <div class="show_praise layui-col-xs12 layui-col-sm12 layui-col-md12">
            <label><i>${essay.praiseNum}</i>人已赞</label>
            <span><img src="${pageContext.request.contextPath}/statics/image/praise1.png" /></span>
        </div>
        <div class="show_comment">
            <div class="totals">共<label id="total"></label>条评论</div>
            <div class="to_comment">
                <c:if test="${user==null}">
                    <label><img src="${pageContext.request.contextPath}/statics/image/tx.png" /></label>
                </c:if>
                <c:if test="${user!=null}">
                    <label><img src="/file/${user.userImg}" /></label>
                </c:if>
                <form id="comment" action="" method="post">
                    <textarea placeholder="说点什么..." id="commentContent"></textarea>
                </form>
                <div class="dbtn">
                    <button id="btn1">取消</button>
                    <button id="btn2" disabled="disabled">确认</button>
                </div>

            </div>

            <div class="comments" id="comments">
                <br />

            </div>
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
