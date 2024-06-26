/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hyperledger.acy_py.generated.model.ConnectionInvitation;

@Data @NoArgsConstructor @AllArgsConstructor
public class CreateInvitationResponse {
    private String connectionId;
    private ConnectionInvitation invitation;
    private String invitationUrl;
}
