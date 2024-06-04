/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class EndpointResult {
    private String myEndpoint;
    private String theirEndpoint;
}
