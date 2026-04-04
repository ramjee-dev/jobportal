package com.ramjee.jobportaldemo.contact.service;

import com.ramjee.jobportaldemo.dto.ContactRequestDto;
import com.ramjee.jobportaldemo.dto.ContactResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);

    List<ContactResponseDto> fetchNewContactMsgs();

    List<ContactResponseDto> fetchNewContactMsgsWithSort(String sortBy, String sortDir);

    Page<ContactResponseDto> fetchNewContactMsgsWithPaginationAndSort(int pageNumber, int pageSize,
                                                                      String sortBy, String sortDir);

}
