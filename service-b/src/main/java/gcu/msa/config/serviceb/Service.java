package gcu.msa.config.serviceb; // 패키지명 변경

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {
    private static final Logger log =
        LoggerFactory.getLogger(Service.class);

    @Value("${service.name}") // Git Repo의 application.yml에 설정한 service.name 키
    private String value;

    public void print() {
        log.info("property value = {}", value);
    }
}