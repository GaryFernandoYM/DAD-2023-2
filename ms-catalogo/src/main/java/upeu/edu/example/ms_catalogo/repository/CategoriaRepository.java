package upeu.edu.example.ms_catalogo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.example.ms_catalogo.entity.Categoria;

public interface CategoriaRepository extends
        JpaRepository<Categoria,Integer> {
}
