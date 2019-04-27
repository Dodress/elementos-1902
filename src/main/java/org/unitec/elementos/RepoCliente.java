package org.unitec.elementos;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoCliente extends MongoRepository<Cliente, Long>{
    List<Cliente> findByNombre(String nombre);
}
