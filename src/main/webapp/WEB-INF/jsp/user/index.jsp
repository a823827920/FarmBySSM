<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/13
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title></title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/toggle.js" charset="utf-8"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/layui.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/up_lunbo.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/index.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/up_tab.css" />
</head>
<script>
    $(document).ready(function(){
        var flag=1;
        $(".cy_img label").toggle(
            function(){
                $(this).attr("style","background-image: url(${pageContext.request.contextPath}/statics/image/praise2.png);");
                $('#praise'+$(this).attr("id")).html($('#praise'+$(this).attr("id")).html()*1+1);
            },
            function(){
                $(this).attr("style","background-image: url(${pageContext.request.contextPath}/statics/image/praise1.png);");
                $('#praise'+$(this).attr("id")).html($('#praise'+$(this).attr("id")).html()*1-1);
            });
        $("#cl").click(function(){
            if(flag==1){
                $(".hover_back").show();
                $(".hover_menu").slideDown("mid");
                $(this).attr("style","transform: rotate(180deg);position:fixed;");
                $(".space").attr("style","height:0;overflow-y:hidden;");
                $(".search_box").attr("style","position:fixed;z-index:1002;box-shadow: 1px 1px 4px 0px #00000059;");
                flag=0;
            }
            else{
                $(this).attr("style","transform: rotate(0deg);");
                $(".space").attr("style","overflow-y:normal;");
                $(".search_box").attr("style","position:absolute;z-index:1002;box-shadow: none;");
                $(".hover_menu").slideUp("mid",function(){
                    $(".hover_back").hide();
                })
                flag=1;
            }

        });
        $(".tx").toggle(function(){
                $(".tx_downmenu").show();
            },
            function(){
                $(".tx_downmenu").hide();
            });

        layui.use(['layer','element'], function(){
            var layer = layui.layer;
            var element=layui.element;
            $("#register").click(function(){
                layer.open({
                    type: 2,
                    title:false,
                    skin: 'layui-layer-molv',
                    area:['570px','300px'],
                    offset:'auto',
                    closeBtn: 2,
                    id: 'layerDemo',
                    anim: 5,
                    content:'${pageContext.request.contextPath}/user/register'
                })
            })
            $("#login").click(function(){
                layer.open({
                    type: 2,
                    title:false,
                    skin: 'layui-layer-molv',
                    area:['565px','500px'],
                    offset:'auto',
                    closeBtn: 2,
                    id: 'layerDemo',
                    anim: 5,
                    content:'${pageContext.request.contextPath}/user/login'
                })
            })
        });
    });
    $.ajax({
        url:"${pageContext.request.contextPath}/user/cates",
        type:'get',
        async:true,
        success:function (data) {
            $("#cates").append("<li class='layui-this' id='"+data[0].cateId+"'>"+data[0].cateName+"</li>");
            for(var i=1;i<data.length;i++)
            {
                $("#cates").append("<li id='"+data[i].cateId+"'>"+data[i].cateName+"</li>");
            }
        }
    })
</script>
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
        <div class="layui-carousel layui-col-md12 layui-col-sm-12 layui-col-xs12 flyline" id="test1">
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
            <div carousel-item>
                <div class="test layui-carousel layui-col-md12 layui-col-sm-12 layui-col-xs12">
                    <h1>
                        <div class="head_word">

                            在新绿与暖风中
                            <br>
                            住进江南山水画境
                            <br>
                            <span class="layui-hide-xs">发现两点一线的自然，体味不一样的人生</span>
                            <br>
                            <button>查看合集</button>
                        </div>


                    </h1>
                </div>
                <div class="test layui-carousel layui-col-md12 layui-col-sm-12 layui-col-xs12">
                    <h1>
                        <div class="head_word">

                            在新绿与暖风中
                            <br>
                            住进江南山水画境
                            <br>
                            <span class="layui-hide-xs">发现两点一线的自然，体味不一样的人生</span>
                            <br>
                            <button>查看合集</button>
                        </div>
                    </h1>
                </div>
                <div class="test layui-carousel layui-col-md12 layui-col-sm-12 layui-col-xs12">
                    <h1>
                        <div class="head_word">

                            在新绿与暖风中
                            <br>
                            住进江南山水画境
                            <br>
                            <span class="layui-hide-xs">发现两点一线的自然，体味不一样的人生</span>
                            <br>
                            <button>查看合集</button>
                        </div>
                    </h1>
                </div>
            </div>
        </div>
    </div>
</div>

<!------------------------------------ 种子展示部分 ------------------------------------>
<div class="layui-container space" id="te">
    <div class="tj_word">
        <label>春季特惠种子</label>
        <br />
        <label>低至9折，速来抢购！</label>
    </div>
    <div class="layui-tab layui-col-sm-12 layui-col-md12 layui-hide-xs">
        <ul class="layui-tab-title" id="cates">
            <%--<li class="layui-this">网站设置</li>
            <li>用户基本管理</li>--%>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-col-sm-12 layui-col-md12 layui-show">
                <div class="layui-fluid set_cs">
                    <div class="layui-row layui-col-space20 show_tab">
                        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
                            <div class="img"></div>
                            <label class="id">编号1001</label>
                            <span>
										[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
									</span>
                            <label>￥18<i><s>￥20每株</s></i></label>

                        </div>
                        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
                            <div class="img"></div>
                            <label class="id">编号1001</label>
                            <span>
										[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
									</span>
                            <label>￥18<i><s>￥20每株</s></i></label>

                        </div>
                        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
                            <div class="img"></div>
                            <label class="id">编号1001</label>
                            <span>
										[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
									</span>
                            <label>￥18<i><s>￥20每株</s></i></label>

                        </div>
                        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
                            <div class="img"></div>
                            <label class="id">编号1001</label>
                            <span>
										[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
									</span>
                            <label>￥18<i><s>￥20每株</s></i></label>

                        </div>
                        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
                            <div class="img"></div>
                            <label class="id">编号1001</label>
                            <span>
										[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
									</span>
                            <label>￥18<i><s>￥20每株</s></i></label>

                        </div>
                        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
                            <div class="img"></div>
                            <label class="id">编号1001</label>
                            <span>
										[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
									</span>
                            <label>￥18<i><s>￥20每株</s></i></label>

                        </div>


                    </div>
                </div>
            </div>
            <div class="layui-tab-item">
                2
            </div>
            <div class="layui-tab-item">3</div>
            <div class="layui-tab-item">4</div>
            <div class="layui-tab-item">5</div>
            <div class="layui-tab-item">6</div>
        </div>
    </div>


    <!-------------------------------------- 当手机屏幕时，不显示筛选标签，只有下面的默认推荐 ----------------------->
    <div class="layui-row layui-col-space20 show_tab layui-hide-sm layui-hide-md layui-hide-lg layui-show-xs">
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
            <div class="img2"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>

        </div>
        <div class="layui-col-xs12  layui-col-sm6 layui-col-md4">
            <div class="img2"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>
        </div>
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
            <div class="img2"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>
        </div>
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
            <div class="img2"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>

        </div>
        <div class="layui-col-xs12 layui-hide-xs layui-col-sm6 layui-col-md4">
            <div class="img2"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>
        </div>
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
            <div class="img2"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>
        </div>
    </div>

    <div class="search_more">查看更多优惠种子></div>

</div>
<div class="layui-container space">
    <div class="tj_word">
        <label>清新果园</label>
        <br />
        <label>这里的果树种植纯天然，没有任何农药</label>
    </div>
    <div class="layui-col-md12 layui-col-xs12 layui-col-sm12 hshow">
        <div class="lok_more"><a href="javascript:;">浏览更多果园&nbsp; ></a></div>
    </div>
    <div class="tj_word">
        <label>热销种子</label>
    </div>
    <div class="layui-row layui-col-space20 show_tab">
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
            <div class="img2" style="background-image: url(${pageContext.request.contextPath}/statics/image/cy.jpg);"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>
        </div>
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4">
            <div class="img2" style="background-image: url(${pageContext.request.contextPath}/statics/image/cy.jpg);"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>
        </div>
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md4  layui-hide-xs">
            <div class="img2" style="background-image: url(${pageContext.request.contextPath}/statics/image/cy.jpg);"></div>
            <label class="id">编号1001</label>
            <span>
						[滋养芦荟]叶脉清晰，叶肉饱满，可观赏也可药用，数十日即可长成
					</span>
            <label>￥18<i><s>￥20每株</s></i></label>
        </div>
    </div>
    <div class="search_more">查看更多种子></div>
</div>
<!----------------------------------------- 游记部分 ------------------------------------------->
<div class="layui-container space">
    <div class="tj_word">
        <label>精彩田园游记</label>
    </div>
    <div class="layui-row layui-col-space20">
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md3">
            <div class="cy_img"><label id="1"></label></div>
            <span class="cy_span"><label>广州</label>能看见很多热带水果的地方</span>
            <div class="comment">
                <img src="${pageContext.request.contextPath}/statics/image/tx.png" />
                <img src="${pageContext.request.contextPath}/statics/image/praise3.png" /><label id="praise1">8</label>
                <img src="${pageContext.request.contextPath}/statics/image/comment.png" /><label>14</label>
            </div>
        </div>
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md3">
            <div class="cy_img"><label id="2"></label></div>
            <span class="cy_span"><label>广州</label>能看见很多热带水果的地方</span>
            <div class="comment">
                <img src="${pageContext.request.contextPath}/statics/image/tx.png" />
                <img src="${pageContext.request.contextPath}/statics/image/praise3.png" /><label id="praise2">8</label>
                <img src="${pageContext.request.contextPath}/statics/image/comment.png" /><label>14</label>
            </div>
        </div>
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md3">
            <div class="cy_img"><label id="3"></label></div>
            <span class="cy_span"><label>广州</label>能看见很多热带水果的地方</span>
            <div class="comment">
                <img src="${pageContext.request.contextPath}/statics/image/tx.png" />
                <img src="${pageContext.request.contextPath}/statics/image/praise3.png" /><label id="praise3">8</label>
                <img src="${pageContext.request.contextPath}/statics/image/comment.png" /><label>14</label>
            </div>
        </div>
        <div class="layui-col-xs12 layui-col-sm6 layui-col-md3">
            <div class="cy_img"><label id="4"></label></div>
            <span class="cy_span"><label>广州</label>能看见很多热带水果的地方</span>
            <div class="comment">
                <img src="${pageContext.request.contextPath}/statics/image/tx.png" />
                <img src="${pageContext.request.contextPath}/statics/image/praise3.png" /><label id="praise4">8</label>
                <img src="${pageContext.request.contextPath}/statics/image/comment.png" /><label>14</label>
            </div>
        </div>
    </div>
</div>


<!-- ------------------------------------尾部 ------------------------------------------------>
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
    layui.use('carousel', function() {
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#test1',
            width: '100%' //设置容器宽度
            ,
            arrow: 'always' //始终显示箭头
            ,
            anim: 'fade' //切换动画方式
        });
    });
</script>
</body>
</html>
