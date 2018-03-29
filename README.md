# commons-platform

[![MIT Licence](https://badges.frapsoft.com/os/mit/mit.svg?v=103)](https://opensource.org/licenses/mit-license.php)
![commons platform](https://img.shields.io/badge/commons--platform-0.01-green.svg)


## 项目简介

`commons-platform`项目主要是为了搭建一个基础平台(基于http远程调用的微服务架构),用于项目初始化,以及将项目做产品级的整合,形成项目骨架。

## 项目结构

* `commons-platform`
  * `commons-api`------------(产品api层)
  * `commons-blog`-----------(博客系统)
  * `commons-codegen`--------(代码生成器)
  * `commons-utils`----------(产品工具包)
  * `commons-web`------------(产品web层)
  * `commons-workflow`-------(产品工作流引擎)
  * `commons-member`---------(用户模块)

## 项目技术点

#### A. commons-platform

* 使用`mvn archetype:generate`创建多模块项目

#### B. commons-codegen

* `freeMarker`模板引擎进行模板解析


## 项目环境搭建
