**************************************
###项目完成进度
1. 前端登录界面初步完成
2. 首页初步完成
3. 错误页面初步完成

项目启动入口：Application.java

***************************
#####项目构想
1. 使用底层数据库需要为：mySql 
2. 数据库中间件为：MyCat
3. NoSQL 使用： redis
4. 分布式协调工作为：zookeeper
5. 可以在项目中集成任何一种MQ RabbitMQ RocketMQ
6. 主体框架为:Spring boot / Spring MVC / MyBaits 
*********************************
#####项目实施过程  时间：2017-12-30
1. MySQL 数据库安装过程记录

  ######① linux上传安装包： 本机安装了虚拟机  分别安装了Center OS 6.5 与 Center OS7.0 
    IP 分别为：192.168.35.128 192.168.35.129 
  ######②  上传本地下在的MySQL到主机上
  ######③  新建mySQl 用户
     useradd -u 544 -d /usr/mysql  -g users -m  mysql
     切换为root用户下 下载 安装包
     curl -O -L http://dev.MySQL.com/get/Downloads/MySQL-5.7/mysql-5.7.11-Linux-glibc2.5-x86_64.tar.gz
  ######④
2. MyCat 安装过程记录
  ######① navicat 直接连接物理数据库 新建数据库 zhaolg zhaolg-1
  ######② 修改/conf/schema.xml
  
3. 安装zookeeper 
4. 安装myCat WEB



5. 前端使用EasyUi 
   
6. 功能概述：
   1) 商品展示模块：可以按照分类标签进行展示。
   2) 购物车设计：可以预览订单详情。
   3) 支付模块：无法对接支付系统  假实现。
   4) 消息通知（可接入邮件：构造自己的邮件服务器）   --异步 定义消息下发模板进行消息下发拼接
   5) 商户入驻：后台商品添加。
   6) 商品以及商户入驻上架审核。

**************************************
* 该电子购物系统按照使用者的角色可以分为：用户、商户、网站管理者 三个角色，按照角色的不同展示不同的界面，即：用户进入首先看到的是商品展示栏。
**************************************
* 商品模型: 商品编号 商户编号 商品名称 上架时间 价格 库存 产品等级 点赞数 销售量 评价
* 商户模型：商户编号 商户名称  商户入驻时间  商户点赞数(商品点赞总数)
* 购物车模型：订单详情  是否支付  订单创建时间  
* 用户模型：姓名 编号 创建时间 
* 订单模型：订单编号  支付状态  物流状态  订单状态
* 消息模块：模板  参数  下发类型
***********************************************








