/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.powerbi.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.management.powerbi.ErrorException;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the PowerBIEmbeddedManagementClientImpl class.
 */
public class PowerBIEmbeddedManagementClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private PowerBIEmbeddedManagementClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets subscription credentials which uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Gets subscription credentials which uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public PowerBIEmbeddedManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public PowerBIEmbeddedManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public PowerBIEmbeddedManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public PowerBIEmbeddedManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The WorkspaceCollectionsInner object to access its operations.
     */
    private WorkspaceCollectionsInner workspaceCollections;

    /**
     * Gets the WorkspaceCollectionsInner object to access its operations.
     * @return the WorkspaceCollectionsInner object.
     */
    public WorkspaceCollectionsInner workspaceCollections() {
        return this.workspaceCollections;
    }

    /**
     * The WorkspacesInner object to access its operations.
     */
    private WorkspacesInner workspaces;

    /**
     * Gets the WorkspacesInner object to access its operations.
     * @return the WorkspacesInner object.
     */
    public WorkspacesInner workspaces() {
        return this.workspaces;
    }

    /**
     * Initializes an instance of PowerBIEmbeddedManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public PowerBIEmbeddedManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of PowerBIEmbeddedManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public PowerBIEmbeddedManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of PowerBIEmbeddedManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public PowerBIEmbeddedManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2016-01-29";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.workspaceCollections = new WorkspaceCollectionsInner(restClient().retrofit(), this);
        this.workspaces = new WorkspacesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "PowerBIEmbeddedManagementClient", "2016-01-29");
    }

    private void initializeService() {
        service = restClient().retrofit().create(PowerBIEmbeddedManagementClientService.class);
    }

    /**
     * The interface defining all the services for PowerBIEmbeddedManagementClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PowerBIEmbeddedManagementClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.powerbi.PowerBIEmbeddedManagementClient getAvailableOperations" })
        @GET("providers/Microsoft.PowerBI/operations")
        Observable<Response<ResponseBody>> getAvailableOperations(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Indicates which operations can be performed by the Power BI Resource Provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationListInner object if successful.
     */
    public OperationListInner getAvailableOperations() {
        return getAvailableOperationsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Indicates which operations can be performed by the Power BI Resource Provider.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationListInner> getAvailableOperationsAsync(final ServiceCallback<OperationListInner> serviceCallback) {
        return ServiceFuture.fromResponse(getAvailableOperationsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Indicates which operations can be performed by the Power BI Resource Provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListInner object
     */
    public Observable<OperationListInner> getAvailableOperationsAsync() {
        return getAvailableOperationsWithServiceResponseAsync().map(new Func1<ServiceResponse<OperationListInner>, OperationListInner>() {
            @Override
            public OperationListInner call(ServiceResponse<OperationListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Indicates which operations can be performed by the Power BI Resource Provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListInner object
     */
    public Observable<ServiceResponse<OperationListInner>> getAvailableOperationsWithServiceResponseAsync() {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.getAvailableOperations(this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationListInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationListInner> clientResponse = getAvailableOperationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationListInner> getAvailableOperationsDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<OperationListInner, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<OperationListInner>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}