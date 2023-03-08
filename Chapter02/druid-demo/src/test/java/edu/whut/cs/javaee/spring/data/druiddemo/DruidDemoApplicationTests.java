package edu.whut.cs.javaee.spring.data.druiddemo;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DruidDemoApplicationTests {

    @Test
    void contextLoads() throws Exception {
        String password="181819574@Zy";
        ConfigTools.main(new String[]{password});
    }

}
