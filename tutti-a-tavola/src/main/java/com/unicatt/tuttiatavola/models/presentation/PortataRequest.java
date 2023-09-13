package com.unicatt.tuttiatavola.models.presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortataRequest {
    private Long idRicetta;
    private Long numeroPersone;
}
