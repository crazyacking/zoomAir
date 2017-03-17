# zoomAir

[![build](https://img.shields.io/teamcity/http/teamcity.jetbrains.com/s/bt345.svg)](https://github.com/crazyacking/zeekEye)
[![module](https://img.shields.io/puppetforge/mc/camptocamp.svg)](https://github.com/crazyacking/zeekEye)
[![license](https://img.shields.io/crates/l/rustc-serialize.svg)](https://github.com/crazyacking/zeekEye)

**zoomAir**采用SpringBoot作为Servlet容器，后端使用`Java`语言开发，基于`springMVN`框架，前端页面使用Thymeleaf模板.

特点概述：

- **数据存储**：采用`MySQL`数据库存储数据，支持多线程并发操作.Book相关的使用了Redis缓存,如果没装Redis,可以自行删除Redis相关的代码
- **技术特点**
  <ul>
  <li>SpringBoot作为servlet容器</li>
  <li>SpringMVC轻量级Web框架</li>
  <li>前后端通信采用RESTful架构</li>
  <li>Bootstrap前端开发框架，简洁、直观</li>
  <li>应用部署：采用Docker开源引擎，实现web应用自动化打包和发布</li>
  </ul>
- **功能实现**：内网导航。

## 安装

默认编辑器是IntelliJ IDEA 14.1.4，开发环境为jdk1.7.0，编译执行前先用IntelliJ IDEA把项目源码导出成jar包.

## API(如何使用)

### project config

```bash
  conf/zoom-air.properties文件为整个项目相关参数的配置文件，包括数据库接口地址配置等.
```

### 拓展 / 更新缓存

目前更新缓存暂提供以下方法:

- `get(url, cb)` - 如果url已存在,通过 `cb` 回调函数返回 `url`'的`body`. 否则返回'null'.
  - `cb` - 固定形式 `function(retval) {...}'
- `getHeaders(url, cb)` - 如果url已经存在,返回`url`的 `headers`,否则返回`null`.
  - `cb` - 固定格式 `function(retval) {...}`
- `set(url, headers, body)` - 设置/保存 `url`的 `headers` 和 `body`.

### 设置冗余/日志级别

`zoom-air.log(level)` - 这儿的`level`是一个string，可以是`"debug"`, `"info"`, `"warn"`,`"error"`

### Source Code

The source code of zeekEye is made available for study purposes only. Neither it, its source code, nor its byte code may be modified and recompiled for public use by anyone except us.

We do accept and encourage private modifications with the intent for said modifications to be added to the official public version.

## 反馈与建议

- 微博：[@crazyacking](http://weibo.com/crazyacking)
- 邮箱：<crazyacking@gmail.com>

------

感谢阅读这份帮助文档。如果您有好的建议，欢迎反馈。
