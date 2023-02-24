package com.mycompany;

import com.mycompany.dao.impl.UserRepository;
import com.mycompany.entity.User;
import com.mycompany.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableCaching
public class ResumeDbAppJpaSpringApplication {


    public static void main(String[] args) {
        SpringApplication.run(ResumeDbAppJpaSpringApplication.class, args);
    }


    /*
    // eger UserServiceImpl.java da @Repository yazmasaq bunu edirik ve @Autowired ile yanasi @Qualifier(name = userDao) yaziriq
    //
        @Bean(name = userDao)

        UserServiceInter getUserDao(){
            return new UserServiceImpl();
        }

     */


    @Autowired
    private UserRepository userRepository;

    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                List<User> list = userRepository.findAll();
//                System.out.println(list);
//                System.out.println("-------------");
//                list = userRepository.findAll(Sort.by(Sort.Order.desc("id")));
//                System.out.println(list);
//                System.out.println("-----------------");
//                User u = userRepository.findByName("Umman");
//                List<User> list2 = userRepository.findByNameAndSurname("Huseyn", "Hasanov");
//                System.out.println(u);
//                System.out.println(list2);
//                System.out.println("-----------------");
//                User u2 = userRepository.findByEmail("umman152@mail.ru");
//                System.out.println(u2);
//                System.out.println("-----------------");
                List<User> u3 = userRepository.getAll(null, null, null);
                System.out.println(u3);

            }
        };
        return clr;
    }

//    @Autowired
//    private UserServiceInter userService;
//
//    @Autowired
//    private UserRepository repo;
//
//    @Bean
//    public CommandLineRunner run() {
//        CommandLineRunner clr = new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                for (int i = 0; i<10; i++){
//                    userService.getAll(null, null, null);
//                }
//            }
//        };
//        return clr;
//    }


//    @Bean
//    public CommandLineRunner run() {
//        CommandLineRunner clr = new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                List<User> list = userDao.getAll(null, null, null);
//                User u = list.get(0);
//                u.setName(u.getName().toLowerCase());
//                userDao.updateUser(u);
//            }
//        };
//        return clr;
//    }
}
