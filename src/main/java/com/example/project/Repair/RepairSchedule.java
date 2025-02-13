package com.example.project.Repair;
import java.util.ArrayList;

public class RepairSchedule {
    /** Each element represents a repair by an individual mechanic in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;

    /** Constructs a RepairSchedule object.
     * Precondition: n >= 0
     */
    public RepairSchedule(int n) {
        /* to be implemented in part (a) */
        numberOfMechanics = n;
        schedule = new ArrayList<CarRepair>();
    }

    public ArrayList<CarRepair> getSchedule() {
        return schedule;
    }

    /** Attempts to schedule a repair by a given mechanic in a given bay as described in part (a).
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b) {
        if (schedule.size() == 0) {
            schedule.add(new CarRepair(m, b));
            return true;
        } else {
            for (int i = 0; i < schedule.size(); i++) {
                if (schedule.get(i).getMechanicNum() == m) {
                    return false;
                }
                if (schedule.get(i).getBayNum() == b) {
                    return false;
                }
                schedule.add(new CarRepair(m, b));
                return true;
            }
        }
        return true;
    }

    /** Returns an ArrayList containing the mechanic identifiers of all available mechanics,
     * as described in part (b).
     */
    public ArrayList<Integer> availableMechanics() {
        ArrayList<Integer> availableMechs = new ArrayList<Integer>();
        for (int i = 0; i < numberOfMechanics; i++) {
            availableMechs.add(i);
        }
        for (int j = 0; j < availableMechs.size(); j++) {
            for (int k = 0; k < schedule.size(); k++) {
                if (availableMechs.get(j) == schedule.get(k).getMechanicNum()) {
                    availableMechs.remove(j);
                }
            }
        }
        return availableMechs;
    }

    /** Removes an element from schedule when a repair is complete.
        THIS METHOD HAS BEEN ADDED FOR ILLUSTRATIVE PURPOSES ONLY,
        AS DESCRIBED IN PART B; you do NOT need to call this
        method as part of your solution to part B
      */
    public void carOut(int b)
    {
        for (int i = 0; i < schedule.size(); i++)
        {
            CarRepair carAtIdx = schedule.get(i);
            if (carAtIdx.getBayNum() == b)
            {
                schedule.remove(i);
            }
        }
    }
}
