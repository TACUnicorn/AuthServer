package com.unicorn.authserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public  class SysAuthority {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String value;

    public String getValue() {
        return value;
    }


}
