package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Body10;
import io.swagger.model.Body11;
import io.swagger.model.Body12;
import io.swagger.model.Body13;
import io.swagger.model.Body14;
import io.swagger.model.Body15;
import io.swagger.model.Body16;
import io.swagger.model.Body2;
import io.swagger.model.Body3;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import io.swagger.model.Body6;
import io.swagger.model.Body7;
import io.swagger.model.Body8;
import io.swagger.model.Body9;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20013;
import io.swagger.model.InlineResponse20014;
import io.swagger.model.InlineResponse20015;
import io.swagger.model.InlineResponse20016;
import io.swagger.model.InlineResponse20017;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse201;
import io.swagger.model.InlineResponse2011;
import io.swagger.model.InlineResponse2012;
import io.swagger.model.InlineResponse2013;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
@Controller
public class CustomerCampaignExecutionApiController implements CustomerCampaignExecutionApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerCampaignExecutionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerCampaignExecutionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse201> activateSDCustomerCampaignExecution(@ApiParam(value = "SDCustomerCampaignExecution Request Payload" ,required=true )  @Valid @RequestBody Body body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse201>(objectMapper.readValue("{\n  \"serviceDomainServicingSessionStatus\" : \"serviceDomainServicingSessionStatus\",\n  \"serviceDomainServicingSessionReference\" : \"SSSR783215\",\n  \"serviceDomainServicingSessionRecord\" : { },\n  \"serviceDomainActivationActionTaskReference\" : \"SAATR758836\",\n  \"serviceDomainActivationActionTaskRecord\" : { },\n  \"serviceDomainServiceConfigurationRecord\" : {\n    \"serviceDomainServiceStatus\" : \"serviceDomainServiceStatus\",\n    \"serviceDomainServiceConfigurationSettingDescription\" : \"serviceDomainServiceConfigurationSettingDescription\",\n    \"serviceDomainServiceConfigurationSetup\" : {\n      \"serviceDomainServiceConfigurationParameter\" : \"serviceDomainServiceConfigurationParameter\"\n    },\n    \"serviceDomainServiceAgreement\" : {\n      \"serviceDomainServiceAgreementReference\" : \"791202\",\n      \"serviceDomainServiceAgreementTermsandConditions\" : \"serviceDomainServiceAgreementTermsandConditions\",\n      \"serviceDomainServiceUserReference\" : \"767210\"\n    },\n    \"serviceDomainServiceConfigurationSettingReference\" : \"700761\",\n    \"serviceDomainServiceSubscription\" : {\n      \"serviceDomainServiceSubscriberAccessProfile\" : \"serviceDomainServiceSubscriberAccessProfile\",\n      \"serviceDomainServiceSubscriberReference\" : \"769192\"\n    }\n  }\n}", InlineResponse201.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse201>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> configureSDCustomerCampaignExecution(@ApiParam(value = "SDCustomerCampaignExecution Configure Request Payload" ,required=true )  @Valid @RequestBody Body1 body,@ApiParam(value = "SDCustomerCampaignExecution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"serviceDomainServicingSessionStatus\" : \"serviceDomainServicingSessionStatus\",\n  \"serviceDomainConfigurationActionTaskRecord\" : { },\n  \"serviceDomainConfigurationActionTaskReference\" : \"SCATR765419\",\n  \"serviceDomainServiceConfigurationRecord\" : {\n    \"serviceDomainServiceStatus\" : \"serviceDomainServiceStatus\",\n    \"serviceDomainServiceConfigurationSettingDescription\" : \"serviceDomainServiceConfigurationSettingDescription\",\n    \"serviceDomainServiceConfigurationSetup\" : {\n      \"serviceDomainServiceConfigurationParameter\" : \"serviceDomainServiceConfigurationParameter\"\n    },\n    \"serviceDomainServiceAgreement\" : {\n      \"serviceDomainServiceAgreementReference\" : \"721156\",\n      \"serviceDomainServiceAgreementTermsandConditions\" : \"serviceDomainServiceAgreementTermsandConditions\",\n      \"serviceDomainServiceUserReference\" : \"733696\"\n    },\n    \"serviceDomainServiceSubscription\" : {\n      \"serviceDomainServiceSubscriberAccessProfile\" : \"serviceDomainServiceSubscriberAccessProfile\",\n      \"serviceDomainServiceSubscriberReference\" : \"756221\"\n    }\n  }\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2004> controlCustomerCampaignProcedureUpdate(@ApiParam(value = "Customer Campaign Procedure Request Payload" ,required=true )  @Valid @RequestBody Body5 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\n  \"customerCampaignProcedureControlActionTaskRecord\" : { },\n  \"customerCampaignProcedureControlActionResponse\" : \"customerCampaignProcedureControlActionResponse\",\n  \"customerCampaignProcedureControlActionTaskReference\" : \"CCPCATR772896\"\n}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20010> exchangeCustomerCampaignProcedureCandidateSelectionUpdate(@ApiParam(value = "CandidateSelection request payload" ,required=true )  @Valid @RequestBody Body10 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "CandidateSelection Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20010>(objectMapper.readValue("{\n  \"candidateSelectionExchangeActionResponse\" : \"candidateSelectionExchangeActionResponse\",\n  \"candidateSelectionExchangeActionTaskReference\" : \"CSEATR790034\",\n  \"candidateSelectionExchangeActionTaskRecord\" : { },\n  \"candidateSelectionInstanceStatus\" : \"candidateSelectionInstanceStatus\"\n}", InlineResponse20010.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20010>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20010>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2005> exchangeCustomerCampaignProcedureUpdate(@ApiParam(value = "Customer Campaign Procedure Request Payload" ,required=true )  @Valid @RequestBody Body6 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2005>(objectMapper.readValue("{\n  \"customerCampaignProcedureExchangeActionResponse\" : \"customerCampaignProcedureExchangeActionResponse\",\n  \"customerCampaignProcedureExchangeActionTaskReference\" : \"CCPEATR792588\",\n  \"customerCampaignProcedureExchangeActionTaskRecord\" : { }\n}", InlineResponse2005.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2005>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2005>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2006> executeCustomerCampaignProcedureUpdate(@ApiParam(value = "Customer Campaign Procedure Request Payload" ,required=true )  @Valid @RequestBody Body7 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{\n  \"executeRecordReference\" : \"ERR745186\",\n  \"customerCampaignProcedureExecuteActionTaskRecord\" : { },\n  \"executeResponseRecord\" : { },\n  \"customerCampaignProcedureExecuteActionTaskReference\" : \"CCPEATR733401\"\n}", InlineResponse2006.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> feedbackSDCustomerCampaignExecution(@ApiParam(value = "SDCustomerCampaignExecution Feedback Request Payload" ,required=true )  @Valid @RequestBody Body2 body,@ApiParam(value = "SDCustomerCampaignExecution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"serviceDomainFeedbackActionTaskReference\" : \"SFATR765157\",\n  \"serviceDomainFeedbackActionRecord\" : {\n    \"employeeBusinessUnitReference\" : \"769031\",\n    \"feedbackRecordStatus\" : \"feedbackRecordStatus\",\n    \"feedbackRecordDateTime\" : \"09-22-2018\"\n  },\n  \"serviceDomainFeedbackActionTaskRecord\" : { }\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2011> initiateCustomerCampaignProcedure(@ApiParam(value = "CustomerCampaignProcedure Request Payload" ,required=true )  @Valid @RequestBody Body3 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2011>(objectMapper.readValue("{\n  \"customerCampaignProcedureInitiateActionRecord\" : { },\n  \"customerCampaignProcedureInstanceStatus\" : \"customerCampaignProcedureInstanceStatus\",\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"726890\",\n    \"customerCampaignProcedureResult\" : {\n      \"leadOpportunityProcedureInstanceReference\" : \"768183\",\n      \"customerCampaignProcedureLeadOpportunityDescription\" : \"customerCampaignProcedureLeadOpportunityDescription\"\n    },\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\",\n    \"customerCampaignConsumablesInventory\" : {\n      \"customerCampaignConsumableHolding\" : \"customerCampaignConsumableHolding\"\n    }\n  },\n  \"customerCampaignProcedureInstanceReference\" : \"CCPIR731200\",\n  \"customerCampaignProcedureInitiateActionReference\" : \"CCPIAR768266\"\n}", InlineResponse2011.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2011>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2011>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2013> initiateCustomerCampaignProcedureAnalysis(@ApiParam(value = "Customer Campaign Procedure Request Payload" ,required=true )  @Valid @RequestBody Body14 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2013>(objectMapper.readValue("{\n  \"analysisInstanceReference\" : \"AIR739404\",\n  \"analysisInstanceStatus\" : \"analysisInstanceStatus\",\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"724961\",\n    \"customerCampaignProcedureResult\" : {\n      \"leadOpportunityProcedureInstanceReference\" : \"708570\",\n      \"customerCampaignProcedureLeadOpportunityDescription\" : \"customerCampaignProcedureLeadOpportunityDescription\"\n    },\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\",\n    \"customerCampaignConsumablesInventory\" : {\n      \"customerCampaignConsumableHolding\" : \"customerCampaignConsumableHolding\"\n    }\n  },\n  \"analysisInitiateActionReference\" : \"AIAR719947\",\n  \"analysisInitiateActionRecord\" : { }\n}", InlineResponse2013.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2013>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2013>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2012> initiateCustomerCampaignProcedureExecution(@ApiParam(value = "Customer Campaign Procedure Request Payload" ,required=true )  @Valid @RequestBody Body11 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2012>(objectMapper.readValue("{\n  \"executionInitiateActionReference\" : \"EIAR724258\",\n  \"executionInstanceStatus\" : \"executionInstanceStatus\",\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"723564\",\n    \"customerCampaignProcedureResult\" : {\n      \"leadOpportunityProcedureInstanceReference\" : \"728450\",\n      \"customerCampaignProcedureLeadOpportunityDescription\" : \"customerCampaignProcedureLeadOpportunityDescription\"\n    },\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\",\n    \"customerCampaignConsumablesInventory\" : {\n      \"customerCampaignConsumableHolding\" : \"customerCampaignConsumableHolding\"\n    }\n  },\n  \"executionInstanceReference\" : \"EIR782908\",\n  \"executionInitiateActionRecord\" : { },\n  \"executionInstanceRecord\" : {\n    \"customerCampaignProcedureWorkTaskType\" : \"customerCampaignProcedureWorkTaskType\",\n    \"customerCampaignProcedureWorkTaskDateTime\" : \"09-22-2018\",\n    \"customerCampaignProcedureWorkTaskResult\" : \"customerCampaignProcedureWorkTaskResult\",\n    \"customerCampaignProcedureWorkTaskDescription\" : \"customerCampaignProcedureWorkTaskDescription\",\n    \"customerCampaignProcedureWorkTaskWorkProducts\" : \"customerCampaignProcedureWorkTaskWorkProducts\",\n    \"documentDirectoryEntryInstanceReference\" : \"700980\"\n  }\n}", InlineResponse2012.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2012>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20016> requestCustomerCampaignProcedureAnalysisUpdate(@ApiParam(value = "Analysis request payload" ,required=true )  @Valid @RequestBody Body16 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "Analysis Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20016>(objectMapper.readValue("{\n  \"analysisRequestActionTaskRecord\" : { },\n  \"analysisRequestRecordReference\" : \"ARRR754280\",\n  \"analysisRequestActionTaskReference\" : \"ARATR746185\",\n  \"requestResponseRecord\" : { }\n}", InlineResponse20016.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20016>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20016>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20013> requestCustomerCampaignProcedureExecutionUpdate(@ApiParam(value = "Execution request payload" ,required=true )  @Valid @RequestBody Body13 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "Execution Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20013>(objectMapper.readValue("{\n  \"executionRequestRecordReference\" : \"ERRR753184\",\n  \"executionRequestActionTaskRecord\" : { },\n  \"executionInstanceRecord\" : {\n    \"customerCampaignProcedureWorkTaskType\" : \"customerCampaignProcedureWorkTaskType\",\n    \"customerCampaignProcedureWorkTaskDateTime\" : \"09-22-2018\",\n    \"customerCampaignProcedureWorkTaskResult\" : \"customerCampaignProcedureWorkTaskResult\",\n    \"customerCampaignProcedureWorkTaskDescription\" : \"customerCampaignProcedureWorkTaskDescription\",\n    \"customerCampaignProcedureWorkTaskWorkProducts\" : \"customerCampaignProcedureWorkTaskWorkProducts\",\n    \"documentDirectoryEntryInstanceReference\" : \"777789\"\n  },\n  \"executionRequestActionTaskReference\" : \"ERATR767380\",\n  \"requestResponseRecord\" : { }\n}", InlineResponse20013.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20013>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20013>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2007> requestCustomerCampaignProcedureUpdate(@ApiParam(value = "Customer Campaign Procedure Request Payload" ,required=true )  @Valid @RequestBody Body8 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2007>(objectMapper.readValue("{\n  \"customerCampaignProcedureRequestActionTaskReference\" : \"CCPRATR730820\",\n  \"requestRecordReference\" : \"RRR724122\",\n  \"customerCampaignProcedureRequestActionTaskRecord\" : { },\n  \"requestResponseRecord\" : { }\n}", InlineResponse2007.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2007>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2007>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2008> retrieveCustomerCampaignExecution(@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "Query params from schema '#/definitions/CRCustomerCampaignProcedureRetrieveInputModel'") @Valid @RequestParam(value = "queryparams", required = false) String queryparams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2008>(objectMapper.readValue("{\n  \"customerCampaignProcedureRetrieveActionTaskRecord\" : { },\n  \"customerCampaignProcedureRetrieveActionTaskReference\" : \"CCPRATR709051\",\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"771908\",\n    \"customerCampaignProcedureResult\" : {\n      \"leadOpportunityProcedureInstanceReference\" : \"794765\",\n      \"customerCampaignProcedureLeadOpportunityDescription\" : \"customerCampaignProcedureLeadOpportunityDescription\"\n    },\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\",\n    \"customerCampaignConsumablesInventory\" : {\n      \"customerCampaignConsumableHolding\" : \"customerCampaignConsumableHolding\",\n      \"customerCampaignConsumableType\" : \"customerCampaignConsumableType\"\n    }\n  },\n  \"customerCampaignProcedureInstanceAnalysis\" : {\n    \"customerCampaignProcedureInstanceAnalysisReport\" : { },\n    \"customerCampaignProcedureInstanceAnalysisData\" : \"customerCampaignProcedureInstanceAnalysisData\",\n    \"customerCampaignProcedureInstanceAnalysisReportType\" : \"customerCampaignProcedureInstanceAnalysisReportType\"\n  },\n  \"customerCampaignProcedureInstanceReportRecord\" : {\n    \"customerCampaignProcedureInstanceReport\" : { },\n    \"customerCampaignProcedureInstanceReportData\" : \"customerCampaignProcedureInstanceReportData\",\n    \"customerCampaignProcedureInstanceReportType\" : \"customerCampaignProcedureInstanceReportType\"\n  },\n  \"customerCampaignProcedureRetrieveActionResponse\" : \"customerCampaignProcedureRetrieveActionResponse\"\n}", InlineResponse2008.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2008>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2008>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<String>> retrieveCustomerCampaignExecutionBehaviorQualifierReferenceIds(@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "Behavior Qualifier Name. ex- Analysis",required=true) @PathVariable("behavior-qualifier") String behaviorQualifier,@ApiParam(value = "Filter to refine the result set. ex- Analysis Instance Status = 'pending'") @Valid @RequestParam(value = "collection-filter", required = false) String collectionFilter) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("[ \"AnalysisID1\", \"AnalysisID2\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<String>> retrieveCustomerCampaignExecutionBehaviorQualifiers() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("[ \"CandidateSelection\", \"Execution\", \"Analysis\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<String>> retrieveCustomerCampaignExecutionReferenceIds(@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Filter to refine the result set. ex- CustomerCampaignExecution Instance Status='active'") @Valid @RequestParam(value = "collection-filter", required = false) String collectionFilter) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("[ \"ID726464\", \"ID7264642\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20017> retrieveCustomerCampaignProcedureAnalysis(@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "Analysis Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId,@ApiParam(value = "Query params from schema '#/definitions/BQAnalysisRetrieveInputModel'") @Valid @RequestParam(value = "queryparams", required = false) String queryparams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20017>(objectMapper.readValue("{\n  \"analysisInstanceAnalysis\" : {\n    \"analysisInstanceAnalysisRecord\" : { },\n    \"analysisInstanceAnalysisReport\" : { },\n    \"analysisInstanceAnalysisReportType\" : \"analysisInstanceAnalysisReportType\",\n    \"analysisInstanceAnalysisParameters\" : \"analysisInstanceAnalysisParameters\"\n  },\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"741928\",\n    \"customerCampaignProcedureResult\" : {\n      \"leadOpportunityProcedureInstanceReference\" : \"796841\",\n      \"customerCampaignProcedureLeadOpportunityDescription\" : \"customerCampaignProcedureLeadOpportunityDescription\"\n    },\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\",\n    \"customerCampaignConsumablesInventory\" : {\n      \"customerCampaignConsumableHolding\" : \"customerCampaignConsumableHolding\",\n      \"customerCampaignConsumableType\" : \"customerCampaignConsumableType\"\n    }\n  },\n  \"analysisRetrieveActionTaskRecord\" : { },\n  \"analysisInstanceReport\" : {\n    \"analysisInstanceReportParameters\" : \"analysisInstanceReportParameters\",\n    \"analysisInstanceReport\" : { },\n    \"analysisInstanceReportRecord\" : { },\n    \"analysisInstanceReportType\" : \"analysisInstanceReportType\"\n  },\n  \"analysisRetrieveActionTaskReference\" : \"ARATR770562\",\n  \"analysisRetrieveActionResponse\" : \"analysisRetrieveActionResponse\"\n}", InlineResponse20017.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20017>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20017>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20011> retrieveCustomerCampaignProcedureCandidateSelection(@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "CandidateSelection Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId,@ApiParam(value = "Query params from schema '#/definitions/BQCandidateSelectionRetrieveInputModel'") @Valid @RequestParam(value = "queryparams", required = false) String queryparams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20011>(objectMapper.readValue("{\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"726615\",\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\"\n  },\n  \"candidateSelectionRetrieveActionTaskRecord\" : { },\n  \"candidateSelectionInstanceAnalysis\" : {\n    \"candidateSelectionInstanceAnalysisParameters\" : \"candidateSelectionInstanceAnalysisParameters\",\n    \"candidateSelectionInstanceAnalysisReport\" : { },\n    \"candidateSelectionInstanceAnalysisRecord\" : { },\n    \"candidateSelectionInstanceAnalysisReportType\" : \"candidateSelectionInstanceAnalysisReportType\"\n  },\n  \"candidateSelectionRetrieveActionResponse\" : \"candidateSelectionRetrieveActionResponse\",\n  \"candidateSelectionInstanceRecord\" : {\n    \"customerCampaignSelectionCriteria\" : \"customerCampaignSelectionCriteria\",\n    \"customerCampaignCandidateEmployeeBusinessUnitReference\" : \"783462\",\n    \"customerCampaignCandidateReference\" : \"749125\"\n  },\n  \"candidateSelectionRetrieveActionTaskReference\" : \"CSRATR714699\",\n  \"candidateSelectionInstanceReport\" : {\n    \"candidateSelectionInstanceReportRecord\" : { },\n    \"candidateSelectionInstanceReportType\" : \"candidateSelectionInstanceReportType\",\n    \"candidateSelectionInstanceReportParameters\" : \"candidateSelectionInstanceReportParameters\",\n    \"candidateSelectionInstanceReport\" : { }\n  }\n}", InlineResponse20011.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20011>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20011>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20014> retrieveCustomerCampaignProcedureExecution(@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "Execution Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId,@ApiParam(value = "Query params from schema '#/definitions/BQExecutionRetrieveInputModel'") @Valid @RequestParam(value = "queryparams", required = false) String queryparams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20014>(objectMapper.readValue("{\n  \"executionRetrieveActionResponse\" : \"executionRetrieveActionResponse\",\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"730537\",\n    \"customerCampaignProcedureResult\" : {\n      \"leadOpportunityProcedureInstanceReference\" : \"738783\",\n      \"customerCampaignProcedureLeadOpportunityDescription\" : \"customerCampaignProcedureLeadOpportunityDescription\"\n    },\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\",\n    \"customerCampaignConsumablesInventory\" : {\n      \"customerCampaignConsumableHolding\" : \"customerCampaignConsumableHolding\",\n      \"customerCampaignConsumableType\" : \"customerCampaignConsumableType\"\n    }\n  },\n  \"executionRetrieveActionTaskRecord\" : { },\n  \"executionInstanceReport\" : {\n    \"executionInstanceReportRecord\" : { },\n    \"executionInstanceReportType\" : \"executionInstanceReportType\",\n    \"executionInstanceReportParameters\" : \"executionInstanceReportParameters\",\n    \"executionInstanceReport\" : { }\n  },\n  \"executionInstanceRecord\" : {\n    \"customerCampaignProcedureWorkTaskType\" : \"customerCampaignProcedureWorkTaskType\",\n    \"customerCampaignProcedureWorkTaskDateTime\" : \"09-22-2018\",\n    \"customerCampaignProcedureWorkTaskResult\" : \"customerCampaignProcedureWorkTaskResult\",\n    \"customerCampaignProcedureWorkTaskDescription\" : \"customerCampaignProcedureWorkTaskDescription\",\n    \"customerCampaignProcedureWorkTaskWorkProducts\" : \"customerCampaignProcedureWorkTaskWorkProducts\",\n    \"documentDirectoryEntryInstanceReference\" : \"753368\"\n  },\n  \"executionInstanceAnalysis\" : {\n    \"executionInstanceAnalysisParameters\" : \"executionInstanceAnalysisParameters\",\n    \"executionInstanceAnalysisReport\" : { },\n    \"executionInstanceAnalysisReportType\" : \"executionInstanceAnalysisReportType\",\n    \"executionInstanceAnalysisRecord\" : { }\n  },\n  \"executionRetrieveActionTaskReference\" : \"ERATR734644\"\n}", InlineResponse20014.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20014>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20014>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> retrieveSDCustomerCampaignExecution(@ApiParam(value = "SDCustomerCampaignExecution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Query params from schema '#/definitions/SDCustomerCampaignExecutionRetrieveInputModel'") @Valid @RequestParam(value = "queryparams", required = false) String queryparams) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\n  \"serviceDomainRetrieveActionRecord\" : {\n    \"serviceDomainPerformanceAnalysis\" : {\n      \"performanceAnalysisReport\" : { },\n      \"performanceAnalysisReportType\" : \"performanceAnalysisReportType\",\n      \"performanceAnalysisResult\" : \"performanceAnalysisResult\",\n      \"performanceAnalysisReference\" : \"761670\"\n    },\n    \"controlRecordPortfolioAnalysis\" : {\n      \"controlRecordPortfolioAnalysisResult\" : \"controlRecordPortfolioAnalysisResult\",\n      \"controlRecordPortfolioAnalysisReportType\" : \"controlRecordPortfolioAnalysisReportType\",\n      \"controlRecordAnalysisReport\" : { },\n      \"controlRecordPortfolioAnalysisReference\" : \"739764\"\n    },\n    \"serviceDomainActivityAnalysis\" : {\n      \"activityAnalysisResult\" : \"activityAnalysisResult\",\n      \"activityAnalysisReportType\" : \"activityAnalysisReportType\",\n      \"activityAnalysisReport\" : { },\n      \"activityAnalysisReference\" : \"730230\"\n    }\n  },\n  \"serviceDomainRetrieveActionTaskReference\" : \"SRATR795161\",\n  \"serviceDomainRetrieveActionResponse\" : \"serviceDomainRetrieveActionResponse\",\n  \"serviceDomainRetrieveActionTaskRecord\" : { },\n  \"serviceDomainOfferedService\" : {\n    \"serviceDomainServiceReference\" : \"776158\",\n    \"serviceDomainServiceRecord\" : {\n      \"serviceDomainServiceDescription\" : \"serviceDomainServiceDescription\",\n      \"serviceDomainServiceType\" : \"serviceDomainServiceType\",\n      \"serviceDomainServiceVersion\" : \"serviceDomainServiceVersion\",\n      \"serviceDomainServicePoliciesandGuidelines\" : {\n        \"serviceDomainServiceEligibility\" : \"serviceDomainServiceEligibility\",\n        \"serviceDomainServiceIntendedUses\" : \"serviceDomainServiceIntendedUses\",\n        \"serviceDomainServicePricingandTerms\" : \"serviceDomainServicePricingandTerms\"\n      },\n      \"serviceDomainServiceSchedule\" : \"serviceDomainServiceSchedule\"\n    }\n  }\n}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> updateCustomerCampaignProcedure(@ApiParam(value = "Customer Campaign Procedure Request Payload" ,required=true )  @Valid @RequestBody Body4 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\n  \"customerCampaignProcedureUpdateActionTaskReference\" : \"CCPUATR708360\",\n  \"customerCampaignProcedureUpdateActionTaskRecord\" : { },\n  \"updateResponseRecord\" : { }\n}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20015> updateCustomerCampaignProcedureAnalysis(@ApiParam(value = "Analysis Request Payload" ,required=true )  @Valid @RequestBody Body15 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "Analysis Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20015>(objectMapper.readValue("{\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"760596\",\n    \"customerCampaignProcedureResult\" : {\n      \"leadOpportunityProcedureInstanceReference\" : \"711356\",\n      \"customerCampaignProcedureLeadOpportunityDescription\" : \"customerCampaignProcedureLeadOpportunityDescription\"\n    },\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\",\n    \"customerCampaignConsumablesInventory\" : {\n      \"customerCampaignConsumableHolding\" : \"customerCampaignConsumableHolding\"\n    }\n  },\n  \"analysisUpdateActionTaskReference\" : \"AUATR763899\",\n  \"analysisUpdateActionTaskRecord\" : { },\n  \"updateResponseRecord\" : { }\n}", InlineResponse20015.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20015>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20015>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2009> updateCustomerCampaignProcedureCandidateSelection(@ApiParam(value = "CandidateSelection Request Payload" ,required=true )  @Valid @RequestBody Body9 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "CandidateSelection Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("{\n  \"candidateSelectionUpdateActionTaskReference\" : \"CSUATR763477\",\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"771278\",\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\"\n  },\n  \"candidateSelectionUpdateActionTaskRecord\" : { },\n  \"updateResponseRecord\" : { },\n  \"candidateSelectionInstanceRecord\" : {\n    \"customerCampaignSelectionCriteria\" : \"customerCampaignSelectionCriteria\",\n    \"customerCampaignCandidateEmployeeBusinessUnitReference\" : \"740690\",\n    \"customerCampaignCandidateReference\" : \"709149\"\n  }\n}", InlineResponse2009.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2009>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20012> updateCustomerCampaignProcedureExecution(@ApiParam(value = "Execution Request Payload" ,required=true )  @Valid @RequestBody Body12 body,@ApiParam(value = "Customer Campaign Execution Servicing Session Reference",required=true) @PathVariable("sd-reference-id") String sdReferenceId,@ApiParam(value = "Customer Campaign Procedure Instance Reference",required=true) @PathVariable("cr-reference-id") String crReferenceId,@ApiParam(value = "Execution Instance Reference",required=true) @PathVariable("bq-reference-id") String bqReferenceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20012>(objectMapper.readValue("{\n  \"executionUpdateActionTaskRecord\" : { },\n  \"customerCampaignProcedureInstanceRecord\" : {\n    \"customerCampaignProcedureVersionNumber\" : \"customerCampaignProcedureVersionNumber\",\n    \"employeeBusinessUnitReference\" : \"785619\",\n    \"customerCampaignProcedureResult\" : {\n      \"leadOpportunityProcedureInstanceReference\" : \"744925\",\n      \"customerCampaignProcedureLeadOpportunityDescription\" : \"customerCampaignProcedureLeadOpportunityDescription\"\n    },\n    \"customerCampaignSchedule\" : \"customerCampaignSchedule\",\n    \"dateType\" : {\n      \"date\" : \"09-22-2018\"\n    },\n    \"customerCampaignProcedureSetup\" : \"customerCampaignProcedureSetup\",\n    \"customerCampaignType\" : \"customerCampaignType\",\n    \"customerCampaignDescription\" : \"customerCampaignDescription\",\n    \"customerCampaignConsumablesInventory\" : {\n      \"customerCampaignConsumableHolding\" : \"customerCampaignConsumableHolding\"\n    }\n  },\n  \"executionUpdateActionTaskReference\" : \"EUATR726917\",\n  \"updateResponseRecord\" : { },\n  \"executionInstanceRecord\" : {\n    \"customerCampaignProcedureWorkTaskType\" : \"customerCampaignProcedureWorkTaskType\",\n    \"customerCampaignProcedureWorkTaskDateTime\" : \"09-22-2018\",\n    \"customerCampaignProcedureWorkTaskResult\" : \"customerCampaignProcedureWorkTaskResult\",\n    \"customerCampaignProcedureWorkTaskDescription\" : \"customerCampaignProcedureWorkTaskDescription\",\n    \"customerCampaignProcedureWorkTaskWorkProducts\" : \"customerCampaignProcedureWorkTaskWorkProducts\",\n    \"documentDirectoryEntryInstanceReference\" : \"744707\"\n  }\n}", InlineResponse20012.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20012>(HttpStatus.NOT_IMPLEMENTED);
    }

}
