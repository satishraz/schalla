package anf.test.automation.janova.desktop;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import anf.page.HomePage;
import anf.page.desktop.CategoryPage;
import anf.page.desktop.DivisionPage;
import anf.page.desktop.ProductPage;
import anf.page.desktop.WishListPage;
import anf.test.BaseTest;
import anf.variable.Variables;

public class WishlistTest extends BaseTest{

	@BeforeMethod(alwaysRun=true)
	public void initializeDriver(ITestContext context, Method m) throws MalformedURLException {
		super.initializeDriver(context, m);
	}
	
	/*@Test
	public void WishLisTest() throws MalformedURLException, InterruptedException{
		HomePage homepage				= new HomePage(d);
		DivisionPage divisionPage		= homepage.goToDivisionPageOne();
		CategoryPage categoryPage		= divisionPage.clickOnCategory();
		ProductPage productPage			= categoryPage.clickOnProduct();
		productPage.getLinkWishList().click();
		productPage.addItemToWishList();
		productPage.getWishListLink().click();
		WishListPage wishlistPage		= new WishListPage(d);
		System.out.println(wishlistPage.getProductName().getText());
		System.out.println(wishlistPage.getProductColor().getText());
		System.out.println(wishlistPage.getProductSku().getText());
		System.out.println(wishlistPage.getProductSize().getText());
		System.out.println(wishlistPage.getProductListPrice().getText());
		System.out.println(wishlistPage.getProductOfferPrice().getText());
		ProductPage productPage2		= wishlistPage.clickOnProductImage();
		productPage2.getWishListLink().click();
		wishlistPage.locateElement(Variables.wishlist_btn_AddToBag).click();
	}*/

}
