package ua.skarb.service;

import ua.skarb.domain.Firm;
import ua.skarb.domain.LicenceView;

public interface IFirmService {

    Firm getFirmByLicence(LicenceView licenceView);
}
