package com.bigbigmall.experiment.repository;

import com.bigbigmall.experiment.entity.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 班級
 *
 * @author Chiah
 */
@Repository
public interface ClazzRepository extends JpaRepository<Clazz, Long> {
}
