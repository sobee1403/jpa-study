package com.study.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // Account 도메인 클래스가 테이블에 매핑되는 엔티티라는 것을 알려주는 것.
public class Account { //Account 도메인 클래스 생성

    @Id //주키
    @GeneratedValue //자동 생성되는 값을 사용하겠다.
    private Long id;

    @Column //붙이지 않아도 @Entity 어노테이션이 붙어있기때문에 username과 password 필드에는 @Column 어노테이션이 붙어있는 것과 다름없다.
    private String username;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
