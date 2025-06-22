package com.springyy.springyyProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

//key concepts
//		IOC: inversion of control centralized way for creating objects for clases
//				its like box having a objects of all classes having @componet as annotation
//				application contex is a way to achive IOC , its like single ton clase
// 		bean : these objects that are created are called beans
// 		@autowired: is used to get those objects from ioc container this is called feild injection or depency injection
// @SpringBootApplication this kept only on main class and its entry point of project
// every @componet or other @ annotaions  should be under this class scope only
// @SpringBootApplication does 3 jobs @configuration @enableAutoconfig @componetscan
// @componet scane says to scane for the objects
//@enableAutoconfig helps for DB connections
// @configuration says that the below class will provide configuration
// these are basics need will add extra cmts if needed

@SpringBootApplication

public class SpringyyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringyyProjectApplication.class, args);
    }

}
