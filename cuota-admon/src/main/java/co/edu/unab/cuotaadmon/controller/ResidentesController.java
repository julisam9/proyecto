package co.edu.unab.cuotaadmon.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import co.edu.unab.cuotaadmon.model.ResidentesModel;
import co.edu.unab.cuotaadmon.service.ResidentesServices;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
@RequestMapping(path = "/residentes")
public class ResidentesController {
    @Autowired
    ResidentesServices residentesServices;

    /**
     * @return
     */

    @GetMapping(path = "/all")
    public ArrayList<ResidentesModel> getResidentes() {
        return residentesServices.getAllResidentes();
    }

    @GetMapping(path = "/{id}")
    public Optional<ResidentesModel> getResidentesById(@PathVariable("id") int id) {
        return residentesServices.getResidentesById(id);
    }

    @PostMapping(path = "/guardar")
    public String guardarResidente(@RequestBody ResidentesModel residente) {
        return residentesServices.saveResidentes(residente);

    }

    @DeleteMapping(path = "/{id}")
    public String borrarResidente(@PathVariable("id") int id) {
        return residentesServices.deleteResidentes(id);

    }

}
