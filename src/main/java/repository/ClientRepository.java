package repository;

import model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

//para la conexion a la base de datos
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
