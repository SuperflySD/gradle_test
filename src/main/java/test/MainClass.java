package test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class MainClass implements CommandLineRunner {


    public static void main(String[] args) {


        SpringApplication.run(MainClass.class, "1");
    }

    @Override
    public void run(String... args) {
//        List<Cat> catsList = new ArrayList<>();
//        // List<? extends Animal> animalsExtend = new ArrayList<>();
//        List<? super Animal> animalsSuper = new ArrayList<>();
//
//        List<? extends Animal> animalsExtend = new ArrayList<>();
        Animal animal = new Animal();
        //   animalsExtend.add(animal);


        //  Animal animal1 = animalsExtend.get(0);


//        animalsSuper.add(animal);
//        Object animal2 = animalsSuper.get(0);

        try {
            run(Integer.parseInt(args[0]) + 1 + "");
        } catch (StackOverflowError error) {
            System.out.println("----" + args[0]);

        }
        if (Integer.parseInt(args[0]) == 2)
            System.out.println("end");
    }
}

//Collections
//Generics
//JVM, profiling

//Thread creation, stopping
//volatile
//synchronization means

//Code quality, code standards, quality gates
//SOLID
//Patterns
//testing

//Servlet container vs application server vs Spring
//Spring MVC vs JAXRS vs Servlets
//Service vs Component annotation
// Conditional annotation

//ORM purpose
// JPA/Spring Data/Hibernate vs JDBC/Spring JDBC
// entity states in hibernate (new, managed, detached, removed)
//lazyInitializationException
// transactions (isolation, propagation)
//Transactional annotation (proxy) limitation

//Microcervices patterns
//Spring Cloud Eureka, Zuul, Hystrix, Ribbon, Feign Client, logging, security
//synchronous vs asynchronous interaction: pros and cons
//what is Kafka, why is it so fast, order guaranties
// kafka partitions, kafka consumer group, competing consumers

//Docker
//Kubernetes - why use, pros and cons



