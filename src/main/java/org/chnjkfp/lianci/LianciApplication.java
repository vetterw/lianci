package org.chnjkfp.lianci;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.chnjkfp.lianci.dao.mapper")
public class LianciApplication {

    public static void main(String[] args) {
        SpringApplication.run(LianciApplication.class, args);
    }

}
