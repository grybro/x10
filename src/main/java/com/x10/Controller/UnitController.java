package com.x10.Controller;

import com.x10.Entity.Unit;
import com.x10.Service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/x10")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Unit> getAllUnits(){
        return unitService.getAllUnits();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Unit getUnitById(@PathVariable("id") int id) {
        return unitService.getUnitById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUnitById(@PathVariable("id") int id) {
        unitService.removeUnitById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUnit(@RequestBody Unit unit) {
        unitService.updateUnit(unit);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertUnit(@RequestBody Unit unit) {
        unitService.insertUnit(unit);
    }

}
