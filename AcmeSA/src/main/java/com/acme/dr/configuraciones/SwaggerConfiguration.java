package com.acme.dr.configuraciones;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(
			Arrays.asList("application/json"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.acme.dr.apis"))
				.paths(PathSelectors.any()).build().apiInfo(this.apiInfo()).consumes(DEFAULT_PRODUCES_AND_CONSUMES)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES);
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("AcmeSA",
				"Servicio de prueba de Telconet", "v1.0", "Todos los derechos otorgados",
				new Contact("Daniel Reyes", "https://www.linkedin.com/in/daniel-reyes-81aa5b1ab/", "danieldrp.1417@gmail.com"),
				"Licencia del API", "https://www.linkedin.com/in/daniel-reyes-81aa5b1ab/", Collections.emptyList());
	}
}
