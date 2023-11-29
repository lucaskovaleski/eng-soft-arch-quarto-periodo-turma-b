package com.fag.pix_api_celcoin.infra.celcoin.mappers;

import com.fag.pix_api_celcoin.domain.dto.PhoneDTO;
import com.fag.pix_api_celcoin.infra.celcoin.dto.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {

    public static PhoneDTO toAppDTO(CelcoinPhoneDTO vendorDTO) {
        PhoneDTO appDTO = new PhoneDTO();

        appDTO.setStateCode(vendorDTO.getStateCode());
        appDTO.setCountryCode(vendorDTO.getCountryCode());
        appDTO.setNumber(vendorDTO.getNumber());

        return appDTO;
    }

    public static CelcoinPhoneDTO toVendorDTO(PhoneDTO appDTO) {
        CelcoinPhoneDTO vendorDTO = new CelcoinPhoneDTO();

        vendorDTO.setStateCode(appDTO.getStateCode());
        vendorDTO.setCountryCode(appDTO.getCountryCode());
        vendorDTO.setNumber(appDTO.getNumber());

        return vendorDTO;
    }
}