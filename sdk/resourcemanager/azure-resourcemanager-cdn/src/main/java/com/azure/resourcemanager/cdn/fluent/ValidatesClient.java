// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.fluent.models.ValidateSecretOutputInner;
import com.azure.resourcemanager.cdn.models.ValidateSecretInput;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ValidatesClient. */
public interface ValidatesClient {
    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ValidateSecretOutputInner>> secretWithResponseAsync(ValidateSecretInput validateSecretInput);

    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ValidateSecretOutputInner> secretAsync(ValidateSecretInput validateSecretInput);

    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateSecretOutputInner secret(ValidateSecretInput validateSecretInput);

    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateSecretOutputInner> secretWithResponse(ValidateSecretInput validateSecretInput, Context context);
}
