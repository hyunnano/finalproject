package net.manager.iym.entity;

import lombok.*;

import lombok.Builder;
import lombok.Getter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue
    private String id;
    private String pass;
    private String name;
    private String mail;
    private String phone;
    private String gender;
    private String memberLoc;
    private String grade;
    private String teamName;

    @Builder
    public Member(String id, String pass, String name, String mail, String phone, String gender, String memberLoc, String grade, String teamName){

        this.id = id;
        this.pass = pass;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.gender = gender;
        this.memberLoc = memberLoc;
        this.grade = grade;
        this.teamName = teamName;
    }


}
