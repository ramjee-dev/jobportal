package com.ramjee.jobportaldemo.contact.service;

import com.ramjee.jobportaldemo.dto.ContactRequestDto;
import com.ramjee.jobportaldemo.dto.ContactResponseDto;

import java.util.List;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);

    List<ContactResponseDto> fetchNewContactMsgs();

}
