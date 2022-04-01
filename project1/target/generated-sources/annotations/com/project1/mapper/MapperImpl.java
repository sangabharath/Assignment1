package com.project1.mapper;

import com.project1.dto.ContactDto;
import com.project1.model.Contact;
import com.project1.model.Mobile;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-31T18:18:28+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
public class MapperImpl implements Mapper {

    @Override
    public Contact dtoToEntity(ContactDto contactDto) {
        if ( contactDto == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setContactId( contactDto.getContactId() );
        contact.setFirstName( contactDto.getFirstName() );
        contact.setLastName( contactDto.getLastName() );
        contact.setEmailAddress( contactDto.getEmailAddress() );
        contact.setCreatedBy( contactDto.getCreatedBy() );
        contact.setCreatedDate( contactDto.getCreatedDate() );
        contact.setUpdatedBy( contactDto.getUpdatedBy() );
        contact.setUpdatedDate( contactDto.getUpdatedDate() );
        contact.setIsActive( contactDto.getIsActive() );
        List<Mobile> list = contactDto.getMobile();
        if ( list != null ) {
            contact.setMobile( new ArrayList<Mobile>( list ) );
        }

        return contact;
    }

    @Override
    public ContactDto entityToDto(Contact contact) {
        if ( contact == null ) {
            return null;
        }

        ContactDto contactDto = new ContactDto();

        contactDto.setContactId( contact.getContactId() );
        contactDto.setFirstName( contact.getFirstName() );
        contactDto.setLastName( contact.getLastName() );
        contactDto.setEmailAddress( contact.getEmailAddress() );
        contactDto.setCreatedBy( contact.getCreatedBy() );
        contactDto.setCreatedDate( contact.getCreatedDate() );
        contactDto.setUpdatedBy( contact.getUpdatedBy() );
        contactDto.setUpdatedDate( contact.getUpdatedDate() );
        contactDto.setIsActive( contact.getIsActive() );
        List<Mobile> list = contact.getMobile();
        if ( list != null ) {
            contactDto.setMobile( new ArrayList<Mobile>( list ) );
        }

        return contactDto;
    }
}
