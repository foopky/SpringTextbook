package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.CommentService;

@Configuration
@ComponentScan({"service"})
public class ProjectConfig {
}
