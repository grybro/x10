package com.x10.Service;

import com.x10.Dao.UnitDao;
import com.x10.Entity.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UnitService {

    @Autowired
    private UnitDao unitDao;

    public Collection<Unit> getAllUnits(){
        return this.unitDao.getAllUnits();
    }

    public Unit getUnitById(int id) {
        return this.unitDao.getUnitById(id);
    }

    public void removeUnitById(int id) {
        this.unitDao.removeUnitById(id);
    }

    public void updateUnit(Unit unit){
        this.unitDao.updateUnit(unit);
    }

    public void insertUnit(Unit unit) {
        this.unitDao.insertUnit(unit);
    }
}
