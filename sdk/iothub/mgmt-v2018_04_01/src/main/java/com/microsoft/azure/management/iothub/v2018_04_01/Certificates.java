/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.CertificatesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Certificates.
 */
public interface Certificates extends SupportsCreating<CertificateDescription.DefinitionStages.Blank>, HasInner<CertificatesInner> {
    /**
     * Get the certificate list.
     * Returns the list of certificates.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateListDescription> listByIotHubAsync(String resourceGroupName, String resourceName);

    /**
     * Generate verification code for proof of possession flow.
     * Generates verification code for proof of possession flow. The verification code will be used to generate a leaf certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate
     * @param ifMatch ETag of the Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateWithNonceDescription> generateVerificationCodeAsync(String resourceGroupName, String resourceName, String certificateName, String ifMatch);

    /**
     * Verify certificate's private key possession.
     * Verifies the certificate's private key possession by providing the leaf cert issued by the verifying pre uploaded certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate
     * @param ifMatch ETag of the Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateDescription> verifyAsync(String resourceGroupName, String resourceName, String certificateName, String ifMatch);

    /**
     * Get the certificate.
     * Returns the certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateDescription> getAsync(String resourceGroupName, String resourceName, String certificateName);

    /**
     * Delete an X509 certificate.
     * Deletes an existing X509 certificate or does nothing if it does not exist.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param certificateName The name of the certificate
     * @param ifMatch ETag of the Certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String resourceName, String certificateName, String ifMatch);

}
