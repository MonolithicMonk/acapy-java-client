/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.issue_credential_v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public enum CredentialExchangeInitiator {
    @JsonProperty("self")
    @SerializedName("self")
    SELF,

    @JsonProperty("external")
    @SerializedName("external")
    EXTERNAL
}
