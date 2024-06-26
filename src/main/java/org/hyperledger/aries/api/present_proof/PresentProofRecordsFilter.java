/*
 * Copyright (c) 2020-2024 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/MonolithicMonk/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

import lombok.Builder;
import lombok.Data;
import org.hyperledger.aries.api.AcaPyRequestFilter;

import javax.annotation.Nullable;

@Data @Builder
public class PresentProofRecordsFilter implements AcaPyRequestFilter {
    @Nullable private String connectionId;
    @Nullable private PresentationExchangeRole role;
    @Nullable private PresentationExchangeState state;
    @Nullable private String threadId;
}
