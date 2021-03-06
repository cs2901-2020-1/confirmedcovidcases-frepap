package cs_utec.cs2901.business;

import cs_utec.cs2901.data.DailyCases;
import cs_utec.cs2901.repositories.DailyCasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DailyCasesBusiness {

    @Autowired
    private DailyCasesRepository repository;

    /*
    Crea un nuevo DailyCase.
    @param newDailyCase
    @return DailyCase guradado
     */
    public DailyCases create(DailyCases newDailyCase){
        return repository.save(newDailyCase);
    }

    /*
    Obtiene todos los DailyCases.
    @return dailycases
     */
    public List<DailyCases> findAll(){
        List<DailyCases> items = new ArrayList<>();
        for(DailyCases item :repository.findAll()){
            items.add(item);
        }
        return items;
    }

    /*
    Update: Actualiza un daily case existente.
    @param item
    @return DailyCase actualizado
     */
    public DailyCases update(DailyCases item){
        DailyCases a = repository.findById(item.getId()).get();
        if(a != null) {
            return repository.save(item);
        }
        return null;
    }

    /*
    Elimina un DailyCase existente.
    @param id
     */
    public void delete(Long id){
        repository.deleteById(id);
    }
}
