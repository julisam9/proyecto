package co.edu.unab.cuotaadmon.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.cuotaadmon.model.ResidentesModel;

@Repository
public interface ResidentesRepository extends CrudRepository<ResidentesModel, Integer> {
    public ArrayList<ResidentesModel> findByprimerApellido(String primerApellido);

}
