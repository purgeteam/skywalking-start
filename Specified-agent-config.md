# 按系统属性查找代理配置文件

## 支持的版本

5.0.0-RC+

## 什么是系统属性的定位代理配置文件？
在默认情况下。代理将尝试定位agent.config，这应该在/config代理程序包的字典中。如果用户通过系统属性设置指定的代理配置文件，代理将尝试从那里加载文件。顺便说一句，此功能与[设置覆盖](Setting-override.md)没有冲突 

## 覆盖优先级
指定的代理程序配置>默认代理程序配置
 
## 如何使用

指定配置的内容格式必须与默认配置相同。 


**使用 `System.Properties(-D)` 设置指定的配置路径**
 
 ```
 -Dskywalking_config=/path/to/agent.config
 ```
 `/path/to/agent.config`  是指定配置文件的绝对路径