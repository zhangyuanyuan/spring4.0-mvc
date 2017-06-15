package com.kg.springmvc.domain;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-14-13:06
 */
public class DemoObj {

    private Long id;

    private String name;

    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
