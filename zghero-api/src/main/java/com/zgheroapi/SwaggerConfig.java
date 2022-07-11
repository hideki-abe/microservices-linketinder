package com.zgheroapi;


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
public class SwaggerConfig {

    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zgheroapi.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    private Contact contact(){
        return new Contact("Lucas Hideki Abe", "https://github.com/hideki-abe",
                "hideki-abe@hotmail.com");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API de cadastro")
                .description("API do projeto Linketinder")
                .version("1.0")
                .contact(contact())
                .build();
    }

}
