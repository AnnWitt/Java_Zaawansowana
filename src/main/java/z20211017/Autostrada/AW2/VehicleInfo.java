package z20211017.Autostrada.AW2;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

//tu powinno by @Data jakby Map/Set z Vehicle
@Data
@RequiredArgsConstructor
public class VehicleInfo {

    final String numerRejestracyjny;
    final CarType typPojazdu;
    final LocalDateTime dataWjazdu;



}
