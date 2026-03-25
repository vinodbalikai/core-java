class ECommerce {
    String productNames[] = new String[26];
    int index;

    public boolean addProduct(String productName) {
        boolean isProductAdded = false;

        if (productName != null && !productName.isEmpty()) {
            productNames[index++] = productName;
            isProductAdded = true;
        } else {
            System.out.println("the product name entered is invalid");
        }

        return isProductAdded;
    }

    public void getProductNames() {
        System.out.println("The product names are:");
        for (String product : productNames) {
            System.out.println(product);
        }
    }
}