package com.bigbigmall.experiment.repository;

import com.bigbigmall.experiment.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 老師
 *
 * @author Chiah
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Short> {

}
