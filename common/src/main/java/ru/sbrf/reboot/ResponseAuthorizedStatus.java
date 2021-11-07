package ru.sbrf.reboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAuthorizedStatus {

    private boolean isAuthorized;

}
