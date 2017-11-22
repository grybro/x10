package com.x10.Dao;

import com.x10.Entity.Unit;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UnitDao {

    private static Map<Integer, Unit> units;

    static {
        units = new HashMap<Integer, Unit>(){
            {
                put(1, new Unit(1, 'G', 1, "Bedroom", "Bedroom"));
                put(2, new Unit(2, 'G', 2, "LivingRoom", "LivingRoom"));
                put(3, new Unit(3, 'G', 3, "Kitchen", "Kitchen"));
            }
        };
    }
    public Collection<Unit> getAllUnits(){
        return this.units.values();
    }

    public Unit getUnitById(int id) {
        return this.units.get(id);
    }

    public void removeUnitById(int id) {
        this.units.remove(id);
    }

    public void updateUnit(Unit unit) {
        Unit u = units.get(unit.getId());
        u.setHouseCode(unit.getHouseCode());
        u.setUnitCode(unit.getUnitCode());
        u.setName(unit.getName());
        u.setDescription(unit.getDescription());
        units.put(unit.getId(),unit);
    }

    public void insertUnit(Unit unit) {
        this.units.put(unit.getId(),unit);
    }
}
