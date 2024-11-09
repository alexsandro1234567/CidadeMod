import java.util.HashMap;
import java.util.Map;

public class NPCSchedule {
    private final Map<Integer, Activity> dailySchedule = new HashMap<>();
    
    public NPCSchedule() {
        // Horários baseados no tempo do Minecraft (0-24000)
        dailySchedule.put(0, Activity.SLEEP);    // Noite
        dailySchedule.put(6000, Activity.WORK);  // Manhã
        dailySchedule.put(12000, Activity.BREAK); // Meio-dia
        dailySchedule.put(13000, Activity.WORK);  // Tarde
        dailySchedule.put(18000, Activity.SOCIALIZE); // Fim de tarde
        dailySchedule.put(22000, Activity.SLEEP);    // Noite
    }
    
    public Activity getCurrentActivity(long worldTime) {
        int timeOfDay = (int) (worldTime % 24000);
        return dailySchedule.entrySet().stream()
            .filter(entry -> entry.getKey() <= timeOfDay)
            .reduce((first, second) -> second)
            .map(Map.Entry::getValue)
            .orElse(Activity.IDLE);
    }
} 