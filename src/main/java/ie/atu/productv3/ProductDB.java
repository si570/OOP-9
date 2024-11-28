package ie.atu.productv3;


import ie.atu.productv1.Book;

public class ProductDB {
    public static Product getProduct(String productCode) {

        Product myProduct = null;
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }


        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("tam has a cat")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Cat song");
            myMusic.setPrice(50.30);
            myMusic.setArtist("adam");
            myMusic.setLabel("vebeo");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("tarits")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("drug dealer");
            myMusic.setPrice(5.01);
            myMusic.setArtist("m marron");
            myMusic.setLabel("mpg");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("LG")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("85 inch cinematic screen");
            myTV.setPrice(900.00);
            myTV.setScreenSize(43);
            myTV.setManufacturer("LG Group inc");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("Samsung")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("100 inch screen full bright oled");
            myTV.setPrice(5060.00);
            myTV.setScreenSize(49);
            myTV.setManufacturer("samsung");
            myProduct = myTV;
        }


        return myProduct;
    }
}

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?//}


