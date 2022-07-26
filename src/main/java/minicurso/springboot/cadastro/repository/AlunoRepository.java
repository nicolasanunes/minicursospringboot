package minicurso.springboot.cadastro.repository;

import minicurso.springboot.cadastro.model.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
}
