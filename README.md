# 工程简介
仿牛客社区项目

# 延伸阅读
# 学前基础知识
## Spring
Accessor接口的用法:用来获取当前容器
## SpringMVC
@RequestMapping("/xxx")
@PathVariable
@Param("xxx")
## Mybatis
@Mapper注解
## 项目的调试
使用logback日志框架，通过对日志进行分级来贴近企业的实际开发
## 版本控制
使用Git来进行版本控制
# 帖子模块
## 分页查询与指定用户帖子查询
这两个功能放在了一块儿，使用动态sql来完成
<if></if>标签用来处理条件

### 前端处理
由于使用的是thymleaf模板引擎，所以需要使用标准语法
#### 1.处理资源相对路径
th:href="@{/css/}"
th:src="@"
#### 2.对于帖子集合的循环遍历 
th:each="${map:ModelName}"
th:src="${map.user.headUrl}"
这里其实是thymleaf通过getUser和getHeadUrl来进行处理的
th:utext和th:text 前者能够自动识别转义字符
th:if="${map.post.type==1}"条件成立标签才会显示
#### 3.日期处理
th:text="dates.format(map.post.createTime,"yyyy-MM-dd")"
#### 4.分页处理
采用非常典型的分页处理方案，自定义Page，并添加常用字段current、total和常用方法
##### Page中的字段和方法
1. setCurrent(int current) 需要考虑是否会有错误传参
2. setLimit(int limit) 同样需要考虑是否会有错误参数
3. setRows(int Rows)???不知道为什么要设置
int offset=(current-1)*limit;
4. getOffset() 获取页的起始行```int offset=(current-1)*limit ;```
5. getTotal() 获取页的总数 
```java
if(rows%limit==0){
    total=rows/limit;
} else{
    total=rows/limit+1;
}
```
SpringMVC的DispatcherServlet会实例化Model和Page并将Page注入到Model中，所以thymleaf才能解析Page的信息。
##### 前端thymleaf的处理细节
1. 变量代替也就是说使用"| |"来拼接字符串，可能看官方文档不难理解，但是一旦牵扯到Model中封装的数据,那么复杂程度立马上升，所以还是多多练习。

