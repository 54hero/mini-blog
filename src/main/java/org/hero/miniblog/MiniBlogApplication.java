package org.hero.miniblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author henry
 * @description 项目入口
 */
@MapperScan("com.hero.miniblog")
@SpringBootApplication
public class MiniBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniBlogApplication.class, args);
    }

}
