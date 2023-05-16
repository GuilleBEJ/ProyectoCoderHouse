package repository;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//para la conexion a la base de datos
public interface ProductoRepository extends JpaRepository <Product, Integer> {
    Optional<Product> findById(int id);
}
