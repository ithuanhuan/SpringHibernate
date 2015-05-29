package net.xiayule.springhibernate.dao;

import net.xiayule.springhibernate.model.Person;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.security.Permission;

/**
 * Created by huan on 2015/5/29 0029.
 */
public class PersonDao extends HibernateDaoSupport {
    public void save(Person person) {
        getHibernateTemplate().save(person);
    }

    public Person get(Integer id) {
        return getHibernateTemplate().get(Person.class, id);
    }
}
