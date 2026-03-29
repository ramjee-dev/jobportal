package com.ramjee.jobportaldemo.contact.service;

import com.ramjee.jobportaldemo.dto.ContactRequestDto;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);

}
