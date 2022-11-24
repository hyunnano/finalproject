package net.manager.iym.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.manager.iym.entity.Member;

@Getter
@Setter
@NoArgsConstructor
public class MemberDTO {

    private String id;
    private String pass;
    private String name;
    private String mail;
    private String phone;
    private String gender;
    private String memberLoc;
    private String grade;
    private String teamName;

    public Member toEntity(){

        return Member.builder()
                .id(id)
                .pass(pass)
                .name(name)
                .mail(mail)
                .phone(phone)
                .gender(gender)
                .memberLoc(memberLoc)
                .grade(grade)
                .teamName(teamName)
                .build();
    }

    public MemberDTO(String id, String pass, String name, String mail, String phone, String gender, String memberLoc, String grade, String teamName){
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
