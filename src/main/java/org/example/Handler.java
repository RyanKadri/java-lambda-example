package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;

import java.util.Map;

public class Handler implements RequestHandler<APIGatewayV2HTTPEvent, String> {

    @Override
    public String handleRequest(APIGatewayV2HTTPEvent event, Context context) {
        var logger = context.getLogger();
        logger.log("Our lambda was called!!");
        logger.log(event.toString());
        logger.log(event.getBody());
        return "Hello";
    }
}
