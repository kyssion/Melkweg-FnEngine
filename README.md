# Galaxy

## Galaxy 是什么

Galaxy 旨在构建下一代业务模型框架，将所有的业务以函数维度进行抽象，基于流式编程的方法，组合成业务逻辑。通过这种方法实现业务规则的实现和组装的分离，显著降低开发和运维成本。

## Galaxy 功能模块

- util 辅助功能模块 - 提供基本的数据函数化操作方法，基本反射功能操作方法，其他额外功能等。
- net 网络功能模块 - 通过基本网络操作封装
- core 核心功能模块 - 包含整体业务规则的数据结构，业务规则的解析逻辑，和对外暴露的调用接口
- data 数据库io操作模块 - 提供异步化 mysql postgresql等数据库支持

## 项目运行环境和项目依赖

## 业务规则流程

## 表达式基本语法


### 变量声明描述

```
var item_name[desc][type]{
    var1_name[desc][type],var2[desc][type];
}
```

 参数名称|参数作用
---|---
var|描述声明的变量类型
item_name|变量的变量名
desc|描述符号用来输出log
var1_name,var2_name|循环嵌套变量,furule的数据结构是可以嵌套的

### 函数声明描述

```
f[function_name](var1_name,var2_name)->
    f[function_name2](var1_name,var2_name)
```

参数名称|参数作用
---|---
f|声明此种类型是一个函数变量
function_name|指定当前函数所使用的在代码中声明的函数变量名称
var1_name,var2_name|指定在当前框架中声明的变量名称
->|表示将前一个函数的返回


## 安装运行方法

## 基本使用方法

## 案例演示

## 支持和联系方法

如果您对本项目有什么建议，欢迎提出issure或者发送邮件给我 kysskymail@Gmail.com

## 更新日志
