package starter.logon;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static Target PAGE_TITLE = Target.the("page title").locatedBy("//span[contains(text(),'Products')]");

    public static Target ITEM1_DESC = Target.the("item1 desc").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[1]/div[@class='inventory_item_description']/div/div[@class='inventory_item_desc']");
    public static Target ITEM1_NAME = Target.the("item1 name").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[1]/div[@class='inventory_item_description']/div/a/div[@class='inventory_item_name']");
    public static Target ITEM1_PRICE = Target.the("item1 price").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[1]/div[@class='inventory_item_description']/div[2]/div[@class='inventory_item_price']");
    public static Target ITEM1_ADD = Target.the("item1 add").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[1]/div[@class='inventory_item_description']//button[@id='add-to-cart-sauce-labs-backpack']");
    public static Target BIKE_TITLE = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target BIKE_PRICE = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target BIKE_TEXT = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target BIKE_ADD = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target TSHIRT_TITLE = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target TSHIRT_PRICE = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target TSHIRT_TEXT = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target TSHIRT_ADD = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target JACKET_TITLE = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target JACKET_PRICE = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target JACKET_TEXT = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");
    public static Target JACKET_ADD = Target.the("productpage title").locatedBy("//span[contains(text(),'Products')]");



}
