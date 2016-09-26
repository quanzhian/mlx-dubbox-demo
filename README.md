![mlxing](http://www.mlxing.com/images/index/img/logo.png)
##构建分布式项目Demo
* 采用的架构：spring + springMVC + dubbox 2.8.4 + ZooKeeper搭建
* 采用maven管理包和模块
* 采用git进行项目管理
* 数据库使用mysql

##项目运行
* 运行前配置好zookeper并启动,配置端口和IP请看项目的dubbox相关xml配置
* mlx-service-impl模块下 App.java 运行main方法 启动dubbox
* 浏览器访问服务(项目暂时使用rest协议) http://192.168.1.157:2080/user/findByUserType 或者 http://192.168.1.157:2080/user/findByUserType.xml
* dubbox-admin管理程序(下面的相关资源下载) 使用tomcat运行, 并访问 http://192.168.1.157:8081/dubbo-admin-2.8.4  账号root 密码root
* maven构建 先 maven update project → clean project → maven clean → maven install
* mlx-web-member 消费者web项目在tomcat启动 并访问 http://192.168.1.157:8080/user/id/70


##构建相关资源
* maven仓库相关包链接： [http://share.weiyun.com/eea47182cff91202ef6003da99fa9c8d](http://share.weiyun.com/eea47182cff91202ef6003da99fa9c8d) 密码：reGt

* dubbox的管理web程序 链接：[http://share.weiyun.com/272145ef0f9e8a7c44d9c12ebf09a4ff](http://share.weiyun.com/272145ef0f9e8a7c44d9c12ebf09a4ff) 密码：Iegc

##相关运行截图
dubbox-admin管理界面<br/>
http://share.weiyun.com/0c34594f4ba01a005b72a0349f2bb995

http://share.weiyun.com/10ce0fba7a2cb168fe40ebea42ad7a8d
<br/>
服务调用<br/>
http://share.weiyun.com/f0d126af0477d7d876b58a2bcb418760
<br/>
消费者调用<br/>
http://share.weiyun.com/b777973d6fdc1cf3a7aef4c7d3a2860d
<br/>
Zookeeper配置<br/>
http://share.weiyun.com/ed3f629bc9c67779603043558592d960

##关于我
```javascript
  var me = {
    nickName  : "ZHIAN QUAN",
    QQ : "573038570",
    city:"广州",
    email : "573038570@qq.com"
  }
```
