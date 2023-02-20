package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
// @Component가 붙은 클래스를 전부 검색해서 빈을 다 가져옴.(참고로 Configuration은 @Component를 포함하고있음)
// 그래서 필터로 Configuration 애노테이션이 붙은 건 빼겠다는 뜻 : (이유)AppConfig 클래스에 기존에 만들어둔 빈은 안가져오려고

public class AutoAppConfig {

}
