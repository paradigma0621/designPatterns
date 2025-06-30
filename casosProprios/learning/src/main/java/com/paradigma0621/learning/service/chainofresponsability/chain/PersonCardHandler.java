package com.nexti.operationdesk.service.person.card.person.chain;

import com.nexti.operationdesk.dto.load.ReplacementRepositoryDto;
import com.nexti.operationdesk.dto.response.card.PersonsCardDto;
import com.nexti.operationdesk.enums.PersonConditionEnum;

public interface PersonCardHandler {
    void setNext(PersonCardHandler personCardHandler);
    PersonsCardDto handleRequest(Long mainPersonId, PersonConditionEnum personConditionEnum,
                                 ReplacementRepositoryDto replacementRepositoryDto);
}
