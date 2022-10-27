package rikkei.academy.repository;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rikkei.academy.model.Student;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {
    Boolean existsByName(String name);
    List<Student> findAllByNameContaining(String name);
    Page<Student> findAllByNameContaining(String name, Pageable pageable);
}
