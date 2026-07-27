package service;

import java.util.PriorityQueue;
import java.util.Queue;

import model.EmergencyCase;
import utils.EmergencyComparator;

public class EmergencyService {
    private final Queue<EmergencyCase> cases;

    public EmergencyService() {
        cases = new PriorityQueue<>(new EmergencyComparator());
    }

    public boolean registerCase(EmergencyCase ec){
        return cases.offer(ec);
    }

    public EmergencyCase nextPacient(){
        return cases.peek();
    }

    public EmergencyCase attendPacient(){
        return cases.poll();
    }

    public int pendingPatient(){
        return cases.size();
    }

    public void processAllPatients(){
        while (!cases.isEmpty()) {
            EmergencyCase patient = cases.poll();
            System.out.println("Atendiendo -> "+ patient);
        }
    }
    
}
