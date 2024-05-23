package za.co.rmb.customertask.OpenAPISpecs;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Customer Project API")
                        .version("1.0")
                        .description("Used this project to get started with Swagger")
                        .contact(new Contact().name("Kgaugelo Mthethwa")
                                .email("mthethwakl15@gmail.com")
                                .url("https://github.com/code-geek15")

                        ));
    }


    // This one doest display anything
//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("public")
//                .pathsToMatch("/customer")
//                .build();
//    }
}
