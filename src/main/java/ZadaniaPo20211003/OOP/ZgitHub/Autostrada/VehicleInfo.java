package ZadaniaPo20211003.OOP.ZgitHub.Autostrada;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

//tu powinno by @Data jakby Map/Set z Vehicle
@Data
@RequiredArgsConstructor
 class VehicleInfo {

    final String numerRejestracyjny;
    final CarType typPojazdu;
    final LocalDateTime dataWjazdu;
    LocalDateTime dataZjazdu;


}
