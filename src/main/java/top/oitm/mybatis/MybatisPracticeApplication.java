package top.oitm.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 指定扫描的mapper包 不写此注解，需要在每个mapper类中添加 @Mapper注解
@MapperScan(basePackages = "top.oitm.mybatis.mapper")
public class MybatisPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPracticeApplication.class, args);
    }

}
