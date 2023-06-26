package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("Local", "Apple", "Devoloper", 8500, true, true, true, true);
        offer2.setInfo("Kentucky", "Samsung", "Devoloper", 3500, false, false, false, false);
        offer3.setInfo("asgasg", "Microsoft", "QA", 5000, true, false, true, false);
        offer4.setInfo("saggsa", "SGGG", "BA", 5500, true, false, true, true);
        offer5.setInfo("Spain", "ESSG", "PM", 6322, true, true, true, true);
        offer6.setInfo("safsfa", "Pars", "Seller", 8500, true, true, true, false);
        offer7.setInfo("Netherlands", "Huawei", "Test", 2700, true, true, true, true);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();

        for (Offer each : myOffers) {
            if (each.isFullTime == true) {
                fullTimeOffers.add(each);
            }

        }

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.location.equals("Local"));
        System.out.println("localOffers = " + localOffers);


        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p -> !(p.hasBenefit == false && p.hasPTO == false));
        System.out.println(offersWithBenefits);

    }
}

/*
2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */