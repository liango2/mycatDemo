package com.mycat.test.model;

/**
* @ClassName: Test
* @Description: test
* @author: suxl
* @date: 2015-01-19 16:40:14
*/
public class Test {
    private Integer id;
    private String name;
    private Long userId;

    public void setId(Integer id) {//
        this.id= id;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name) {//
        this.name= name;
    }
    public String getName() {
        return name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
