package com.exodus.orm.test.dao;

import com.exodus.orm.core.ORMConfig;
import com.exodus.orm.core.ORMSession;
import com.exodus.orm.test.entity.Book;
import org.junit.Before;
import org.junit.Test;

/**
 * @author arhaiyun
 * @version 1.0
 * @date 2020/5/11 17:17
 */
public class BookDao {
    private ORMConfig ormConfig;

    @Before
    public void init() {
        //1.创建ORMConfig对象
        ormConfig = new ORMConfig();
    }

    @Test
    public void testSave() throws Exception {
        //2.创建ORMSession对象
        ORMSession ormSession = ormConfig.buildORMSession();
        //3.创建实体类对象并保存
        Book book = new Book();
        book.setId(1);
        book.setName("Bible");
        book.setAuthor("God");
        book.setPrice(1000000);
        ormSession.save(book);
        ormSession.closeSession();
    }

}
