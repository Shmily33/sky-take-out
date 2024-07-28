#### 仓库地址：[https://github.com/Shmily33/sky-take-out](https://github.com/Shmily33/sky-take-out)
# 1 项目介绍
## 1.1 功能架构
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720251534395-7ae17174-6d3c-4459-a2bb-0f6db10baf00.png#averageHue=%23595856&clientId=ue577b6a0-8380-4&from=paste&height=400&id=uf1d2d057&originHeight=500&originWidth=863&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=39694&status=done&style=none&taskId=ud2b6877a-fbf5-4d73-8320-89f9a59e73c&title=&width=690.4)
## 1.2 技术选型
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720251562268-e9665cc2-ed83-4b8d-aaf9-cd7466476637.png#averageHue=%23e6eaf0&clientId=ue577b6a0-8380-4&from=paste&height=413&id=u8419eb65&originHeight=516&originWidth=1201&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=65051&status=done&style=none&taskId=ucea2cd96-16bf-4e6c-b131-b53bba6ee4b&title=&width=960.8)
## 1.3 后端环境搭建
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720252132032-5287e43c-1948-477b-8a79-e56c0963692a.png#averageHue=%23f2e9e8&clientId=ue577b6a0-8380-4&from=paste&height=476&id=u0e4d8d16&originHeight=595&originWidth=1020&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=108922&status=done&style=none&taskId=u4fd9ef7c-14dd-48d0-877a-d341b4aa1f8&title=&width=816)
### sky-common
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720252159811-634c4ddb-98c0-4876-99b8-3ca76f97cd2e.png#averageHue=%23fcfbfb&clientId=ue577b6a0-8380-4&from=paste&height=428&id=u6f385b57&originHeight=535&originWidth=762&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=54613&status=done&style=none&taskId=uad9ae1de-da39-4a46-acb4-c35654522f0&title=&width=609.6)
### sky-pojo
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720252222693-8b975108-3e19-4350-8ea9-07a3c360bbe0.png#averageHue=%23f5eeee&clientId=ue577b6a0-8380-4&from=paste&height=395&id=u09ccaf7d&originHeight=494&originWidth=1087&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=65437&status=done&style=none&taskId=uf51052d4-ff5f-4f34-b293-52e76405c2a&title=&width=869.6)
### sky-server
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720252318803-4bcbd085-b953-45b5-80ce-fbf1862431ed.png#averageHue=%23fcfcfb&clientId=ue577b6a0-8380-4&from=paste&height=431&id=ub50d8e6a&originHeight=539&originWidth=1014&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=67580&status=done&style=none&taskId=u643da360-c677-4678-b8f5-c879d036cdb&title=&width=811.2)
## 1.4 数据库环境
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720253496935-17bf48f7-d65d-4f41-9699-6035210475aa.png#averageHue=%23f7f7f7&clientId=ue577b6a0-8380-4&from=paste&height=412&id=u73d73b4e&originHeight=515&originWidth=1221&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=55141&status=done&style=none&taskId=u5d8f11fe-5ef8-4336-aad0-70c638d5e3f&title=&width=976.8)
## 1.5 前后端联调
#### 思考
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720254695632-bc76e61e-e2ac-4436-bdac-67a936d05543.png#averageHue=%23fbf8f7&clientId=ue577b6a0-8380-4&from=paste&height=430&id=u7d39eebb&originHeight=538&originWidth=1241&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=124650&status=done&style=none&taskId=uc168bb35-0f12-4115-8ca8-e9a799e5b3d&title=&width=992.8)
##### 反向代理
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720254713257-b620df26-4cdf-45c1-9c89-215994d84551.png#averageHue=%23f9f5f3&clientId=ue577b6a0-8380-4&from=paste&height=414&id=u658f0be9&originHeight=517&originWidth=1148&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=189129&status=done&style=none&taskId=u5564a133-ab41-4fcd-afcf-7922c41733d&title=&width=918.4)
###### 好处
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720254788963-c8da73e1-8c5a-481f-bccb-551da170077e.png#averageHue=%23f9f7f6&clientId=ue577b6a0-8380-4&from=paste&height=458&id=u8d539caf&originHeight=573&originWidth=924&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=115168&status=done&style=none&taskId=uaab89244-3162-4f2f-af15-9a64acdff6a&title=&width=739.2)
###### 方向代理配置方式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720254831027-7a1c02b0-7192-4bc4-8d29-4b725a283f3e.png#averageHue=%23f9f6ea&clientId=ue577b6a0-8380-4&from=paste&height=419&id=ua680ee8d&originHeight=524&originWidth=1187&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=77370&status=done&style=none&taskId=u2f2315f2-f0f4-4aad-9273-97f037a3890&title=&width=949.6)
###### 负载均衡配置方式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720254881575-702116eb-3f88-4dca-bfcf-70a733b870d4.png#averageHue=%23fbfae0&clientId=ue577b6a0-8380-4&from=paste&height=414&id=u300a8d0d&originHeight=518&originWidth=1020&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=45930&status=done&style=none&taskId=u296ea652-fc39-4b68-bcbb-414020c6718&title=&width=816)
###### 负载均衡策略
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720254901168-53969077-701d-4ad4-8846-8ec48a2ebe2f.png#averageHue=%23e4d2d1&clientId=ue577b6a0-8380-4&from=paste&height=316&id=ucbd4bde4&originHeight=395&originWidth=873&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=63958&status=done&style=none&taskId=u74b0a3cf-7901-45ce-887d-6a7a9b9a48f&title=&width=698.4)
## 1.6 完善登录功能
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720255218050-6cd404ed-cf84-483b-8232-c22426137015.png#averageHue=%23f8f8f7&clientId=ue577b6a0-8380-4&from=paste&height=420&id=uc3c4d543&originHeight=525&originWidth=1242&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=150716&status=done&style=none&taskId=u6fa8eadd-c329-4c51-ba4f-2f98fe4767c&title=&width=993.6)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720255233490-99d46e55-da55-4248-a3f5-b88770bf1c3c.png#averageHue=%23f6f2e9&clientId=ue577b6a0-8380-4&from=paste&height=310&id=u2d9ef9a0&originHeight=387&originWidth=959&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=49886&status=done&style=none&taskId=u9afcf09a-3409-416b-ab37-bc63f040349&title=&width=767.2)
## 1.7 Swagger
### 1.7.1 介绍
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720256506948-801b461d-b823-42d6-9606-075a3c0362e2.png#averageHue=%23f8f8f8&clientId=ue577b6a0-8380-4&from=paste&height=407&id=u84c2ac23&originHeight=509&originWidth=1178&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=53467&status=done&style=none&taskId=u4b2b356a-9020-4507-be54-95b340ab410&title=&width=942.4)
```java
 <dependency>
            <groupId>com.github.xiaoymin</groupId>
            <artifactId>knife4j-spring-boot-starter</artifactId>
        </dependency>
```
### 1.7.2 使用方式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720256524178-6106718e-04eb-4cb2-ae2c-d9ff87cd5a0d.png#averageHue=%23f7f7e9&clientId=ue577b6a0-8380-4&from=paste&height=496&id=ude079d69&originHeight=620&originWidth=932&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=74926&status=done&style=none&taskId=ua39d8171-e3b2-4d65-aa04-a76f62295fe&title=&width=745.6)
### 1.7.3 常用注解
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720256575603-c7f1fd97-354f-4c26-b7ce-21550e6b2d1f.png#averageHue=%23ebdddc&clientId=ue577b6a0-8380-4&from=paste&height=315&id=ua101a22a&originHeight=394&originWidth=1036&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=50644&status=done&style=none&taskId=u280ffff4-0f91-4094-8713-989aeadd4b0&title=&width=828.8)
```java
package com.sky.config;

import com.sky.interceptor.JwtTokenAdminInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 配置类，注册web层相关组件
 */
@Configuration
@Slf4j
public class WebMvcConfiguration extends WebMvcConfigurationSupport {

    @Autowired
    private JwtTokenAdminInterceptor jwtTokenAdminInterceptor;

    /**
     * 注册自定义拦截器
     *
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        log.info("开始注册自定义拦截器...");
        registry.addInterceptor(jwtTokenAdminInterceptor)
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin/employee/login");
    }

    /**
     * 通过knife4j生成接口文档
     * @return
     */
    @Bean
    public Docket docket() {
        log.info("准备生成接口文档。。。");
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("苍穹外卖项目接口文档")
                .version("2.0")
                .description("苍穹外卖项目接口文档")
                .build();
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sky.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    /**
     * 设置静态资源映射
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("开始设置静态资源映射。。。");
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}

```
## 1.8 DTO与实体类
```java
/*
* 在controller使用的是EmployeeDTO(Data Transfer Object),这样可以与视图层数据一致
* 到service就可以操作真正的Employee实体，交由mapper层与数据库操作
* 
*  对象属性拷贝
    BeanUtils.copyProperties(employeeDTO, employee); // 源->目标

      Employee employee = Employee.builder()
                .id(id).status(status).build();
    builer插件方便赋值 等同set
*/

```
# 2 员工管理、分类管理
## 2.1 ThreadLocal
### 问题
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720423738784-41f888a1-566f-4ad1-b9e3-b51f0d92365a.png#averageHue=%23f4f4f4&clientId=u2989de3c-07c2-4&from=paste&height=81&id=ue12737a5&originHeight=101&originWidth=655&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=9932&status=done&style=none&taskId=udd086875-d01b-4f7c-819f-00868930f7b&title=&width=524)
### JWT认证流程
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720423520579-75ef29b7-0a06-4359-955e-9cc3b7db2ae6.png#averageHue=%23312e2b&clientId=u2989de3c-07c2-4&from=paste&height=567&id=ueb522455&originHeight=709&originWidth=952&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=170342&status=done&style=none&taskId=u08955847-efe3-4d1b-aebe-3b43e45dcc5&title=&width=761.6)
### ThreadLocal
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720423830587-48355e09-de33-4876-bd52-4609a090d2cc.png#averageHue=%23f5f4f4&clientId=u2989de3c-07c2-4&from=paste&height=353&id=u21695829&originHeight=441&originWidth=1189&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=85616&status=done&style=none&taskId=ua6b26827-a6b6-4fae-a200-e6b2d249088&title=&width=951.2)
## 2.2 日期格式化
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720426782881-b77310f9-9d09-4302-8d75-2f59d0c155ae.png#averageHue=%23f7f7e9&clientId=ued995265-0c44-4&from=paste&height=426&id=ufb1004ed&originHeight=533&originWidth=1189&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=95987&status=done&style=none&taskId=ua56be9ae-8ce7-41e6-b2ee-55412baae9b&title=&width=951.2)
# 3 菜品管理
## 3.1 公共字段自动填充--AOP+反射运用
### 问题
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720509586712-035f66c6-2398-4b1e-9e61-3c9803f5edbe.png#averageHue=%23f1e6e6&clientId=u454a4271-fdca-4&from=paste&height=487&id=u188d92d7&originHeight=609&originWidth=1159&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=71298&status=done&style=none&taskId=ube74ada1-d045-4860-bc20-adc3f59aa27&title=&width=927.2)
### 解决
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720509609946-bc4887e5-7c30-4197-94da-0ef83c176aea.png#averageHue=%23f2e8e8&clientId=u454a4271-fdca-4&from=paste&height=476&id=u111eaa33&originHeight=595&originWidth=1160&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=71525&status=done&style=none&taskId=ueb1a3265-5d9b-4537-9512-4a2067ba93a&title=&width=928)
### 代码
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1720513664067-2946a0a3-8e72-4183-83c0-fce52a8986bb.png#averageHue=%23292e35&clientId=u02c60f06-24fe-4&from=paste&height=504&id=u2fdfbc7c&originHeight=630&originWidth=1695&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=105288&status=done&style=none&taskId=uda6b0276-0f4e-442d-b8e0-c4f66fac476&title=&width=1356)
## 3.2 新增菜品
### 逻辑外键--代码：通过上一张表的插入语句，回显赋值id作为下一张表的dish_id
```java
 @Transactional
    @Override
    public void saveWithFlavor(DishDTO dishDTO) { // 两张表操作，保持数据一致性
        Dish dish = new Dish();
        BeanUtils.copyProperties(dishDTO, dish);
        // 菜品表插入1条数据
        dishMapper.insert(dish);

        // 获取insert语句生成的主键值
        // useGeneratedKeys="true" keyProperty="id" 使用产生的主键赋值为id
        Long dishId = dish.getId();

        // 口味表插入n条数据
        List<DishFlavor> flavors = dishDTO.getFlavors();
        if (flavors != null && flavors.size() > 0) { // 不空且有数据存在
            flavors.forEach(f -> {
                f.setDishId(dishId);
            });
            dishFlavorMapper.insertBatch(flavors); // 传入对象批量插入

        }
    }
```
### 两张表操作，数据一致性问题
@Transactional 保证方法是原子性 -- 方法上添加
@EnableTransactionManagement //开启注解方式的事务管理 --启动类上添加
## 3.3 修改菜品
### 插入口味表时，不确定是否有或者需要增删改--先删除后插入
```java
public void updateWithFlavor(DishDTO dishDTO) {
        Dish dish = new Dish();
        BeanUtils.copyProperties(dishDTO, dish);
        dishMapper.update(dish);
        // 口味有可能增删该了。那么我们处理方式先删掉原来的，在插入新的 等于覆盖
        dishFlavorMapper.deleteByDishId(dishDTO.getId());
        List<DishFlavor> dishFlavors = dishDTO.getFlavors();
        // 口味表插入n条数据
        List<DishFlavor> flavors = dishDTO.getFlavors();
        if (flavors != null && flavors.size() > 0) { // 不空且有数据存在
            flavors.forEach(f -> {
                f.setDishId(dishDTO.getId());
            });
            dishFlavorMapper.insertBatch(flavors); // 传入对象批量插入
        }
    }
```
# 4 Redis
## 4.1 简介
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721195014235-6bab6317-1fa7-4867-8bf8-389bdaca6a5c.png#averageHue=%23faf9f9&clientId=u2dad0e6e-ab6a-4&from=paste&height=457&id=u5d2e6f46&originHeight=571&originWidth=1085&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=63104&status=done&style=none&taskId=u633c5388-ec1a-424a-a1c9-0ffd22b62cd&title=&width=868)
#### mysql是基于数据文件，存在磁盘上，二维表结构方式
## 4.2 入门
### 启动命令
```java
redis-server.exe redis.windows.conf 启动redis
ctrl c 关闭
redis-cli.exe 启动客服端
redis-cli.exe -h () -p () -a () 启动指定的redis服务 -a 后是密码
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721195573993-bbbf1b48-65d8-4bc7-aefb-f1b7400cca65.png#averageHue=%23121212&clientId=u2dad0e6e-ab6a-4&from=paste&height=441&id=uda4d7624&originHeight=551&originWidth=1465&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=50247&status=done&style=none&taskId=u28ed9aa5-4a97-499f-aa9b-d95717eb3eb&title=&width=1172)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721195582561-fa0d49ae-2829-4d86-863e-1cbc65794cd3.png#averageHue=%23131313&clientId=u2dad0e6e-ab6a-4&from=paste&height=260&id=u5bb61997&originHeight=325&originWidth=1471&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=28901&status=done&style=none&taskId=u2e6d948c-560b-4103-979d-7edbfdcc3f2&title=&width=1176.8)
### 密码设置
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721195771678-c0e4994c-4ecb-4fac-8476-28d230e4e52d.png#averageHue=%23f1efed&clientId=u2dad0e6e-ab6a-4&from=paste&height=558&id=ud439fb55&originHeight=698&originWidth=935&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=74922&status=done&style=none&taskId=uf6f489d6-6b6b-46a5-ba97-b329eac9207&title=&width=748)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721195850504-2b2604cf-13f5-4384-95bf-8389b67a12a2.png#averageHue=%23f2f1ef&clientId=u2dad0e6e-ab6a-4&from=paste&height=192&id=u4c233634&originHeight=240&originWidth=882&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=15557&status=done&style=none&taskId=ua8fb9517-7084-4f15-ba08-92da2fffbee&title=&width=705.6)
## 4.3 常用数据类型
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721196193854-5c4b2d45-3e98-40cb-b3e1-a1be94345e6c.png#averageHue=%23faf9f9&clientId=u2dad0e6e-ab6a-4&from=paste&height=317&id=u59b1fe24&originHeight=396&originWidth=973&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=30576&status=done&style=none&taskId=u5da86289-4aa9-41e1-b1fd-d2cef79b2b6&title=&width=778.4)
#### 特点
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721196217443-09f9c084-4083-4e74-a1fb-4429feaa9f9f.png#averageHue=%23f5f5f5&clientId=u2dad0e6e-ab6a-4&from=paste&height=467&id=ue07cfcb2&originHeight=584&originWidth=1233&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=178763&status=done&style=none&taskId=u4609819f-08c0-428e-a444-64c7ad4698b&title=&width=986.4)
## 4.4 常用命令
### 字符串
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721196708446-c64ef9b7-8591-4678-b9ce-a1359932a335.png#averageHue=%23f6f6f6&clientId=u2dad0e6e-ab6a-4&from=paste&height=222&id=u2bca2d84&originHeight=277&originWidth=1034&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=34179&status=done&style=none&taskId=uf05af900-1572-4995-9b59-0f6b5fc3891&title=&width=827.2)
### Hash
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197245900-4ff6c5f3-ea09-4e42-8854-a5ebc3f44e32.png#averageHue=%23f5f5f5&clientId=u2dad0e6e-ab6a-4&from=paste&height=387&id=ub69ed6cc&originHeight=484&originWidth=1001&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=72622&status=done&style=none&taskId=u58a31dbd-869c-405b-b2f1-b2354dc0c1a&title=&width=800.8)
### 列表
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197295482-21bd8a57-e79e-44fd-ab09-fa995272f8a0.png#averageHue=%23f6f6f6&clientId=u2dad0e6e-ab6a-4&from=paste&height=358&id=u8a5a5f5b&originHeight=448&originWidth=895&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=55479&status=done&style=none&taskId=ue2772d46-ba36-4766-8a62-dac38345559&title=&width=716)
### 集合
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197308145-630a8e49-8cd1-4c2c-90f9-a44dfd252168.png#averageHue=%23f6f6f6&clientId=u2dad0e6e-ab6a-4&from=paste&height=422&id=u62c404dc&originHeight=527&originWidth=1027&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=77514&status=done&style=none&taskId=ude03441a-0258-40d9-b8e9-129b1f7f549&title=&width=821.6)
### 有序集合
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197330031-a66134ee-4fd6-43b1-8566-6a712ad49c1a.png#averageHue=%23f6f6f6&clientId=u2dad0e6e-ab6a-4&from=paste&height=399&id=u9fd6bb83&originHeight=499&originWidth=1176&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=82709&status=done&style=none&taskId=u6f6d7ebb-9387-40b0-b6d4-771838cfdd8&title=&width=940.8)
### 通用命令
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197355258-d4c138d7-2f47-498d-a25c-1501d35fc470.png#averageHue=%23f4f4f4&clientId=u2dad0e6e-ab6a-4&from=paste&height=241&id=u9cc7ba73&originHeight=301&originWidth=777&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=35971&status=done&style=none&taskId=u28121fc6-8bb0-4f6a-8eca-e6776b554ad&title=&width=621.6)
## 4.5 在Java中操作redis
### Spring Data Redis
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197501183-56e45fb3-0562-4925-a272-02951508d84e.png#averageHue=%23f8f8f8&clientId=u2dad0e6e-ab6a-4&from=paste&height=318&id=u1eac2582&originHeight=397&originWidth=881&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=34588&status=done&style=none&taskId=u654954d8-3309-4832-ba15-8ff930bb56d&title=&width=704.8)
### 使用方式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197661127-2ef71417-c64b-468d-94dd-fb27f79f0b3b.png#averageHue=%23fbfbe1&clientId=u2dad0e6e-ab6a-4&from=paste&height=293&id=ufa62e837&originHeight=366&originWidth=933&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=36671&status=done&style=none&taskId=u4e58e801-588f-4d86-87d2-edfbd4f089d&title=&width=746.4)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197534425-1bd2eafc-6951-4f61-a987-4d0740b0291e.png#averageHue=%23f8f7ed&clientId=u2dad0e6e-ab6a-4&from=paste&height=366&id=u08606530&originHeight=457&originWidth=1246&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=69423&status=done&style=none&taskId=u09ad6a26-077f-48a3-8352-8a7aed1fa22&title=&width=996.8)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721197545183-411304ec-aed5-49fb-aad5-9b2614995024.png#averageHue=%23f8f8f8&clientId=u2dad0e6e-ab6a-4&from=paste&height=314&id=u705ff77f&originHeight=392&originWidth=1144&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=47183&status=done&style=none&taskId=uf5422171-0e4a-4eb5-a630-2db5cfb444d&title=&width=915.2)
## 4.6 缓存商品
### 4.6.1 缓存菜品
#### 问题说明
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721284235698-d0e29ea8-5331-4571-9f93-daa62015587d.png#averageHue=%23f8f7f6&clientId=u1799f1e9-26b1-4&from=paste&height=478&id=ud5f24321&originHeight=597&originWidth=1197&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=122927&status=done&style=none&taskId=u0e53d631-5cc4-4c12-ae90-48d60609592&title=&width=957.6)
#### 实现思路
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721284248210-77439608-3d8c-4e4b-b2ca-d2ca0214e484.png#averageHue=%23fdfdfd&clientId=u1799f1e9-26b1-4&from=paste&height=386&id=uab0efe21&originHeight=483&originWidth=1202&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=35163&status=done&style=none&taskId=u74a6f001-08e4-4b7b-8e47-5223b18344d&title=&width=961.6)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721287154040-d0bbe509-4127-4de6-a185-a734c551d2d6.png#averageHue=%23f0eeeb&clientId=u1799f1e9-26b1-4&from=paste&height=429&id=u2634f4cf&originHeight=536&originWidth=976&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=154862&status=done&style=none&taskId=u7cd5264f-1766-4d0e-8f64-a2e19aaf8f2&title=&width=780.8)
### 4.6.2 缓存套餐
#### Spring Cache
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721287200396-ac9739fc-d263-4747-ba6c-f655397978a0.png#averageHue=%23f8f8f1&clientId=u1799f1e9-26b1-4&from=paste&height=413&id=u5e04e16c&originHeight=516&originWidth=1080&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=57139&status=done&style=none&taskId=ue4a81cd5-a942-4b2d-b962-0eade0229e5&title=&width=864)
##### 常用注解
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721287223387-1900ede5-cf21-41d5-9cbf-792b584aa9e9.png#averageHue=%23fdfefe&clientId=u1799f1e9-26b1-4&from=paste&height=260&id=u9b7c9458&originHeight=325&originWidth=1072&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=55716&status=done&style=none&taskId=ub21cb249-44fd-4eaf-b130-5e83d3f388e&title=&width=857.6)
#### 实现思路
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721288757501-784185a7-a43d-4e1c-8037-62cc8ad8c350.png#averageHue=%23f7f5f5&clientId=u1799f1e9-26b1-4&from=paste&height=237&id=ud5541ebc&originHeight=296&originWidth=1129&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=44491&status=done&style=none&taskId=u51fa3c74-1e0f-4e1a-a39b-a964e97bccd&title=&width=903.2)

# 5 HttpClient
## 5.1 介绍
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721201524962-f8af9a14-0e78-4b26-af3a-2f101932c172.png#averageHue=%23fbf9f8&clientId=u2dad0e6e-ab6a-4&from=paste&height=470&id=ue71f827e&originHeight=587&originWidth=1192&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=102045&status=done&style=none&taskId=ud5c305ad-e5a0-4bd8-b934-bccf16ad31b&title=&width=953.6)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721201554702-4c66dc6a-040b-4e06-bab0-1c45c13e93a7.png#averageHue=%23f7f7f7&clientId=u2dad0e6e-ab6a-4&from=paste&height=420&id=u4f421825&originHeight=525&originWidth=1187&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=65371&status=done&style=none&taskId=u63a88622-2571-4bcc-899f-c6f3122d74f&title=&width=949.6)
## 5.2 入门
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721207401181-387192c3-9f18-4efe-8dec-8a3a7683a811.png#averageHue=%23fcfce1&clientId=u2dad0e6e-ab6a-4&from=paste&height=369&id=ue3551e69&originHeight=461&originWidth=1174&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=48993&status=done&style=none&taskId=uc8305cb2-7cd9-46dd-b104-0bcf51adee0&title=&width=939.2)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721207411984-f3b27894-3782-4366-98c7-c5fa67c662aa.png#averageHue=%23fbfbe1&clientId=u2dad0e6e-ab6a-4&from=paste&height=433&id=u28e702b0&originHeight=541&originWidth=974&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=65637&status=done&style=none&taskId=u7e73e41e-a4ff-4f89-a8d7-4517cdbf2ab&title=&width=779.2)
# 6 微信小程序
## 6.1 注意
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721207442042-58cdd379-f300-47e2-8f71-a605b44dc6ef.png#averageHue=%237e7e7e&clientId=u2dad0e6e-ab6a-4&from=paste&height=423&id=u0c814699&originHeight=529&originWidth=511&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=71862&status=done&style=none&taskId=u0497c165-50d2-4d35-b9ff-c112d7bad7d&title=&width=408.8)
## 6.2 目录结构
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721207473734-6e0c2277-c495-40a6-b586-7087351279e7.png#averageHue=%23e0e0df&clientId=u2dad0e6e-ab6a-4&from=paste&height=360&id=u928fff4f&originHeight=450&originWidth=1035&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=80083&status=done&style=none&taskId=u9e9b001a-fc1f-4e79-a0f0-61044273d90&title=&width=828)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721207487700-5a193993-a2b2-489d-b186-8e2e6fd96891.png#averageHue=%23dcdcdb&clientId=u2dad0e6e-ab6a-4&from=paste&height=350&id=u2d9630f3&originHeight=437&originWidth=1018&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=69703&status=done&style=none&taskId=u6e2e4a48-3f89-4b54-b279-d304f1654d8&title=&width=814.4)
## 6.3 微信支付
#### 参考：[https://pay.weixin.qq.com/static/product/product_index.shtml](https://pay.weixin.qq.com/static/product/product_index.shtml)
### 6.3.1 时序图
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721729599218-96305ae8-dab5-4ef8-a5d9-b43e96fc5169.png#averageHue=%23fbfbfb&clientId=u472857bb-e3c2-4&from=paste&height=637&id=u3b8fd739&originHeight=796&originWidth=803&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=41579&status=done&style=none&taskId=u45470072-f00a-47f7-a76d-b7c3aeaab21&title=&width=642.4)
调用过程如何保证数据安全？
微信后台如何调用到商户系统？
### 6.3.2 JSAPI
[https://pay.weixin.qq.com/wiki/doc/apiv3/apis/chapter3_5_1.shtml](https://pay.weixin.qq.com/wiki/doc/apiv3/apis/chapter3_5_1.shtml)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721729780326-1e76f6bd-38c6-4817-aba2-8f86e385ddeb.png#averageHue=%23fbfaf9&clientId=u472857bb-e3c2-4&from=paste&height=430&id=uf0280443&originHeight=537&originWidth=1221&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=139584&status=done&style=none&taskId=u31b10188-0deb-46f8-b0df-741d6aaf6f5&title=&width=976.8)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721729857170-b695f008-ce58-43e3-8f9e-e28699077649.png#averageHue=%23b6b599&clientId=u472857bb-e3c2-4&from=paste&height=441&id=u8e7d8955&originHeight=551&originWidth=1233&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=209350&status=done&style=none&taskId=u6e3bbec8-1531-440f-b8fe-b24a8cd75bd&title=&width=986.4)
## 6.4 获取临时域名
#### cpolar：[https://dashboard.cpolar.com/login](https://dashboard.cpolar.com/login)
### 配置
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721730689783-ac7628e0-6fa8-47cc-a889-d83dc6f981f3.png#averageHue=%23ebe8e6&clientId=u472857bb-e3c2-4&from=paste&height=362&id=uaeed16d2&originHeight=453&originWidth=1418&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=50682&status=done&style=none&taskId=u7a9d1e89-1981-460a-9da4-ecc7faa4c51&title=&width=1134.4)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721730674431-f88ff44a-1108-4a74-a34a-ce549db458d8.png#averageHue=%23171717&clientId=u472857bb-e3c2-4&from=paste&height=222&id=u9b9b90d7&originHeight=278&originWidth=1064&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=25411&status=done&style=none&taskId=u36435244-64c3-4512-9249-c261d56e2d9&title=&width=851.2)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721730962730-e5be9542-e50b-4062-b119-ea3d8ec1586a.png#averageHue=%230e0e0e&clientId=u472857bb-e3c2-4&from=paste&height=98&id=ucb7c1407&originHeight=123&originWidth=892&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=4418&status=done&style=none&taskId=uf7ca0752-e35b-41bf-9024-a52e28d4097&title=&width=713.6)
### 成功示例
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721730995450-8d3ec403-f98f-4e2a-a0e1-7297f92e4bd7.png#averageHue=%23171717&clientId=u472857bb-e3c2-4&from=paste&height=251&id=u16f34a86&originHeight=314&originWidth=978&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=33968&status=done&style=none&taskId=ue6805e52-5d1e-4895-9cb8-b6510beee55&title=&width=782.4)
## 6.5 关于微信支付的代码跳过步骤--否则管理端的订单功能无法测试
### 6.5.1 小程序端代码改动
注释发送得支付请求功能代码，直接把其中成功跳转页面代码提上来
ctrl+f 搜索handleSave 替换其中的else分支代码
```java
else {
        // 如果支付成功进入成功页
        clearTimeout(this.times);
        var params = {
          orderNumber: this.orderDataInfo.orderNumber,
          payMethod: this.activeRadio === 0 ? 1 : 2 };

        (0, _api.paymentOrder)(params).then(function (res) {
          if (res.code === 1) {
              wx.showModal({
                title: '提示',
                content: '支付成功',
                success:function(){
                  uni.redirectTo({url: '/pages/success/index?orderId=' + _this.orderId });
                }
              })
              console.log('支付成功!')
            // wx.requestPayment({
            //   nonceStr: res.data.nonceStr,
            //   package: res.data.packageStr,
            //   paySign: res.data.paySign,
            //   timeStamp: res.data.timeStamp,
            //   signType: res.data.signType,
            //   success:function(res){
            //     wx.showModal({
            //       title: '提示',
            //       content: '支付成功',
            //       success:function(){
            //         uni.redirectTo({url: '/pages/success/index?orderId=' + _this.orderId });
            //       }
            //     })
            //     console.log('支付成功!')
            //   }
            // })


            //uni.redirectTo({url: '/pages/success/index?orderId=' + _this.orderId });

          } else {
            wx.showModal({
              title: '提示',
              content: res.msg
            })
          }
        });
      }
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721809612417-b5b516f3-b6c0-4e21-8c0e-91e513f4e1d5.png#averageHue=%23585757&clientId=u1b06719f-416e-4&from=paste&height=811&id=u1b12bfbc&originHeight=1014&originWidth=1904&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=253578&status=done&style=none&taskId=ub091420f-2b7d-4082-b4bc-63a3470c56a&title=&width=1523.2)
### 6.5.2 后端代码改动
#### OrderController
注释原先代码，直接按照接口文档返回String类型的预计送达时间
```java
  @PutMapping("/payment")
    @ApiOperation("订单支付")
    public Result<String> payment2(@RequestBody OrdersPaymentDTO ordersPaymentDTO) throws Exception {
        log.info("订单支付：{}", ordersPaymentDTO);
//        OrderPaymentVO orderPaymentVO = orderService.payment(ordersPaymentDTO);
        LocalDateTime time = LocalDateTime.now().plusHours(1);
        // 定义日期时间格式化器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String estimatedDeliveryTime = time.format(formatter);
        orderService.updateStatus(ordersPaymentDTO);
        return Result.success(estimatedDeliveryTime);
    }
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721811595374-3ba2eb8e-d484-423b-8ab3-161b8560e3d6.png#averageHue=%23222428&clientId=ue74e2506-e734-4&from=paste&height=492&id=ufd3cd00c&originHeight=615&originWidth=1174&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=136541&status=done&style=none&taskId=uccc336b7-5f29-40a3-b37f-3991e513504&title=&width=939.2)
#### OrderService
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721811617852-02805b6f-f4fc-400f-807a-55546fdf873e.png#averageHue=%231f2125&clientId=ue74e2506-e734-4&from=paste&height=537&id=u05df4916&originHeight=671&originWidth=1149&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=90520&status=done&style=none&taskId=ue6f6448f-c9b4-43fb-9f1e-1388c56638b&title=&width=919.2)
#### OrderServiceImpl
```java
 @Override
    public void updateStatus(OrdersPaymentDTO ordersPaymentDTO) {
        Orders orders = orderMapper.getByNumber(ordersPaymentDTO.getOrderNumber());
        orders.setStatus(Orders.TO_BE_CONFIRMED);
        orders.setPayStatus(Orders.PAID);
        orderMapper.update(orders);
    }
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721811642992-e1f1d85e-8582-4ed2-b21a-ae2a1620751f.png#averageHue=%23212939&clientId=ue74e2506-e734-4&from=paste&height=528&id=u38b8fa32&originHeight=660&originWidth=1233&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=112231&status=done&style=none&taskId=u9df68986-aa42-448f-8658-3f560f7570a&title=&width=986.4)
### 6.5.3 效果
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721811701242-a0349903-75a5-4ba0-8dc1-68636b2b7401.png#averageHue=%23c8c8c6&clientId=ue74e2506-e734-4&from=paste&height=675&id=ud296507f&originHeight=844&originWidth=496&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=46711&status=done&style=none&taskId=u838cf4e1-f230-4a82-8621-15567e91e7a&title=&width=396.8)
# 7 百度地图
## 7.1  环境准备
注册账号：[https://passport.baidu.com/v2/?reg&tt=1671699340600&overseas=&gid=CF954C2-A3D2-417F-9FE6-B0F249ED7E33&tpl=pp&u=https%3A%2F%2Flbsyun.baidu.com%2Findex.php%3Ftitle%3D%E9%A6%96%E9%A1%B5](https://passport.baidu.com/v2/?reg&tt=1671699340600&overseas=&gid=CF954C2-A3D2-417F-9FE6-B0F249ED7E33&tpl=pp&u=https%3A%2F%2Flbsyun.baidu.com%2Findex.php%3Ftitle%3D%E9%A6%96%E9%A1%B5)
登录百度地图开放平台：[https://lbsyun.baidu.com/](https://lbsyun.baidu.com/)
进入控制台，创建应用，获取AK：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721894278050-2c8b49c8-c137-4518-9c8b-8f57c9a55332.png#averageHue=%23e3c293&clientId=u900029a3-bb4d-4&from=paste&height=581&id=ube517e14&originHeight=726&originWidth=1917&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=105013&status=done&style=none&taskId=u9e8ec662-703b-4015-8243-095b425e5b4&title=&width=1533.6)
相关接口:
[https://lbsyun.baidu.com/index.php?title=webapi/guide/webservice-geocoding](https://lbsyun.baidu.com/index.php?title=webapi/guide/webservice-geocoding)
[https://lbsyun.baidu.com/index.php?title=webapi/directionlite-v1](https://lbsyun.baidu.com/index.php?title=webapi/directionlite-v1)
## 7.2  代码开发
###  application.yml
配置外卖商家店铺地址和百度地图的AK：
![](assets/image-20221222170819582.png#errorMessage=unknown%20error&id=V58aI&originalType=binary&ratio=1&rotation=0&showTitle=false&status=error&style=none)![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721894379468-907787a3-f3e6-4f89-b0a3-f9854a083321.png#averageHue=%23212226&clientId=u900029a3-bb4d-4&from=paste&height=202&id=ua19e3d59&originHeight=252&originWidth=822&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=23466&status=done&style=none&taskId=ucaf44750-a0f6-4d50-af40-0217d6c7279&title=&width=657.6)
###  OrderServiceImpl
改造OrderServiceImpl，注入上面的配置项：
```java
    @Value("${sky.shop.address}")
    private String shopAddress;

    @Value("${sky.baidu.ak}")
    private String ak;
```
在OrderServiceImpl中提供校验方法：
```java
/**
     * 检查客户的收货地址是否超出配送范围
     * @param address
     */
    private void checkOutOfRange(String address) {
        Map map = new HashMap();
        map.put("address",shopAddress);
        map.put("output","json");
        map.put("ak",ak);

        //获取店铺的经纬度坐标
        String shopCoordinate = HttpClientUtil.doGet("https://api.map.baidu.com/geocoding/v3", map);

        JSONObject jsonObject = JSON.parseObject(shopCoordinate);
        if(!jsonObject.getString("status").equals("0")){
            throw new OrderBusinessException("店铺地址解析失败");
        }

        //数据解析
        JSONObject location = jsonObject.getJSONObject("result").getJSONObject("location");
        String lat = location.getString("lat");
        String lng = location.getString("lng");
        //店铺经纬度坐标
        String shopLngLat = lat + "," + lng;

        map.put("address",address);
        //获取用户收货地址的经纬度坐标
        String userCoordinate = HttpClientUtil.doGet("https://api.map.baidu.com/geocoding/v3", map);

        jsonObject = JSON.parseObject(userCoordinate);
        if(!jsonObject.getString("status").equals("0")){
            throw new OrderBusinessException("收货地址解析失败");
        }

        //数据解析
        location = jsonObject.getJSONObject("result").getJSONObject("location");
        lat = location.getString("lat");
        lng = location.getString("lng");
        //用户收货地址经纬度坐标
        String userLngLat = lat + "," + lng;

        map.put("origin",shopLngLat);
        map.put("destination",userLngLat);
        map.put("steps_info","0");

        //路线规划
        String json = HttpClientUtil.doGet("https://api.map.baidu.com/directionlite/v1/driving", map);

        jsonObject = JSON.parseObject(json);
        if(!jsonObject.getString("status").equals("0")){
            throw new OrderBusinessException("配送路线规划失败");
        }

        //数据解析
        JSONObject result = jsonObject.getJSONObject("result");
        JSONArray jsonArray = (JSONArray) result.get("routes");
        Integer distance = (Integer) ((JSONObject) jsonArray.get(0)).get("distance");

        if(distance > 5000){
            //配送距离超过5000米
            throw new OrderBusinessException("超出配送范围");
        }
    }
```
在OrderServiceImpl的submitOrder方法中调用上面的校验方法：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721894561653-5719e811-8260-46a0-bbb7-cbb7d0afad95.png#averageHue=%23fcfbfa&clientId=u900029a3-bb4d-4&from=paste&height=583&id=u02f03bec&originHeight=729&originWidth=1164&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=71771&status=done&style=none&taskId=u621bf58b-019a-4008-8a1a-9cf81525a8d&title=&width=931.2)
# 8 SpringTask
## 8.1 实际问题
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721959826876-fe732d9f-15d6-42fb-b60f-344fc47d7558.png#averageHue=%23fcc21b&clientId=uf3bbe927-a9a4-4&from=paste&height=439&id=ued1d46b5&originHeight=549&originWidth=1184&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=83339&status=done&style=none&taskId=u1c8e8276-d276-4e21-a991-22c89f947fd&title=&width=947.2)
## 8.2 介绍
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721959901507-4e5bfff0-9414-464c-b42d-f0e8d69ae900.png#averageHue=%23d6d3d3&clientId=uf3bbe927-a9a4-4&from=paste&height=469&id=uaf6a5517&originHeight=586&originWidth=1163&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=148616&status=done&style=none&taskId=uf53d305e-8914-447d-96de-c371b8f5591&title=&width=930.4)
## ![](assets/image-20221222171444981.png#errorMessage=unknown%20error&id=Qg5gT&originalType=binary&ratio=1&rotation=0&showTitle=false&status=error&style=none)8.3 应用场景
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721959940577-7288e101-98f1-4abc-96a3-a97eb78ae015.png#averageHue=%23f9efdf&clientId=uf3bbe927-a9a4-4&from=paste&height=472&id=u48da480f&originHeight=590&originWidth=1006&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=180822&status=done&style=none&taskId=ub72d7872-bf69-4c74-81d9-c0ce3059754&title=&width=804.8)
## 8.4 cron表达式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721960020822-b0c777ba-2ff0-4cce-9150-4a8bf0d9c655.png#averageHue=%23f7f6f6&clientId=uf3bbe927-a9a4-4&from=paste&height=414&id=u4db6e6d9&originHeight=518&originWidth=812&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=50024&status=done&style=none&taskId=u88a77168-165a-4c0e-8990-33e6760e038&title=&width=649.6)
#### cron在线生成器：[https://cron.qqe2.com/](https://cron.qqe2.com/)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721960066377-27e2be02-c53b-4734-a716-eea16be8ec1e.png#averageHue=%23f9f9f9&clientId=uf3bbe927-a9a4-4&from=paste&height=544&id=u8c297121&originHeight=680&originWidth=1512&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=169423&status=done&style=none&taskId=u49335dae-e582-4f7d-a78b-a76c252ce59&title=&width=1209.6)
## 8.5 入门案例
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721960121943-75b6d870-4033-46a2-b5c2-07d3c845103c.png#averageHue=%23fbfafa&clientId=uf3bbe927-a9a4-4&from=paste&height=358&id=u358c7d7b&originHeight=448&originWidth=1118&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=106723&status=done&style=none&taskId=u1c4a5622-161c-46a0-946c-008d09b626b&title=&width=894.4)
```java
package com.sky.task;

import com.sky.entity.Orders;
import com.sky.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: gs_wang
 * @Date: 2024/07/26/上午10:30
 * @Description: 定时处理订单状态
 */
@Component
@Slf4j
public class OrderTask {

    @Autowired
    private OrderMapper orderMapper; // 往A注入B，前提是A已注入IOC

    // 处理超时订单
    @Scheduled(cron = "0 * * * * ?")
//    @Scheduled(cron = "1/5 * * * * ?") 测试
    public void processTimeoutOrder() {
        log.info("定时处理超时订单：{}", LocalDateTime.now());
        LocalDateTime time = LocalDateTime.now().plusMinutes(-15);
        // select * from orders where status = ? and order_time < (当前时间-15分钟)
        List<Orders> ordersList = orderMapper.getByStatusAndOrderTimeLT(Orders.PENDING_PAYMENT, time);
        if (ordersList != null && ordersList.size() > 0) {
            for (Orders order : ordersList) {
                order.setStatus(Orders.CANCELLED);
                order.setCancelReason("订单超时，自动取消");
                order.setCancelTime(LocalDateTime.now());
                orderMapper.update(order);
            }
        }

    }

    @Scheduled(cron = "0 0 1 * * ?")
//   @Scheduled(cron = "0/5 * * * * ?") 测试
    public void processDeliveryOrder() {
        log.info("定时处理处于派送中订单：{}", LocalDateTime.now());
        // select * from orders where status = ? and order_time < (当前时间-1h)
        // 因为是凌晨一点出发，当前时间是凌晨1点-1h 就是处理上一个工作日的
        LocalDateTime time = LocalDateTime.now().plusHours(-1);
        List<Orders> ordersList = orderMapper.getByStatusAndOrderTimeLT(Orders.DELIVERY_IN_PROGRESS, time);
        if (ordersList != null && ordersList.size() > 0) {
            for (Orders order : ordersList) {
                order.setStatus(Orders.COMPLETED);
                orderMapper.update(order);
            }
        }
    }

}
```
# 9 WebSocket
## 9.1 介绍
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721962347429-1ddadaab-cd33-473e-8e68-17f2d13f7b83.png#averageHue=%23dba361&clientId=uf3bbe927-a9a4-4&from=paste&height=474&id=u68425f13&originHeight=592&originWidth=1176&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=127145&status=done&style=none&taskId=u3f5ce780-531d-4b37-b87b-02536175492&title=&width=940.8)
### 应用场景
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721962406939-64d6847a-f739-41c1-bf97-047c45a08f87.png#averageHue=%23ebd4c0&clientId=uf3bbe927-a9a4-4&from=paste&height=398&id=ubafce6ab&originHeight=498&originWidth=1221&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=299725&status=done&style=none&taskId=u2aa920a9-e766-427d-a0b3-635aa2d1cf2&title=&width=976.8)
## 9.2 入门案例
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721962454508-89a75cff-aa21-44d4-8d3c-db13ddbc9ced.png#averageHue=%23f8f6f5&clientId=uf3bbe927-a9a4-4&from=paste&height=463&id=ub173e211&originHeight=579&originWidth=1113&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=113356&status=done&style=none&taskId=u01380fe1-d4a3-4215-96bc-cb0920ae983&title=&width=890.4)
```java
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-websocket</artifactId>
</dependency>
```
## 9.3 对比
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721962475246-69552bbe-0ccd-4cdb-bc2d-c32003ccdc9b.png#averageHue=%23f6f2f2&clientId=uf3bbe927-a9a4-4&from=paste&height=381&id=uf99b5320&originHeight=476&originWidth=1161&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=59843&status=done&style=none&taskId=u36ed0df3-99ec-4639-b817-1050df05a7c&title=&width=928.8)
## 9.4 来单提醒
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1721988551398-4decb999-2e7a-42e3-9a2d-4b2b6c7dbc05.png#averageHue=%23f5f5f5&clientId=ufa6e099b-4835-4&from=paste&height=366&id=uc325046b&originHeight=457&originWidth=1080&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=66144&status=done&style=none&taskId=u5b02f0cf-0233-48a5-9bdb-2146a8ce7ab&title=&width=864)
# 10 Apache Echarts
#### 官网：[https://echarts.apache.org/zh/index.html](https://echarts.apache.org/zh/index.html)
#### 入门案例：[https://echarts.apache.org/handbook/zh/get-started/](https://echarts.apache.org/handbook/zh/get-started/)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1722049663424-2db6a546-4c1a-4663-9fc6-c7d49508cd65.png#averageHue=%23fcfbfa&clientId=u9e8f6b4f-467c-4&from=paste&height=474&id=u9ed9a1cc&originHeight=593&originWidth=1203&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=80523&status=done&style=none&taskId=u55202b23-ad3e-4fe6-8261-ae6c236d0d6&title=&width=962.4)
##  营业额统计--折线图
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1722050262684-c407ad51-0771-406e-9598-5ee6ddf48c16.png#averageHue=%23fcfbfb&clientId=u9e8f6b4f-467c-4&from=paste&height=469&id=u44528dc7&originHeight=586&originWidth=916&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=55958&status=done&style=none&taskId=u44a64bb6-1dc0-4147-87ac-f3efe1e1ed7&title=&width=732.8)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1722050276819-e970f33a-02eb-4c2d-aa0c-1ac153bef800.png#averageHue=%23fdfcfc&clientId=u9e8f6b4f-467c-4&from=paste&height=420&id=uc5dc7ea3&originHeight=525&originWidth=1162&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=97608&status=done&style=none&taskId=ue4c09e73-66d8-44b3-89ac-53422bc79ae&title=&width=929.6)
# 11 Apache POI
## 11.1 介绍
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1722074406686-c93396a7-8bc8-4cff-bf6b-8692a46137d9.png#averageHue=%23fbfafa&clientId=u46da4431-6c24-4&from=paste&height=463&id=u5a3e4389&originHeight=579&originWidth=1246&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=61260&status=done&style=none&taskId=u412f81f1-ca02-4cf9-9d57-57da25f52bb&title=&width=996.8)
### 应用场景
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1722074540514-18c09b46-6308-4aa5-9e13-13cd3552cc8f.png#averageHue=%23f1f1f1&clientId=u46da4431-6c24-4&from=paste&height=175&id=u7a4e2ae3&originHeight=219&originWidth=382&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=18221&status=done&style=none&taskId=uafcae77f-39bb-4430-8332-6c14014de74&title=&width=305.6)
```java
<!-- poi -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
        </dependency>
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
        </dependency>
```
## 11.2 代码开发
![image.png](https://cdn.nlark.com/yuque/0/2024/png/35244370/1722081081228-696080c1-8832-44f2-a6aa-20931ddc0a8b.png#averageHue=%23f9f8f6&clientId=u46da4431-6c24-4&from=paste&height=475&id=u1ff3a262&originHeight=594&originWidth=1067&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=115729&status=done&style=none&taskId=u990ae77a-3f5f-4369-9d4f-d4a4d1d70cf&title=&width=853.6)
