package plus.aos.jaos.core.response.history.transaction;

import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
public class Transaction {
    private Long cpuUsageUs;
    private Long netUsageWords;
    private String status;
    
    @JsonDeserialize(using = TrxDeserializer.class)
    // nullable
    private Optional<Trx> trx;
}
