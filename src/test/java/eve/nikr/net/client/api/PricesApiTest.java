/*
 * Contracts Appraisal
 * This is a an api to provide EVE Online pricing based on public contracts. Results are cached as shown in the Expires header. You can download the swagger.json at https://api.swaggerhub.com/apis/rihanshazih/contracts-appraisal/1.2.0/swagger.json
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eve.nikr.net.client.api;

import eve.nikr.net.client.ApiException;
import eve.nikr.net.client.model.Prices;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PricesApi
 */
@Ignore
public class PricesApiTest {

    private final PricesApi api = new PricesApi();

    
    /**
     * Get price information for a type id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPricesTest() throws ApiException {
        Integer typeId = null;
        Boolean includePrivate = null;
        Boolean bpc = null;
        List<String> security = null;
        Integer materialEfficiency = null;
        Integer timeEfficiency = null;
        Prices response = api.getPrices(typeId, includePrivate, bpc, security, materialEfficiency, timeEfficiency);

        // TODO: test validations
    }
    
}
