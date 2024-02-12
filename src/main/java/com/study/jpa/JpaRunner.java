package com.study.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;    //jpa의 핵심 api? 데이터를 영속화(저장) 할 수 있음.

    // ddl-auto : https://colabear754.tistory.com/136

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Account account = new Account();
        account.setUsername("222");
        account.setPassword("hibernate");

//        Session session = entityManager.unwrap(Session.class);
//        session.save(account);

        entityManager.persist(account);


    }
}
