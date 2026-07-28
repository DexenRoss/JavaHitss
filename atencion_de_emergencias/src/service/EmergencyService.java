package service;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import model.EmergencyCase;
import utils.EmergencyComparator;

public class EmergencyService {
    private Comparator<EmergencyCase> comparator= Comparator.comparingInt(EmergencyCase::priority).thenComparing(EmergencyCase::arrivalTime);
    private final Queue<EmergencyCase> cases;

    public EmergencyService() {
        //cases = new PriorityQueue<>(new EmergencyComparator());
        cases = new PriorityQueue<>(comparator);
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

    public void showAllPatients(){
        cases.forEach(p->System.out.println(p));
    }
    
}
