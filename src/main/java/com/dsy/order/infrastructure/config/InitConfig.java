package com.dsy.order.infrastructure.config;

import com.dsy.sunshine.web.log.SysLog;
import com.dsy.sunshine.web.log.SysLogFactory;
import com.dsy.sunshine.web.log.SysLogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 10:17
 */
@Configuration
public class InitConfig {

//    @Bean
//    public SysLogRepository sysLogRepository(){
//        return new CustomerLogRepository();
//    }
//
//    @Bean
//    public SysLogFactory sysLogFactory(){
//        return new CustomizeSysLogFactory();
//    }

    @Slf4j
    public static class CustomerLogRepository implements SysLogRepository {

        @Override
        public void store(SysLog sysLog) {
            log.info("..................");
        }
    }
    @Slf4j
    public static class CustomizeSysLogFactory implements SysLogFactory {
        @Override
        public SysLog buildSysLog() {
            return new SysLog();
        }
    }

}
