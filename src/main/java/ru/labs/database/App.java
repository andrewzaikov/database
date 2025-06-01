package ru.labs.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.labs.database.service.DBService;

@EnableJpaRepositories("ru.labs.database.repository")
@EntityScan("ru.labs.database.entity")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        DBService dbService = context.getBean(DBService.class);
        dbService.run();
    }
}