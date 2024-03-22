package gr.aueb.cf.springschoolapp.service;

import gr.aueb.cf.springschoolapp.dto.TeacherInsertDTO;
import gr.aueb.cf.springschoolapp.dto.TeacherUpdateDTO;
import gr.aueb.cf.springschoolapp.mapper.Mapper;
import gr.aueb.cf.springschoolapp.service.exceptions.EntityNotFoundException;
import gr.aueb.cf.springschoolapp.model.Teacher;
import gr.aueb.cf.springschoolapp.repository.TeacherRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TeacherServiceImpl implements ITeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Transactional
    @Override
    public Teacher insertTeacher(TeacherInsertDTO dto) throws Exception {
        Teacher teacher;

        try {
            teacher = teacherRepository.save(Mapper.convertInsertDtoToTeacher(dto));
            if (teacher.getId() == null) throw new Exception("Insert error");
        } catch (Exception e) {
            log.info("Insert error");
            throw e;
        }
        return teacher;
    }

    @Transactional
    @Override
    public Teacher updateTeacher(TeacherUpdateDTO dto) throws EntityNotFoundException {
        return null;
    }

    @Override
    public Teacher deleteTeacher(Long id) throws EntityNotFoundException {
        return null;
    }

    @Override
    public List<Teacher> getTeachersByLastname(String lastname) throws EntityNotFoundException {
        return null;
    }

    @Override
    public Teacher getTeacherById(Long id) throws EntityNotFoundException {
        return null;
    }
}
