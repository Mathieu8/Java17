package nl.rijkswaterstaat.java17.mathieu.algebraicDataTypes;

public class ListingService {
    public String listingSellerName(Listing listing) {
        String result = "";
        if (listing instanceof DealerListing) {
            result = ((DealerListing)listing).getDealer();
        } else if (listing instanceof PersonListing) {
            result = ((PersonListing)listing).getPerson();
        }
        return result;
    }
}


class DealerListing extends Listing {
    private String dealer;

    public String getDealer() {
        return dealer;
    }
}
class PersonListing extends Listing {
    private String person;

    public String getPerson() {
        return person;
    }
}
