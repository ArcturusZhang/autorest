/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.modelflattening;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.modelflattening.models.ErrorException;
import fixtures.modelflattening.models.FlattenedProduct;
import fixtures.modelflattening.models.FlattenParameterGroup;
import fixtures.modelflattening.models.Resource;
import fixtures.modelflattening.models.ResourceCollection;
import fixtures.modelflattening.models.SimpleProduct;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The interface for AutoRestResourceFlatteningTestService class.
 */
public interface AutoRestResourceFlatteningTestService {
    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://localhost";

    /**
     * Put External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putArray() throws ErrorException, IOException;

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putArrayAsync(final ServiceCallback<Void> serviceCallback);
    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putArray(List<Resource> resourceArray) throws ErrorException, IOException;

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback);

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<FlattenedProduct>> getArray() throws ErrorException, IOException;

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<List<FlattenedProduct>> getArrayAsync(final ServiceCallback<List<FlattenedProduct>> serviceCallback);

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putDictionary() throws ErrorException, IOException;

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDictionaryAsync(final ServiceCallback<Void> serviceCallback);
    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putDictionary(Map<String, FlattenedProduct> resourceDictionary) throws ErrorException, IOException;

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, final ServiceCallback<Void> serviceCallback);

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, FlattenedProduct&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Map<String, FlattenedProduct>> getDictionary() throws ErrorException, IOException;

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Map<String, FlattenedProduct>> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProduct>> serviceCallback);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putResourceCollection() throws ErrorException, IOException;

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putResourceCollectionAsync(final ServiceCallback<Void> serviceCallback);
    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putResourceCollection(ResourceCollection resourceComplexObject) throws ErrorException, IOException;

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putResourceCollectionAsync(ResourceCollection resourceComplexObject, final ServiceCallback<Void> serviceCallback);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ResourceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceCollection> getResourceCollection() throws ErrorException, IOException;

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<ResourceCollection> getResourceCollectionAsync(final ServiceCallback<ResourceCollection> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the SimpleProduct object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SimpleProduct> putSimpleProduct() throws ErrorException, IOException;

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> putSimpleProductAsync(final ServiceCallback<SimpleProduct> serviceCallback);
    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the SimpleProduct object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SimpleProduct> putSimpleProduct(SimpleProduct simpleBodyProduct) throws ErrorException, IOException;

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param simpleBodyProduct Simple body product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> putSimpleProductAsync(SimpleProduct simpleBodyProduct, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SimpleProduct object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SimpleProduct> postFlattenedSimpleProduct(String productId, String maxProductDisplayName) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, final ServiceCallback<SimpleProduct> serviceCallback);
    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SimpleProduct object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SimpleProduct> postFlattenedSimpleProduct(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put Flattened Simple Product with client flattening true on the parameter.
     *
     * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param maxProductDisplayName Display name of product.
     * @param description Description of product.
     * @param genericValue Generic URL value.
     * @param odatavalue URL value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> postFlattenedSimpleProductAsync(String productId, String maxProductDisplayName, String description, String genericValue, String odatavalue, final ServiceCallback<SimpleProduct> serviceCallback);

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SimpleProduct object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SimpleProduct> putSimpleProductWithGrouping(FlattenParameterGroup flattenParameterGroup) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put Simple Product with client flattening true on the model.
     *
     * @param flattenParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<SimpleProduct> putSimpleProductWithGroupingAsync(FlattenParameterGroup flattenParameterGroup, final ServiceCallback<SimpleProduct> serviceCallback);

}
