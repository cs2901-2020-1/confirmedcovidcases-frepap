package cs_utec.cs2901.repositories;

import cs_utec.cs2901.data.DailyCases;
import org.springframework.data.repository.CrudRepository;

/*
Manejo de persistencia de la entidad DailyCases. Debería soportar las operaciones básicas.
    * -Create     INSERT INTO dailycases VALUES ( id_value, cantidad, 'fecha');
    * -Read ONE   SELECT * FROM dailycases WHERE id = 2;
    * -Read ALL   SELECT * FROM dailycases;
    * -Update     UPDATE dailycases SET cantidad = 3 WHERE id = 5;
    * -Delete     DELETE FROM dailycases WHERE id = 3;
 */
public interface DailyCasesRepository extends CrudRepository<DailyCases, Long> {

}
