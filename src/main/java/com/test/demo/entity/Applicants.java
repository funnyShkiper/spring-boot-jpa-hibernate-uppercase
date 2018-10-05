package com.test.demo.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "`APPLICANTS`")
public class Applicants implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`")
    private Long id;

    @Column(name = "`FIO`")
    private String fio;

    @Column(name = "`PHONE_NUMBER`")
    private String phone_number;

    @Column(name = "`DATA`")
    private String data;

    @Column(name = "`AGE`")
    private short age;

    @Column(name = "`PHOTO`")
    private String photo;

    @Column(name = "`EMAIL`")
    private String email;

    @Column(name = "`CITY`")
    private String city;



}
