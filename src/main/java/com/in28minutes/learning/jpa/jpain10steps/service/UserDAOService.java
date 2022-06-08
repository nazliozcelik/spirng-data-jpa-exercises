package com.in28minutes.learning.jpa.jpain10steps.service;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
        //Open Transaction
        entityManager.persist(user);
        //Close Transaction
        return user.getId();
    }
}

/*
 * Spring Data JPA
 */
/*
public class SomeEntityDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(SomeEntity entity){
        //Open Transaction
        entityManager.persist(entity);
        //Close Transaction
        return entity.getId();
    }
}
*/