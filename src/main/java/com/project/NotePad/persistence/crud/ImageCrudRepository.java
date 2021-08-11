package com.project.NotePad.persistence.crud;

import com.project.NotePad.persistence.entity.BlocDeNotas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageCrudRepository extends JpaRepository<BlocDeNotas, Long> {

}
