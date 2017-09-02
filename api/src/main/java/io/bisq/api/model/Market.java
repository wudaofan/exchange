package io.bisq.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Market {
    @JsonProperty
    String pair;
    @JsonProperty
    String lsymbol;
    @JsonProperty
    String rsymbol;

    public Market(String lsymbol, String rsymbol) {
        this.pair = lsymbol.toLowerCase() + "_" + rsymbol.toLowerCase();
        this.lsymbol = lsymbol;
        this.rsymbol = rsymbol;
    }
}