## 【项目笔记】

### BUG集与解决方案

#### 1.**springboot集成JWT**测试时报错

![image-20220320224434716](E:\Typora图片仓库\image-20220320224434716.png)

原因：缺少javax的jar包， javax是javaEE的API，因此在java SE 9.0 中不再包含这个 Jar 包，java 9 中引入了模块的概念，默认情况下，Java SE中将不再包含java EE 的Jar包，而在 java 6 / 7 / 8 时关于这个API 都是捆绑在一起的

解决：手动添加一些依赖包，在`pom.xml`中引入以下依赖:

```xml
<dependency>
        <groupId>javax.xml.bind</groupId>
        <artifactId>jaxb-api</artifactId>
        <version>2.3.0</version>
    </dependency>
    <dependency>
        <groupId>com.sun.xml.bind</groupId>
        <artifactId>jaxb-impl</artifactId>
        <version>2.3.0</version>
    </dependency>
    <dependency>
        <groupId>com.sun.xml.bind</groupId>
        <artifactId>jaxb-core</artifactId>
        <version>2.3.0</version>
    </dependency>
    <dependency>
        <groupId>javax.activation</groupId>
        <artifactId>activation</artifactId>
        <version>1.1.1</version>
    </dependency>
```



