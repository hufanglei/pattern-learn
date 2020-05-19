package com.example.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Leader
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-17
 */
public class Leader implements IEmployee {
    private Map<String, IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("登录", new EmployeeA());
        targets.put("加密", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
