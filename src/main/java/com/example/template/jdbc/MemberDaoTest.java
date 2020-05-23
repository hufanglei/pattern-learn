package com.example.template.jdbc;


import com.example.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * 测试
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
