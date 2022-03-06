package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // AppConfig의 @Configuration 을 보면 @Component가 달려있기 때문에 컴포넌트 스캔의 대상이다.
        // AppConfig를 제외하기 위해 다음과 같은 코드를 추가한다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
