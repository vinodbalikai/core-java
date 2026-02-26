class Cloth {

    static String brand;
    static String type;
    static String color;
    static String size;
    static String material;
    static int price;
    static String gender;
    static String season;
    static String pattern;
    static String fit;
    static String sleeveType;
    static String country;

    public static boolean createCloth(
            String g, String b, String t, String c,
            int p, String m, String s, String se,
            String f, String pa, String co, String sl) {
        boolean isCreated = false;
        boolean isBrandValid = false;
        boolean isTypeValid = false;
        boolean isColorValid = false;
        boolean isSizeValid = false;
        boolean isMaterialValid = false;
        boolean isPriceValid = false;
        boolean isGenderValid = false;
        boolean isSeasonValid = false;
        boolean isPatternValid = false;
        boolean isFitValid = false;
        boolean isSleeveValid = false;
        boolean isCountryValid = false;

        if (p > 0) {
            System.out.println("Accepted price value : " + p);
            price = p;
            isPriceValid = true;
        } else {
            System.out.println("Invalid price entered");
        }

        if (b != null && !b.isEmpty()) {
            System.out.println("Brand verified and saved : " + b);
            brand = b;
            isBrandValid = true;
        } else {
            System.out.println("Brand value incorrect");
        }

        if (t != null && !t.isEmpty()) {
            System.out.println("Cloth category validated : " + t);
            type = t;
            isTypeValid = true;
        } else {
            System.out.println("Type not valid");
        }

        if (c != null && !c.isEmpty()) {
            System.out.println("Color stored successfully : " + c);
            color = c;
            isColorValid = true;
        } else {
            System.out.println("Color information missing");
        }

        if (m != null && !m.isEmpty()) {
            System.out.println("Material confirmed : " + m);
            material = m;
            isMaterialValid = true;
        } else {
            System.out.println("Material details invalid");
        }

        if (s != null && !s.isEmpty()) {
            System.out.println("Selected size recorded : " + s);
            size = s;
            isSizeValid = true;
        } else {
            System.out.println("Size entry invalid");
        }

        if (g != null && !g.isEmpty()) {
            System.out.println("Gender classification saved : " + g);
            gender = g;
            isGenderValid = true;
        } else {
            System.out.println("Gender value missing");
        }

        if (se != null && !se.isEmpty()) {
            System.out.println("Season suitability verified : " + se);
            season = se;
            isSeasonValid = true;
        } else {
            System.out.println("Season information invalid");
        }

        if (pa != null && !pa.isEmpty()) {
            System.out.println("Pattern description added : " + pa);
            pattern = pa;
            isPatternValid = true;
        } else {
            System.out.println("Pattern entry incorrect");
        }

        if (f != null && !f.isEmpty()) {
            System.out.println("Fit style confirmed : " + f);
            fit = f;
            isFitValid = true;
        } else {
            System.out.println("Fit value invalid");
        }

        if (sl != null && !sl.isEmpty()) {
            System.out.println("Sleeve design stored : " + sl);
            sleeveType = sl;
            isSleeveValid = true;
        } else {
            System.out.println("Sleeve type not acceptable");
        }

        if (co != null && !co.isEmpty()) {
            System.out.println("Country of origin registered : " + co);
            country = co;
            isCountryValid = true;
        } else {
            System.out.println("Country information missing");
        }

        if (isBrandValid && isTypeValid && isColorValid &&
            isSizeValid && isMaterialValid && isPriceValid &&
            isGenderValid && isSeasonValid && isPatternValid &&
            isFitValid && isSleeveValid && isCountryValid) {

            System.out.println("Cloth creation completed successfully.\n");
            isCreated = true;
        } else {
            System.out.println("Cloth creation failed due to invalid data.\n");
        }
        return isCreated;
    }
    public static void getClothDetails() {
        System.out.println("Recently Stored Cloth");
        System.out.println("Brand Name : " + brand);
        System.out.println("Cloth Type : " + type);
        System.out.println("Color Option : " + color);
        System.out.println("Size Option : " + size);
        System.out.println("Fabric Used : " + material);
        System.out.println("Cost : " + price);
        System.out.println("Designed For : " + gender);
        System.out.println("Best Season : " + season);
        System.out.println("Design Pattern : " + pattern);
        System.out.println("Fit Category : " + fit);
        System.out.println("Sleeve Style : " + sleeveType);
        System.out.println("Made In : " + country);
    }
}