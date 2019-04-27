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


package eve.nikr.net.client.auth;

import eve.nikr.net.client.Pair;

import java.util.Map;
import java.util.List;


public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
