package org.unitec.elementos;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author T-107
 */
public interface RepoUsuario extends MongoRepository<Usuario, Integer>{
    
}
