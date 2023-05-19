package com.tuttiatavola.tuttiatavola.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Ricetta {


    private final UUID id;
    @NonNull
    private final String name;

    public Ricetta(@JsonProperty("id") UUID id, @NonNull @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
