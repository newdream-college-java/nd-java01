<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="menu-mng" class="lefter">
        <div class="box">
            <dl>
                <dt>用户管理</dt>
                <dd><em><a href="user-add.html">新增</a></em><a href="user.html">用户管理</a></dd>
                <dt>商品信息</dt>
                <dd><em><a href="productClass-add.html">新增</a></em><a href="productClass.html">分类管理</a></dd>
                <dd><em><a href="product-add.html">新增</a></em><a href="product.html">商品管理</a></dd>
                <dt>订单管理</dt>
                <dd><a href="${basePath}/manage/listOrderConditionSvl">订单管理</a></dd>
                <dt>留言管理</dt>
                <dd><a href="guestbook.html">留言管理</a></dd>
                <dt>新闻管理</dt>
                <dd><em><a href="news-add.html">新增</a></em><a href="${basePath}/manage/listNewsSvl">新闻管理</a></dd>
            </dl>
        </div>
    </div>