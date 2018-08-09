## 电商项目
> 基于SOA架构的大型开源分布式电商B2C购物商城，前后端开发分离，前台基于Vue全家桶开发。<br>
> 后台完成所有下单支付流程，后台主要使用技术有Dubbo/SSM/Elasticsearch/Redis/MySQL/ActiveMQ/Shiro/Zookeeper等技术

----------

### 动脑学院公开课源码

- [Tony老师公开课源码](http://code.dongnaoedu.com/2048209527/public-lession) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[找Tony老师聊聊人生](http://wpa.qq.com/msgrd?v=3&uin=2048209527&site=qq&menu=yes "Tony QQ")

- [Mike老师公开课源码](http://code.dongnaoedu.com/3266399810/public-lessions)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[找笑容甜美的Mike老师](http://wpa.qq.com/msgrd?v=3&uin=3266399810&site=qq&menu=yes "Mike QQ")

- [Allen老师公开课源码](http://code.dongnaoedu.com/allen/public-lessons)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[找Allen老师聊聊](http://wpa.qq.com/msgrd?v=3&uin=3266399810&site=qq&menu=yes "Mike QQ")

----------

### 前台页面为基于Vue [mall-front](http://code.dongnaoedu.com/allen/mall-front) 项目仓库查看

使用技术:

* 后台
	* Spring Boot 2.x 
	* Maven构建项目
	* Jenkins持续集成
	* Dubbo RPC框架
	* Apollo统一配置中心
	* Spring + Spring MVC + MyBatis SSM框架
	* druid数据库连接池
	* MySQL 关系数据库和 Redis nosql
	* FastDFS分布式文件服务器
	* Elasticsearch基于Lucene分布式搜索引擎
	* Swagger2生成 RESTful Apis文档
	* Nginx负载均衡、keepalived实现高可用
	* tomcat8 Servlet 容器
	* Spring Scheduled 任务调度
	* RabbitMQ消息中间件
	* Shiro权限管理
	* Zookeeper分布式应用程序协调服务
	* Docker容器
	* TCC分布式事务
	* Mycat数据库分库分表中间件
	* 行为验证码
	* Snowflake分布式id生成算法
	* Mybatis Generator 代码生成器
* 前台
	* [H-ui](http://www.h-ui.net/)、[FlatLab](https://themeforest.net/item/flatlab-bootstrap-3-responsive-admin-template/5902687/) 静态页面支持
    * [Ztree](http://www.treejs.cn/v3/main.php#_zTreeInfo)：jQuery树插件
    * [DataTables](http://www.datatables.club/)：jQuery表格插件
    * [Layer](http://layer.layui.com/)：web弹层组件
    * [Distpicker](https://github.com/fengyuanchen/distpicker)：中国省市区地址三级联动插件
    * [KindEditor](https://github.com/kindsoft/kindeditor)：富文本编辑器
    * [WebUploader](http://fex.baidu.com/webuploader/getting-started.html)：百度文件上传插件
    * [HighCharts](http://www.hcharts.cn/)：图表库
    * [不蒜子](http://busuanzi.ibruce.info/)：极简网页计数器
	* [技术栈]：Vue2 + Vuex + Vue Router + Element UI + ES6 + webpack + axios + Node.js


## spring boot & nodejs

| 名称            |IP               |
|:---------------:|:---------------:|
| mall-manager-web| localhost:8888  |
| mall-front-web  | localhost:7777  |
| mall-front      | localhost:9999  |


## Dubbo服务地址

| 服务名称         |Dubbo服务端口     |rest服务端口|
|:---------------:|:---------------:|:---------------:|
| mall-manager    | localhost:20880 |          |
| mall-content    | localhost:20881 |          |
| mall-search     | localhost:20882 |          |
| mall-sso        | localhost:20883 |          |


## 项目架构及功能模块图

![](http://code.dongnaoedu.com/allen/dongnao-mall/blob/master/images/jiagou.png)

![](http://code.dongnaoedu.com/allen/dongnao-mall/blob/master/images/front-web.png)

![](http://code.dongnaoedu.com/allen/dongnao-mall/blob/master/images/manger-web.png)


## 运行截图
![](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/首页.png)
![](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/登录.png)
![](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/注册.png)

* Zookeeper1    提供服务:Zookeeper
* FastDFS1        提供服务:FastDFS Tracker
* FastDFS2        提供服务:FastDFS Storage
* Redis         提供服务:Redis
* Solr          提供服务:Solr


## Dubbox Admin 服务使用情况
![](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/Dubbox.png)


## 本地开发运行部署
![20170320148998292034786.png](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/任务管理器.png)


## 常见问题

1. 编译失败

	先在dongnao-mall/pom.xml中执行 mvn install <br>
	编译不成功一般是缺少jar包 麻烦配置Nexus 然后更新整个项目去下载jar包 
	在继续编译 如还失败 **请查看本地maven仓库jar是否真正下载下来**
	
2. 编译成功启动失败

	请确保你先启动了zookeeper 并且配置对了zookeeper地址 需要连接数据的请配置好数据密码
	service服务有启动顺序 看看你需要启动的服务依赖那些服务 
	
3. 启动不了

	90%是你的jar问题 

