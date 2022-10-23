package co.edu.unab.cuotaadmon.service;

import java.util.ArrayList;

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
}
