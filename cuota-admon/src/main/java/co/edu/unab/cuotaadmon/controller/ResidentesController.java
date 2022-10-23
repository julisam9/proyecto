package co.edu.unab.cuotaadmon.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.cuotaadmon.model.ResidentesModel;
import co.edu.unab.cuotaadmon.service.ResidentesServices;

@RestController
@RequestMapping("/residentes")
public class ResidentesController {
    @Autowired
    ResidentesServices residentesServices;

    /**
     * @return
     */

    @GetMapping("/residente")
    public ArrayList<ResidentesModel> getResidentes() {
        return residentesServices.getAllResidentes();
    }

}
