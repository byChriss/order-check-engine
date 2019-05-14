package io.codelex.ordercheckengine;

import io.codelex.ordercheckengine.api.CorporateRequest;
import io.codelex.ordercheckengine.api.PrivatePersonRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CardIssueController {

    @PostMapping("/card/apply-private")
    private void applyForPrivateCardRequest(PrivatePersonRequest request){

    }

    @PostMapping("/card/apply-corporate")
    private void applyForCorporateCardRequest(CorporateRequest request){

    }


}
