package io.codelex.ordercheckengine;

import io.codelex.ordercheckengine.api.PrivateCustomerRegRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerRegistrationController {

    @PostMapping("/register/private")
    private void privateCustomerRegistrationRequest(@RequestBody PrivateCustomerRegRequest regRequest){

    }


}
