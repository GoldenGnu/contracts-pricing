/*
 * Contracts Appraisal
 * This is a an api to provide EVE Online pricing based on public contracts. Results are cached as shown in the Expires header. You can download the swagger.json at https://api.swaggerhub.com/apis/rihanshazih/contracts-appraisal/1.2.0/swagger.json
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eve.nikr.net.client.api;

import eve.nikr.net.client.ApiCallback;
import eve.nikr.net.client.ApiClient;
import eve.nikr.net.client.ApiException;
import eve.nikr.net.client.ApiResponse;
import eve.nikr.net.client.Configuration;
import eve.nikr.net.client.Pair;
import eve.nikr.net.client.ProgressRequestBody;
import eve.nikr.net.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import eve.nikr.net.client.model.Feedback;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedbackApi {
    private ApiClient apiClient;

    public FeedbackApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FeedbackApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for giveFeedback
     * @param feedback The feedback to create. (optional)
     * @param callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call giveFeedbackCall(Feedback feedback, final ApiCallback callback) throws ApiException {
        Object localVarPostBody = feedback;

        // create path and map variables
        String localVarPath = "/feedback";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call giveFeedbackValidateBeforeCall(Feedback feedback, final ApiCallback callback) throws ApiException {
        

        com.squareup.okhttp.Call call = giveFeedbackCall(feedback, callback);
        return call;

    }

    /**
     * Give feedback on pricing information
     * 
     * @param feedback The feedback to create. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void giveFeedback(Feedback feedback) throws ApiException {
        giveFeedbackWithHttpInfo(feedback);
    }

    /**
     * Give feedback on pricing information
     * 
     * @param feedback The feedback to create. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> giveFeedbackWithHttpInfo(Feedback feedback) throws ApiException {
        com.squareup.okhttp.Call call = giveFeedbackValidateBeforeCall(feedback, null);
        return apiClient.execute(call);
    }

    /**
     * Give feedback on pricing information (asynchronously)
     * 
     * @param feedback The feedback to create. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call giveFeedbackAsync(Feedback feedback, final ApiCallback<Void> callback) throws ApiException {

        com.squareup.okhttp.Call call = giveFeedbackValidateBeforeCall(feedback, callback);
        apiClient.executeAsync(call, callback);
        return call;
    }
}