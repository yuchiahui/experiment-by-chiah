package com.bigbigmall.experiment.repository;

import com.bigbigmall.experiment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 學生
 *
 * @author Chiah
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
