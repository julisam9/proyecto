package co.edu.unab.cuotaadmon.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.cuotaadmon.model.ResidentesModel;
import co.edu.unab.cuotaadmon.repository.ResidentesRepository;

@Service
public class ResidentesServices {
    @Autowired
    ResidentesRepository residentesRepository;

    public ArrayList<ResidentesModel> getAllResidentes() {
        return (ArrayList<ResidentesModel>) residentesRepository.findAll();
    }

    public Optional<ResidentesModel> getResidentesById(int id) {
        return residentesRepository.findById(id);
    }

    public String saveResidentes(ResidentesModel residente) {
        boolean existe = residentesRepository.existsById(residente.getIdResidente());
        residentesRepository.save(residente);
        if (existe)
            return "Residente actualizado";
        else
            return "Residente guardado";
    }

    public String deleteResidentes(int id) {
        try {
            residentesRepository.deleteById(id);
            return "Borrado exitoso";
        } catch (Exception e) {
            return "Error";
        }
    }

    public ArrayList<ResidentesModel> getResidenteByprimerApellido(String primerApellido) {
        return residentesRepository.findByprimerApellido(primerApellido);
    }

}
