package pl.jaceksysiak.hibernate.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.jaceksysiak.hibernate.demo.entity.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {

}
