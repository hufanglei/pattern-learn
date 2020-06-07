package com;

import com.example.observer.blog.five5.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Title: PatternApplicationTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-06-05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PatternApplicationTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testOrder() {
        orderService.order();
    }

}