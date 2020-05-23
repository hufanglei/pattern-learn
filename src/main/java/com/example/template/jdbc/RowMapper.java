package com.example.template.jdbc;

import java.sql.ResultSet;

/**
 * Title: RowMapper
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-20
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum)throws Exception;
}
