package Ufersa.example.Test.API.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import Ufersa.example.Test.API.models.Carro;

public interface CarrosRepository extends JpaRepository<Carro, Long> {

}
