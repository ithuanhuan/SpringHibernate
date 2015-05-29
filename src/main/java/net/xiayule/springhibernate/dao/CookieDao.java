package net.xiayule.springhibernate.dao;

import net.xiayule.springhibernate.model.Cookie;
import net.xiayule.springhibernate.model.Person;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by huan on 2015/5/29 0029.
 */
public class CookieDao extends HibernateDaoSupport {
    public void save(Cookie cookie) {
        getHibernateTemplate().save(cookie);
    }

    public Cookie get(Integer id) {
        return getHibernateTemplate().get(Cookie.class, id);
    }
}
