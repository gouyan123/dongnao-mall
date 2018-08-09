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
	
## Tomcat地址(本机)
|名称|IP|完成情况|
|:---------------:|:---------------:|:---------------:|
| Portal  |192.168.125.1:8101 |aa|
| Search  |192.168.125.1:8102 |aa|
| Item    |192.168.125.1:8103 |aa|
| SSO     |192.168.125.1:8104 |aa|
| Admin   |192.168.125.1:8105 |aa|
| Cart    |192.168.125.1:8106 |aa|
| Order   |192.168.125.1:8107 |aa|

## Dubbox服务地址
| 服务名称|Dubbox服务端口  |rest服务端口|
|:---------------:|:---------------:|:---------------:|
| Admin-Service      | 192.168.125.1:20880 |rest:8510 |
| Redis-Service      | 192.168.125.1:20881 |rest:8511 |
| Search-Service     | 192.168.125.1:20882 |rest:8512 |
| Portal-Service     | 192.168.125.1:20883 |rest:8513 |
| Item-Service       | 192.168.125.1:20884 |rest:8514 |
| SSO-Service        | 192.168.125.1:20885 |rest:8515 |
| Notify-Service     | 192.168.125.1:20886 |rest:8516 |
| Cart-Service       | 192.168.125.1:20887 |rest:8517 |
| Order-Service      | 192.168.125.1:20888 |rest:8518 |


## 项目依赖(暂时)
![20170413149208646298768.png](http://on2bs9q7q.bkt.clouddn.com/20170413149208646298768.png)

## 结构图(暂时)
![20170407149155166510416.png](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/xbin-store.png)

## 项目开发进度(暂时)
![20170413149208582280568.jpg](http://on2bs9q7q.bkt.clouddn.com/20170413149208582280568.jpg)
    
## 实现目标

本项目最终实现的目标 [点我查看最后完成效果](https://www.jd.com)

## 运行截图
![20170320148998263242121.png](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/首页.png)
![20170320148998264384011.png](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/登录.png)
![201703201489982653612.png](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/注册.png)

* Zookeeper1    提供服务:Zookeeper
* FastDFS1        提供服务:FastDFS Tracker
* FastDFS2        提供服务:FastDFS Storage
* Redis         提供服务:Redis
* Solr          提供服务:Solr

## Dubbox Admin 服务使用情况
![20170320148998294075274.png](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/Dubbox.png)

## 任务管理器
![20170320148998292034786.png](https://raw.githubusercontent.com/xubinux/xbin-store/master/Images/任务管理器.png)

> 启动了 5 台虚拟机＋ 7 台 Tomcat ＋ 9 个 Dubbox 服务 内存使用情况

## 常见问题

1. 编译失败
	
	编译不成功的都是缺少jar包 麻烦配置Nexus 然后更新整个项目去下载jar包 
	在继续编译 如还失败 **请查看本地maven仓库jar是否真正下载下来**
	
2. 编译成功启动失败

	请确保你先启动了zookeeper 并且配置对了zookeeper地址 需要连接数据的请配置好数据密码
	service服务有启动顺序 请查看项目依赖图 看看你需要启动的服务依赖那些服务 
	
3. 启动不了

	90%是你的jar问题 

