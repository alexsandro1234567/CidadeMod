import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class RaceSystem {
    private final List<RaceTrack> tracks = new ArrayList<>();
    private final Map<UUID, RaceStats> playerStats = new HashMap<>();
    
    public class RaceTrack {
        private final List<CheckPoint> checkpoints;
        private final int laps;
        private final List<RaceParticipant> participants = new ArrayList<>();
        private RaceState state = RaceState.WAITING;
        
        public void startRace() {
            state = RaceState.COUNTDOWN;
            // Inicia contagem regressiva
            scheduleCountdown(() -> {
                state = RaceState.RACING;
                participants.forEach(RaceParticipant::start);
            });
        }
        
        public void updatePositions() {
            participants.sort((p1, p2) -> 
                Integer.compare(p2.getCheckpointsPassed(), p1.getCheckpointsPassed()));
        }
    }
} 