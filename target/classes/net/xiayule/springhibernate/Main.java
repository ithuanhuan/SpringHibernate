package net.xiayule.springhibernate;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import net.xiayule.springhibernate.dao.CookieDao;
import net.xiayule.springhibernate.dao.PersonDao;
import net.xiayule.springhibernate.model.Cookie;
import net.xiayule.springhibernate.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huan on 2015/5/29 0029.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        CookieDao cookieDao = ctx.getBean("cookieDao", CookieDao.class);

        Cookie c = new Cookie();
        c.setCookieName("123");

        cookieDao.save(c);

    }
}
