package com.mehmetsukrukavak.SpringDataJpaEx;

import com.mehmetsukrukavak.SpringDataJpaEx.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
