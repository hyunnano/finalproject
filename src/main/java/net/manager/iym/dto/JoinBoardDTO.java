package net.manager.iym.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JoinBoardDTO {

    private Long joinBoardNum;
    @NotEmpty
    @Size(min = 1, max = 100)
    private String joinTitle;
    @NotEmpty
    private String joinContent;
    @NotEmpty
    private String id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String joinType;
    @NotEmpty
    private int grade;

    private int joinCount;
    private LocalDate joinDate;
    private String joinFile;

}
//@Override 다시 커밋

    /*public List<TodoDTO> getAll() {
        List<TodoDTO> dtoList = todoMapper.selectAll().stream()
                .map(vo->modelMapper.map(vo, TodoDTO.class))
                .collect(Collectors.toList());
        return dtoList; //매퍼를 통해서 selectAll()을 통해서 나온 정보들은 각각 다른 TodoVO들이기 때문에 이 각각의 정보들을 vo를 DTO로 변환을 시켜 묶어준다.
        //List<TodoVO>를 List<TodoDTO>로 변환하는 작업을 stream을 이용하여 각 TodoVO는 map()을 통해서 TodoDTO로 바꾸고 collect()을 이용하여 List<TodoDTO>로 묶어준다.
    }*/
