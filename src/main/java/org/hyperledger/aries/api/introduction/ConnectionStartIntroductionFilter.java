/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.introduction;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.hyperledger.aries.api.AcaPyRequestFilter;

@Data @Builder
public final class ConnectionStartIntroductionFilter implements AcaPyRequestFilter {
    @NonNull private String targetConnectionId;
    private String message;
}
