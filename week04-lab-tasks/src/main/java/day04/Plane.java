package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passanger> passangers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassanger(Passanger passanger) {
        if (passangers.size() < maxCapacity) {
            passangers.add(passanger);
            return true;
        } else {
            return false;
        }
    }

    public int numberOfPackages() {
        int packages = 0;
        for (Passanger passanger: passangers) {
            packages += passanger.getPackages();
        }
        return packages;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passanger> getPassangers() {
        return passangers;
    }
}
