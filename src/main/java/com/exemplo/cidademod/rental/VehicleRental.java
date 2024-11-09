import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class VehicleRental {
    private final Map<String, RentalVehicle> availableVehicles = new HashMap<>();
    private final Map<UUID, List<RentalContract>> activeRentals = new HashMap<>();
    
    public class RentalContract {
        private final UUID playerId;
        private final String vehicleId;
        private final long startTime;
        private final long duration;
        private final double price;
        
        public boolean isValid() {
            return System.currentTimeMillis() - startTime < duration;
        }
        
        public void returnVehicle() {
            if (!isValid()) {
                // Aplica multa por atraso
                applyLateFee();
            }
            // Retorna veículo ao estoque
            makeVehicleAvailable(vehicleId);
        }
    }
} 