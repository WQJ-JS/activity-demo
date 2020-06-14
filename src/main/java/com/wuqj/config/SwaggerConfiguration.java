package com.wuqj.config;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {



    /**
     * swaggerEnabled 是否启用 .
     */
    private Boolean swaggerEnabled = true;

    /**
     * VERSION 版本信息 .
     */
    private static final String VERSION = "v1.0.0";

    /**
     * BASEPACKAGE 需要配置的包路径 .
     */
    private static final String BASEPACKAGE = "com.js.swagger.demo";

    /**
     * Web接口API描述信息 .
     *
     * @author wuqj .
     * @return Api 描述信息  .
     */
    private ApiInfo webApiInfo() {
        return new ApiInfoBuilder().title("activityDemo接口文档").description("【activity Test API docs】").license("").licenseUrl("")
                .termsOfServiceUrl("").version(VERSION).contact(new Contact("", "", "")).build();
    }

    /**
     * Web接口-自定义规则 .
     *
     * @author wuqj .
     * @return Docket  .
     */
    @Bean("pocApiWebDocket")
    public Docket webDocket() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(BASEPACKAGE))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any()).build().apiInfo(this.webApiInfo()).enable(swaggerEnabled).groupName("ACTIVITY-DEMO-API");
    }

}

