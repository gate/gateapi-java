package io.gate.apidemo;

import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.api.FuturesApi;
import io.gate.gateapi.api.SpotApi;
import io.gate.gateapi.models.Order;

/** One public example authentication boundary shared by all demo commands. */
final class ExampleAuth {
    private ExampleAuth() { }

    static ApiClient create(RunConfig config) {
        ApiClient client = new ApiClient();
        client.setBasePath(config.getHostUsed());
        client.setApiKeySecret(config.getApiKey(), config.getApiSecret());
        return client;
    }

    // Keep variant-specific managed-user parameters at the example's existing SDK boundary.
    static void cancelFuture(FuturesApi api, String settle, String id) throws ApiException {
        api.cancelFuturesOrder(settle, id, null, null);
    }

    static Order cancelSpot(SpotApi api, String id, String pair) throws ApiException {
        return api.cancelOrder(id, pair, "spot", null, null);
    }
}
