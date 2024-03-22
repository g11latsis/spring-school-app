package gr.aueb.cf.springschoolapp.mapper;

import gr.aueb.cf.springschoolapp.dto.TeacherInsertDTO;
import gr.aueb.cf.springschoolapp.dto.TeacherUpdateDTO;
import gr.aueb.cf.springschoolapp.model.Teacher;

public class Mapper {
    public static Teacher convertInsertDtoToTeacher(TeacherInsertDTO dto){
        return new Teacher(null,dto.getFirstname(), dto.getLastname());
    }

    public static Teacher convertUpdateDtoToUpdate(TeacherUpdateDTO dto){
        return new Teacher(dto.getId(), dto.getFirstname(),dto.getLastname());
    }
}
