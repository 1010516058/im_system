# 一款IM即时通讯系统


## 架构设计
- sdk
- 接入层
- 逻辑层
- 存储层
## 功能模块组层
- 用户模块
  - 用户批量导入
  - 添加用户
  - 删除用户
  - 更新用户
  - 用户登录
- 关系链模块
  - 拉黑好友
  - 添加好友
  - 删除好友
  - 申请添加好友
  - 批量导入好友
- 分组模块
  - 多对多分组
  - 分组添加
  - 分组删除
  - 分组更新
- 好友发送消息模块
  - 一对一发送消息
  - 发送消息前置效验
  - 写扩散
- 群聊消息模块
  - 读扩散
  - 群聊消息同步
  - 读扩散-写扩散
- 群组模块
  - 好友群组
    - 群禁言
    - 群踢人
    - 群拉人
    - 群管理员设置
    - app管理员
  - 陌生人群组
## 技术栈
- SpringBoot+Netty+Mybatis+Redis+RabbitMQ+Zookeeper+Feign

## 技术亮点

- 黏包半包问题的解决
- 心跳机制的实现
- 自定义私有协议
- 负载均衡
- 分布式部署
  - 如何确保在多个服务中能够争取的获取用户？（采用路由的方式）
- 多端登录难点
  - 如何确保一个服务下用户下线了，其他的能够即时收到通知？采用广播的形式。
- 长连接负载均衡
- 负载均衡
  - 随机算法
  - 轮询算法
  - 一致性哈希算法
- 实时性
  - 使用多线程进行消息分发与持久化
  - 拆分前置验证在TCP层
  - 拆分消息持久化
- 可靠性
  - ack
  <img src="http://blog.pinbaiyun.com/upload/%E5%9B%BE%E7%89%87-sgcd.png">
  <img src="http://blog.pinbaiyun.com/upload/%E5%9B%BE%E7%89%87-nvat.png">

- 有序性
  - Redis自增ID
- 幂等性



## 代码模块介绍
- common 公共模块
- im-codec 编解码模块
- im-tcp tcp模块
- service 用户服务模块
- Zookeeper

## 学习文档(TODO)


**如果对您有帮助，欢迎点个star,万分感谢😁** 

ps:闲来无事会写点技术小文章，可以多多关注呀
##### 博客地址:<a href="https://www.ziyus.cn/">点击跳转</a>

