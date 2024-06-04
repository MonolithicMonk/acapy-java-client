/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credentials;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class CredentialPreview {

    @SerializedName("@type")
    private String type = "issue-credential/1.0/credential-preview";

    private List<CredentialAttributes> attributes;

    public CredentialPreview(List<CredentialAttributes> attributes) {
        super();
        this.attributes = attributes;
    }
}
