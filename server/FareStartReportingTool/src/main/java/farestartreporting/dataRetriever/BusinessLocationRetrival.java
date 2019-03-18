package farestartreporting.dataRetriever;

import farestartreporting.client.HTTPGetter;
import farestartreporting.responseModel.BusinessLocation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BusinessLocationRetrival {
    private HTTPGetter httpClient = new HTTPGetter();

    public BusinessLocation getReport(String name, int locationGroupID, String dateOfBusiness) throws IOException {


        BusinessLocation businessLocationData = httpClient.getBusinessLocationData(name, locationGroupID, dateOfBusiness);
        return businessLocationData;
    }
}