package starter.logon;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

    public static Target PAGE_TITLE = Target.the("page title").locatedBy("//span[contains(text(),'Products')]");
    public static Target PAGE_FOOTER = Target.the("page title").locatedBy("//div[@class = 'footer_copy']");
    public static Target PAGE_TWITTER = Target.the("page title").locatedBy("//ul[@class = 'social']/li[@class = 'social_twitter']/a");
    public static Target PAGE_FACEBOOK = Target.the("page title").locatedBy("//ul[@class = 'social']/li[@class = 'social_facebook']/a");
    public static Target PAGE_LINKEDIN = Target.the("page title").locatedBy("//ul[@class = 'social']/li[@class = 'social_linkedin']/a");

    public static Target ITEM1_DESC = Target.the("item1 desc").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[1]/div[@class='inventory_item_description']/div/div[@class='inventory_item_desc']");
    public static Target ITEM1_NAME = Target.the("item1 name").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[1]/div[@class='inventory_item_description']/div/a/div[@class='inventory_item_name']");
    public static Target ITEM1_PRICE = Target.the("item1 price").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[1]/div[@class='inventory_item_description']/div[2]/div[@class='inventory_item_price']");
    public static Target ITEM1_ADD = Target.the("item1 add").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[1]/div[@class='inventory_item_description']/div[2]/button");

    public static Target ITEM2_DESC = Target.the("item1 desc").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[2]/div[@class='inventory_item_description']/div/div[@class='inventory_item_desc']");
    public static Target ITEM2_NAME = Target.the("item1 name").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[2]/div[@class='inventory_item_description']/div/a/div[@class='inventory_item_name']");
    public static Target ITEM2_PRICE = Target.the("item1 price").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[2]/div[@class='inventory_item_description']/div[2]/div[@class='inventory_item_price']");
    public static Target ITEM2_ADD = Target.the("item1 add").locatedBy("//div[@id = 'inventory_container' and @class = 'inventory_container']/div[@class = 'inventory_list']/div[2]/div[@class='inventory_item_description']/div[2]/button");




}
